package com.vladproduction.processor;

import com.vladproduction.converter.Converter;
import com.vladproduction.dao.Dao;
import com.vladproduction.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;


public class Processor {

    private Dao dao;

    private Converter converter;

    //no need any constructor
    public Processor(Dao dao, Converter converter){
        this.dao = dao;
        this.converter = converter;

    }

    public void init(){
        System.out.println("processor.init");
    }

    public String process(){
        List<Person> personList = dao.findAll();
        return converter.convert(personList);
    }

    public void destroy(){
        System.out.println("processor.destroy");
    }

}