package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {

    @GetMapping("hello")
    @ResponseBody
    public String hello(){
        return "Hello, Spring!";
    }

    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String helloWithPathParam(@RequestParam String name, Model model){
        String greeting = "Hello" + name + "!";
        model.addAttribute("greeting",greeting);
        return "hello";
}
    @GetMapping("hello/{name}")
    public String helloAgain(@PathVariable String name, Model model){
        model.addAttribute("greeting","Hello" + name + "!");
        return "hello";
    }
    // Handles request of form

    @GetMapping("form")
    public String helloForm(){
        return "form";
    }

    @RequestMapping(method = RequestMethod.POST)
//    public String createMessage(@RequestParam String name, @RequestParam String language){
//        if(name == null){
//            name="World";
//        }
//        String greeting = "";
//        if(language.equals("english")) {
//            greeting = "Hello, ";
//        }else if(language.equals("spanish")){
//            greeting = "Hola, ";
//        }else if(language.equals("italian")){
//            greeting = "Ciao, ";
//        }else if(language.equals("french")){
//            greeting = "Bonjour, ";
//        }else if(language.equals("german")){
//            greeting = "Hallo, ";
//        }
//        return greeting + name;
//    }
    @GetMapping("hello-names")
    public String helloNames(Model model){
        List<String> names = new ArrayList<>();
        names.add("LaunchCode");
        names.add("Java");
        names.add("JavaScript");
        model.addAttribute("names", names);
        return "hello-names";
    }


}
