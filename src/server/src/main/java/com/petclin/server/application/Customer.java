package com.petclin.server.appllication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customer")
public class Customer {
    @GetMapping
    public String getCustomer() {
        return "Hello World";
    }
}
