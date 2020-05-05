package com.infogen.samples.kubernetes.department.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/department")
public class MainController {

    @GetMapping
    public String getCompanies() {
        return "Infogen";
    }
}
