package com.crud.example.demo.controller;

import com.crud.example.demo.Model.Model;
import com.crud.example.demo.service.Ques_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class controller {

    @Autowired
    private  Ques_service ques;

    @GetMapping("/")
    public String healthCheck(){
        return "OK";
    }

@GetMapping("/mappingTest")
    public List<Model> Test(){

//         Model question = new Model(1,"Sample_question","Quest_Desc","Answer");
//    ques.Single_creation();
//    ques.Single_creation();
return ques.Single_creation();
//    return question;
    }

}
