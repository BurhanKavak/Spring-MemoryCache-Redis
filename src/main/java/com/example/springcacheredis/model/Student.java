package com.example.springcacheredis.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("students")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {


    @Id
    private Long id;

    private String name;

    private int schoolNumber;

    private String branch;

}
