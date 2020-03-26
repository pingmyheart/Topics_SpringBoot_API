package com.example.demo.controller;

import com.example.demo.model.Topic;
import com.example.demo.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TopicController {
    /*
    *       CONTROLLER WILL HAVE
    * GET /topics -> Get all topics
    * GET /topics/id -> Gets the topic
    * POST /topics -> Create new topic
    * PUT /topics/id -> Updates the topc
    * DELETE /topic/id -> Deletes the topic
    */

    @Autowired //marks to say that needs dependency injection
    private TopicService topicService;//used to create a singleton of TopicService Class

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        //this convert automaticly into a json response
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Optional<Topic> getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic){
        //the body will contains a json rapresentation of the topic
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
        //the body will contains a json rapresentation of the topic
        topicService.updateTopic(id, topic);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }
}
