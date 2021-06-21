package e.ict.kosovogrowth.coursetopic.services;

import e.ict.kosovogrowth.coursetopic.model.Topic;
import e.ict.kosovogrowth.coursetopic.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {
    //@Autowired
    private final TopicRepository repository;//topicRepository
    //private static List<Topic> topics = new ArrayList<>();

    public TopicService(TopicRepository repository) {
        this.repository=repository;
//        Topic topic1 = new Topic(1, "Programming in Java", "Learn Java...", true,
//                LocalDate.now());
//        Topic topic2 = new Topic(2, "Programming in Android", "Learn Android...", true,
//                LocalDate.now());
//        Topic topic3 = new Topic(3, "Programming in Web", "Learn Web...", true,
//                LocalDate.now());
//
//        topics.add(topic1);
//        topics.add(topic2);
//        topics.add(topic3);
    }

    public List<Topic> getTopics() {
        List<Topic> results = repository.findAll();//SELECT * FROM dbo.topic AS t
        return results;
        //return topics;
    }

    public Topic getTopic(int topicId) {
        Topic result = repository.findById(topicId).orElse(null);//SELECT * FROM dbo.topic AS t WHERE t.Id=@topicID
        return result;
//        Topic topic = topics.stream().filter(t -> t.getId() == topicId).findFirst().orElse(null);
//        return topic;
    }

    public Topic createTopic(Topic topic) {
        Topic newTopic = repository.save(topic);
        return newTopic;
//        topics.add(topic);
//        return topic;
    }

    public Topic updateTopic(Topic topic) {
        Topic updateTopic = repository.save(topic);
        return updateTopic;
//        Topic updatedTopic = getTopic(topic.getId());
//        int index = topics.indexOf(updatedTopic);
//        topics.set(index, topic);
//        return topic;
    }

    public Topic deleteTopic(int topicId) {
        Topic deletedTopic = getTopic(topicId);
        repository.delete(deletedTopic);
        //repository.deleteById(topicId);
        return deletedTopic;

//        Topic deletedTopic = getTopic(topicId);
//        int index = topics.indexOf(deletedTopic);
//        topics.remove(index);
//        return deletedTopic;
    }


}
