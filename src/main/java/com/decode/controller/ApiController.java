package com.decode.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequiredArgsConstructor
public class ApiController {

    @RequestMapping(value="/", method= RequestMethod.GET)
    public String helloWorld() {
        return "Hello World.";
    }

}
