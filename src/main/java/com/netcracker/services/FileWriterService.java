package com.netcracker.services;

import com.netcracker.model.User;
import org.springframework.stereotype.Component;


import java.io.FileWriter;
import java.io.IOException;

@Component
public class FileWriterService {

    public FileWriterService() {

    }

    public void writeNewUser(User user) {
        String text = user.getSecondName() + "|" + user.getFirstName() + "|" +
                user.getPatronymic() + "|" + user.getAge() + "|" +
                user.getSalary() + "|" + user.geteMail() + "|" + user.getWorkplace() + '\n';

        try  (FileWriter writer = new FileWriter("src/users.txt", true))
        {

            writer.write(text);
            writer.flush();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
