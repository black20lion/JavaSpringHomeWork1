package com.netcracker.services;

import com.netcracker.model.Userfound;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@Component
public class UserFindingService {
    String fileName = "/Users/mac/IdeaProjects/JavaSpringHomeWork/src/users.txt";

    public String findUser(Userfound userFound) {
        try {
            String[] users = readUsingBufferedReader(fileName).split("\n");
            for (int i = 0; i < users.length; i++) {
                String[] currentUser = users[i].split("[|]");
                if (currentUser[0].equals(userFound.getSecondNameFound()) && currentUser[1].equals(userFound.getFirstNameFound())) {
                    return users[i];
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return "User does not found";
    }

    private static String readUsingBufferedReader(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line = null;
        StringBuilder stringBuilder = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
            stringBuilder.append('\n');
        }
        return stringBuilder.toString();
    }
}