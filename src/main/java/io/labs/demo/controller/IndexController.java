package io.labs.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

import io.labs.demo.dto.Music;
import io.labs.demo.service.ExampleService;

@Controller
public class IndexController {

    @Autowired
    ExampleService exampleService;
    /*
    @TODO html  html/main.html  /yaho
     */
    @GetMapping({"/index", "/"})
    public String index(Model model) {

        // TODO :: REST API  -> result : 배열.
        List<Music> music = exampleService.resultValue();
        model.addAttribute("data", music);
        return "index";
    }

}
