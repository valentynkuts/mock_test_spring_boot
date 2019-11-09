package com.example.demo.controllers;

import com.example.demo.topic.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topic")
    public List<Topic> getAllTopics(){
        return Arrays.asList(
                new Topic("spring","Spring Framework", "Spring Framework Description"),
                new Topic("java","Core java", "Core java Description"),
                new Topic("javascript","Javascript", "Javascript Description")
        );
    }
    // return JSON on page
}
