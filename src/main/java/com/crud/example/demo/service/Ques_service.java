package com.crud.example.demo.service;

import com.crud.example.demo.Model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Ques_service {
    static Model question = new Model(1,"Sample_question","Quest_Desc","Answer");
//    public static Model question = new Model(1,"Sample_question","Quest_Desc","Answer");

    @Autowired
    public Model Single_creation(){




        return question;
    }

}
