package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SkillsController {

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String helloForm(){
        String html =
                "<form method = 'POST'>" +
                        "<h1 = 'Skills Tacker'>" +
                        "<h2 = 'We have a few skills we would like to learn'>" +
                        "<input type = 'text' name = 'name'>" +
                        "<select name = 'My favorite language'>" +
                        "<select name2 = 'My second favorite language'>" +
                        "<select name3 = 'My third favorite language'>" +
                        "<ol = 'english' English</ol>" +
                        "<ol = 'spanish' Spanish</ol>" +
                        "<ol = 'italian' Italian</ol>" +
                        "<select>" +
                        "<input type = 'submit' value='Submit'>" +
                        "</h1>" +
                        "</h2>" +
                        "</form>";
        return html;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String createMessage(@RequestParam String name, @RequestParam String language){
        if(name == null){
            name="World";
        }
        String favorite = "";
        if(language.equals("java")) {
            favorite = "Java";
        }else if(language.equals("javaScript")){
            favorite = "JavaScript";
        }else if(language.equals("python")){
            favorite = "Python";
        }
        return "<p style='color: blue; text-align: center;font-size: 30px;'>" + name + favorite.length();
    }


}
