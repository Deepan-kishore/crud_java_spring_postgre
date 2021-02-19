package com.crud.example.demo.controller;

import com.crud.example.demo.Model.Model;
import com.crud.example.demo.service.Ques_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class controller {

    @Autowired
    private  Ques_service ques;

    @GetMapping("/")
    public String healthCheck(){
        return "OK";
    }

@GetMapping("/read")
    public List<Model> Test(){
//         Model question = new Model(1,"Sample_question","Quest_Desc","Answer");
    return ques.Single_creation();
    }

    @PostMapping("/create")
    public Model Create( @RequestBody  Model model ){
        return ques.create_model(model);
    }

}