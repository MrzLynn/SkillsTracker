package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {

    @GetMapping("hello")
    @ResponseBody
    public String hello(){
        return "Hello, Spring!";
    }

//    @GetMapping("goodbye")
//
//    public String goodbye(){
//        return "Goodbye, Spring!";
//    }

    // Handles request of the form /hello?name=LaunchCode
//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})

//    public String helloWithQueryParam(@RequestParam String name){
//        return "Hello, " + name + "!";
//    }

    // Handles requests of the form /hello/LaunchCode

//    @GetMapping("{name}")
//
//    public String helloWithPathParam(@PathVariable String name){
//        return "Hello, " + name + "!";
//    }
    // Handles request of form

    @RequestMapping(method = RequestMethod.GET)
    public String helloForm(){
        return
                "<form method = 'POST'>" +
                "<input type = 'text' name = 'name'>" +
                "<select name = 'language'>" +
                "<option value = 'english' English</option>" +
                "<option value = 'spanish' Spanish</option>" +
                "<option value = 'italian' Italian</option>" +
                "<option value = 'french' French</option>" +
                "<option value = 'german' German</option>" +
                "<select>" +
                "<input type = 'submit' value='Greet me!'>" +
                "</form>";
    }
    @RequestMapping(method = RequestMethod.POST)
    public String createMessage(@RequestParam String name, @RequestParam String language){
        if(name == null){
            name="World";
        }
        String greeting = "";
        if(language.equals("english")) {
            greeting = "Hello, ";
        }else if(language.equals("spanish")){
            greeting = "Hola, ";
        }else if(language.equals("italian")){
            greeting = "Ciao, ";
        }else if(language.equals("french")){
            greeting = "Bonjour, ";
        }else if(language.equals("german")){
            greeting = "Hallo, ";
        }
        return greeting + name;
    }


}
