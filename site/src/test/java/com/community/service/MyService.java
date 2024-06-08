package com.community.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyService {

    @Autowired
    private MyRepository myRepository;

    public MyEntity findById(Long id) {
        Optional<MyEntity> entity = myRepository.findById(id);
        return entity.orElse(null);
    }
}

