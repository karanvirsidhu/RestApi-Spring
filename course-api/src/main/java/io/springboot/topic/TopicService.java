package io.springboot.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepo topicRepo;

    public List<Topic> getAllTopics(){

        List<Topic> topic = new ArrayList<>();
        topicRepo.findAll().forEach(t -> topic.add(t));
        return topic;
    }

    public Topic getTopic(String id){

        return topicRepo.findById(id).get();
    }

    public void addTopic(Topic topic) {

        topicRepo.save(topic);
    }

    public void updateTopic(Topic topic, String id) {
        topicRepo.save(topic);
    }

    public void deleteTopic(String id) {
        topicRepo.deleteById(id);
    }
}
