package com.mongo.test.controller;/*
    @author jadon
*/

import com.mongo.test.entity.Student;
import com.mongo.test.repo.StudentRepo;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("student")
public class StudentController {

    @Autowired
    StudentRepo studentRepo;

    @PostMapping("/add")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        Student student1 = studentRepo.save(student);
        return ResponseEntity.ok(student1);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Student>> getAllStudent(){
        List<Student> list = studentRepo.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }


}
