package com.lenz.tutorial.springcachehello;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


/**
 * Present class which imitate getting data from DB
 */
@Component
@Slf4j
public class Dao {

    public String getData() {
        /*immitate dalay to get data from db*/
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            log.warn("Sleep was interrupted: " + e);
            throw new RuntimeException(e);
        }

        /*get data from .txt*/
        Path path = Paths.get("src/main/resources/static/DataBase.txt");
        List<String> data = new ArrayList<>();
        try {
            data = Files.readAllLines(path);
        } catch (IOException e) {
            log.warn("Failed to read from file: " + e);
            throw new RuntimeException(e);
        }

        /*returning data to user*/
        return String.join(" ", data);
    }
}
