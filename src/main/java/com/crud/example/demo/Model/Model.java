package com.crud.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Model {
    @Id
    private int id;

    private String question;
    private String ques_desc;
    private String ans;

    public Model(int id, String question, String ques_desc, String ans) {
        this.id = id;
        this.question = question;
        this.ques_desc = ques_desc;
        this.ans = ans;
    }

public Model(){ }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getQues_desc() {
        return ques_desc;
    }

    public void setQues_desc(String ques_desc) {
        this.ques_desc = ques_desc;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }
}
