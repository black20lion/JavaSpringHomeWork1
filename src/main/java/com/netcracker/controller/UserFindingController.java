package com.netcracker.controller;

import com.netcracker.model.Userfound;
import com.netcracker.services.UserFindingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import javax.validation.Valid;
import java.util.Date;

@Controller
public class UserFindingController {

    //some bad practice, don't hit me, please
    public static Userfound currentUser;

    @Autowired
    UserFindingService userFindingService;

    @GetMapping("/finduser")
    public String userFoundForm(Model model) {
        model.addAttribute("userfound", new Userfound());
        return "finduser";
    }

    @PostMapping("/finduser")
    public String findUserSubmit
            (
                    @Valid
                    @ModelAttribute
                            Userfound userfound,
             BindingResult bindingResult, @RequestHeader(value = "User-Agent") String userAgent
            ) {

        if (bindingResult.hasErrors()) {
            return "finduser";
        }
        else {
            String result = userFindingService.findUser(userfound);

            if (result.equals("User does not found")) {
                return "userDoesNotFound";
            } else {
                userfound.setEverything(result.split("[|]"));
                userfound.setCurrentDate(new Date().toString());
                userfound.setUserAgent(userAgent);
                currentUser = userfound;
                return "userisfound";
            }
        }
    }
}

