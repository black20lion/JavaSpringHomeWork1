package com.netcracker.controller;

import com.netcracker.model.Email;
import com.netcracker.services.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmailController {

    @Autowired
    EmailSenderService emailSenderService;

    @GetMapping("/email")
    public String emailForm(Model model) {
        //bad practice, I'm tired a little
        model.addAttribute("email", new Email().setTo(UserFindingController.currentUser.geteMail()));
        return "email";
    }

    @PostMapping("/email")
    public String emailSubmit(@ModelAttribute Email email) {
        //bad practice, I'm tired a little
        email.setTo(UserFindingController.currentUser.geteMail());
        emailSenderService.sendSimpleEmail(email.getTo(),
                email.getBody(), email.getSubject());
        return "emailissend";
    }

}
