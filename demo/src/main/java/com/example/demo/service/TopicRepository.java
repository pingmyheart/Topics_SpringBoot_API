package com.example.demo.service;

import com.example.demo.model.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {
}
