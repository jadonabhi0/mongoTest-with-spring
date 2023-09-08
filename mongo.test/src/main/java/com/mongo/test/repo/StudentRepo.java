package com.mongo.test.repo;/*
    @author jadon
*/

import com.mongo.test.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepo extends MongoRepository<Student, Integer> {

}
