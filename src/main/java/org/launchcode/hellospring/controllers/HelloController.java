package org.launchcode.hellospring.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {

//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }

    @GetMapping("goodbye")
    public String goodbye() {
        return "Goodbye, Spring!";
    }

//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
//    public String helloWithQueryParam(@RequestParam String name) {
//        return "Hello, " + name + "!";
//    }

    @GetMapping("{name}")
    public String helloWithPathParam(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    static String greetingLanguage(@RequestParam String name, String language) {
        return language + " " + name;
    }

    @GetMapping("form")
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form action='/hello' method='post'>" +
                "<input type='text' name='name'>" +
                "<label for='greetingLanguage'> Language </label>" +
                "<select name='language' id='greetingLanguage'>" +
                    "<option value='Hello'>English</option>" +
                    "<option value='Hola'>Spanish</option>" +
                    "<option value='Bonjour'>French</option>" +
                    "<option value='Hallo'>German</option>" +
                    "<option value='Nihao'>Chinese</option>" +
                "</select>" +
                "<input type='submit' value='Greet Me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }



}
