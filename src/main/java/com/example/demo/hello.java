/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author jgajardog
 */
@Controller
@RequestMapping("/hello")
public class hello {

    @GetMapping
    public ResponseEntity<String> ping(HttpServletRequest request) {
        return ResponseEntity.status(HttpStatus.OK).body("HTTP OK");
    }
}
