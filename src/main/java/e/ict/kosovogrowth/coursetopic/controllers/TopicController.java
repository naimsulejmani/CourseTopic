package e.ict.kosovogrowth.coursetopic.controllers;

import e.ict.kosovogrowth.coursetopic.model.Topic;
import e.ict.kosovogrowth.coursetopic.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//http://localhost:8080/topcis/1
@RestController
@RequestMapping(value = "topics")
public class TopicController {

    private final TopicService service;

    public TopicController(TopicService service) {
        this.service = service;
    }

    //URL dhe METODE
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Topic> getAllTopics() {
        //dhe me lidhe me sherbime
        return service.getTopics();
    }

    //@RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @GetMapping(value = "/{id}")
    public Topic getTopic(@PathVariable int id) {
        return service.getTopic(id);
    }

    //@RequestMapping(value = "", method = RequestMethod.POST)
    @PostMapping(value = "")
    public Topic createTopic(@RequestBody Topic topic) {
        return service.createTopic(topic);
    }

    //@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @PutMapping("/{id}")
    public Topic updateTopic(@PathVariable int id, @RequestBody Topic topic) {
        if (topic.getId() == id) {
            return service.updateTopic(topic);
        }
        return null;
    }

    //@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @DeleteMapping("/{id}")
    public Topic deleteTopic(@PathVariable int id) {
        return service.deleteTopic(id);
    }

}
