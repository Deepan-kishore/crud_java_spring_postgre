package com.crud.example.demo.repository;

import com.crud.example.demo.Model.Model;
import org.springframework.data.repository.CrudRepository;

public interface repository extends CrudRepository<Model, Integer> {

}
