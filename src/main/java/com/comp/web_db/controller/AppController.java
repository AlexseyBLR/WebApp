package com.comp.web_db.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class AppController {


    @RequestMapping(value = "/SecondPage", method = RequestMethod.GET)
    public String goToSecond(Model ui) {
        ui.addAttribute("user", "name");
        return "SecondPage";
    }

    @RequestMapping(value = "/ThirdPage", method = RequestMethod.GET)
    public String goToThird(Model ui) {
        ui.addAttribute("user", "name");
        return "ThirdPage";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String goToHome(Model ui) {
        ui.addAttribute("user", "name");
        return "home";
    }


//    @RequestMapping(value="user/list/id/{id}", method= RequestMethod.GET,produces="text/json")
//    @ResponseStatus(HttpStatus.OK)
//    @ResponseBody
//    public String userListJson(Model ui, @PathVariable("id") Long id)
//    {
//        return "{id:"+id.toString()+"}";
//    }
//
//    @RequestMapping(method = RequestMethod.GET)
//    public String main(Model model){
//        return "user/list";
//    }
}
