package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
public class RESTController {

    @GetMapping("/getFile")     //Type http://localhost:8080/getFile/?pathName=textfile
    public String getFile(@RequestParam String pathName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(pathName)));
    }
}