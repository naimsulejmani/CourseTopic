package e.ict.kosovogrowth.coursetopic.controllers;

import e.ict.kosovogrowth.coursetopic.model.Topic;
import e.ict.kosovogrowth.coursetopic.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Topic getTopic(@PathVariable int id) {
        return service.getTopic(id);
    }

}
