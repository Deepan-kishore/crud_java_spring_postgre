package com.crud.example.demo.service;

import com.crud.example.demo.Model.Model;
import com.crud.example.demo.repository.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Ques_service {
    static Model question = new Model(1,"Sample_question","Quest_Desc","Answer");
//    public static Model question = new Model(1,"Sample_question","Quest_Desc","Answer");

    @Autowired
    private repository repository;
    public List<Model> Single_creation(){

return (List<Model>) repository.findAll();


//        return question;
    }

    public Model create_model(Model model) {
        return repository.save(model);

    }

    public String delete_model(Integer id) {
        repository.deleteById(id);
        return "Deleted Successfully";
    }
    public String delete_all_model() {
        repository.deleteAll();
        return "Deleted All Successfully";
    }

    public Model update_model(Model model) {
       return repository.save(model);
    }
}
