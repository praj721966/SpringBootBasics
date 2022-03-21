package com.csi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class ApplicationController {

    @GetMapping
    public String sayWelcome()
    {
        return "WELCOME TO FINTECH CSI";
    }
    @GetMapping("/service")
    public String sayServices()
    {
        return "SOFTWARE DEVELOPMENT SERVICES";
    }
}
