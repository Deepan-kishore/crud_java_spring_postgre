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

//    Health Checkup
    @GetMapping("/")
    public String healthCheck(){
        return "OK";
    }

//    Read API
@GetMapping("/read")
    public List<Model> Test(){
//         Model question = new Model(1,"Sample_question","Quest_Desc","Answer");
    return ques.Single_creation();
    }

//    Create API
    @PostMapping("/create")
    public Model Create( @RequestBody  Model model ){
        return ques.create_model(model);
    }

    //    Delete API
    @DeleteMapping("/delete/{id}")
    public String Delete(@PathVariable Integer id){
        return ques.delete_model(id);
    }

    //    Delete All
    @DeleteMapping("/delete_all")
    public String Delete(){
        return ques.delete_all_model();
    }
    //Update
    @PutMapping("/update/{id}")
    public Model update( @RequestBody Model model ){
        return ques.update_model(model);
    }
}