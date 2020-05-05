package com.infogen.samples.kubernetes.company.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/company")
public class MainController {

    @Value("${my.application.name}")
    private String name;

    private static final Integer counter = new Random().nextInt();

    @GetMapping
    public String getCompanies() throws InterruptedException {
        System.out.println("name = " + name);
        TimeUnit.SECONDS.sleep(1);
        return String.format("Infogen App Number [%s] Name [%s]", counter, name);
    }
}
