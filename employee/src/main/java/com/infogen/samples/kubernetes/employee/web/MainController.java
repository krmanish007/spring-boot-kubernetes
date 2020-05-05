package com.infogen.samples.kubernetes.employee.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class MainController {

    @GetMapping
    public String getCompanies() {
        return "Infogen";
    }
}
