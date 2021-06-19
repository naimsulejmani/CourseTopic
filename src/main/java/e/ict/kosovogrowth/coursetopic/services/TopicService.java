package e.ict.kosovogrowth.coursetopic.services;

import e.ict.kosovogrowth.coursetopic.model.Topic;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {
    private static List<Topic> topics = new ArrayList<>();

    public TopicService() {
        Topic topic1 = new Topic(1, "Programming in Java", "Learn Java...", true,
                LocalDate.now());
        Topic topic2 = new Topic(2, "Programming in Android", "Learn Android...", true,
                LocalDate.now());
        Topic topic3 = new Topic(3, "Programming in Web", "Learn Web...", true,
                LocalDate.now());

        topics.add(topic1);
        topics.add(topic2);
        topics.add(topic3);
    }

    public List<Topic> getTopics() {
        return topics;
    }

    public Topic getTopic(int topicId) {
        Topic topic = topics.stream().filter(t -> t.getId() == topicId).findFirst().orElse(null);
        return topic;
    }

}
