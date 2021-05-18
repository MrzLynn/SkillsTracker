package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {
    @RequestMapping(value = "")
    @ResponseBody
    public String startSkills() {
        String html = "<h1 = 'Skills Tacker'>" +
                "<h2 = 'We have a few skills we would like to learn'>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>";
        return html;
    }

    @GetMapping(value = "form")
    @ResponseBody
    public String formSkills() {
        String html =
                "<form method = 'POST'>" +
                        "<input type = 'text' name = 'name'>" +
                        "<select name = 'firstChoice'>" +
                        "<option value = 'java' Java</option>" +
                        "<option value = 'javaScript' JavaScript</option>" +
                        "<option value = 'python' Python</option>" +
                        "<select name = 'secondChoice'>" +
                        "<option value = 'java' Java</option>" +
                        "<option value = 'javaScript' JavaScript</option>" +
                        "<option value = 'python' Python</option>" +
                        "<select name = 'thirdChoice'>" +
                        "<option value = 'java' Java</option>" +
                        "<option value = 'javaScript' JavaScript</option>" +
                        "<option value = 'python' Python</option>" +
                        "<select>" +
                        "<input type = 'submit' value='Submit' />" +
                        "</form>";
        return html;
    }

    @PostMapping(value = "form")
    @ResponseBody
    public String namePage(@RequestParam String name, @RequestParam String firstChoice, @RequestParam String secondChoice,
                           @RequestParam String thirdChoice){
        String html = "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + firstChoice + "</li>" +
                "<li>" + secondChoice + "</li>" +
                "<li>" + thirdChoice + "</li>" +
                "</ol>";
        return html;
    }



}
