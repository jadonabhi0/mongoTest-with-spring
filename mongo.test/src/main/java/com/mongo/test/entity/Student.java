package com.mongo.test.entity;/*
    @author jadon
*/

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@Document(collection = "student1")
public class Student {

//    @Id ObjectId databaseId;
    @Id
    private int id;

    private String name;

    private String address;

    private String college;
}
