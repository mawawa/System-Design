package com.limko.System.Design;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class SystemDesignController {

    //lecture 1
    @RequestMapping("/")
    public ModelAndView home(){
        return new ModelAndView("index.html");
    }

    //lecture 2
    @RequestMapping("/requirementsAndUseCases")
    public ModelAndView requirementsAndUseCases(){
        return new ModelAndView("Requirements and Use cases.html");
    }

    //lecture 3
    @RequestMapping("/classModelsAndDiagrams")
    public ModelAndView classModelsAndDiagrams(){
        return new ModelAndView("Class Models and Diagrams.html");
    }

    //lecture 4
    @RequestMapping("/classDiagrams")
    public ModelAndView classDiagrams(){
        return new ModelAndView("Class Diagrams.html");
    }
}
