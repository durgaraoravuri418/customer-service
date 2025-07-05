package com.smartboats.customerservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Customer
{
    @GetMapping("/getCustomers")
    public String getCustomers()
    {
        return "List of smartcustomers";
    }

}
