package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class CDController {

    @GetMapping(path = "/")
    public String hello() {
        return "Hva tror dere intensjonen til han første som melket en ku var?";
    }

}