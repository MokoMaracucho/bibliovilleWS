package com.oc.bibliovilleWS.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsersController {

    @GetMapping("/users")
    public String getUser() {
        return "test";
    }

    @PostMapping()
    public String createUser() {
        return "HTTP POST request was sent";
    }

    @DeleteMapping()
    public String deleteUser() {
        return "HTTP DELETE request was sent";
    }

    @PutMapping()
    public String updateUser() {
        return "HTTP PUT request was sent";
    }
}
