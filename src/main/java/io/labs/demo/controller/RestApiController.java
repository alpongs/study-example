package io.labs.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestApiController {

    /*
    @TODO Rest API
     */
    @GetMapping("/1")
    public String example1() {
        return "1";
    }

}
