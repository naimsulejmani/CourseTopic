package e.ict.kosovogrowth.coursetopic.controllers;

import e.ict.kosovogrowth.coursetopic.model.Course;
import e.ict.kosovogrowth.coursetopic.model.Topic;
import e.ict.kosovogrowth.coursetopic.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins = "https://e.ict.kosovo.growth")
//http://localhost:8080/topcis/1
@RestController
@RequestMapping(value = "topics")
public class TopicController {

    private final TopicService service;

    public TopicController(TopicService service) {
        this.service = service;
    }

    //URL dhe METODE
    //GET http://localhost:8080/topics
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Topic> getAllTopics() {
        //dhe me lidhe me sherbime
        return service.getTopics();
    }

    @GetMapping(value = "/{courseId}/courses")
    public ResponseEntity<List<Course>> getCourses(@PathVariable int courseId) {
        return null;
    }

    //GET http://localhost:8080/topics/4
    //@RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @GetMapping(value = "/{id}")
    public ResponseEntity<Topic> getTopic(@PathVariable int id) {
        //return service.getTopic(id);
        Topic topic = service.getTopic(id);

        if(topic!=null) return ResponseEntity.status(HttpStatus.OK).body(topic);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }
    //POST http://localhost:8080/topics
    //@RequestMapping(value = "", method = RequestMethod.POST)
    @PostMapping(value = "")
    public ResponseEntity<Topic> createTopic(@RequestBody Topic topic) {
        //return service.createTopic(topic);
        Topic newTopic = service.createTopic(topic);
        return ResponseEntity.status(HttpStatus.CREATED).body(newTopic);
    }


    //PUT http://localhost:8080/topics/1
    //@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @PutMapping("/{id}")
    public Topic updateTopic(@PathVariable int id, @RequestBody Topic topic) {
        if (topic.getId() == id) {
            return service.updateTopic(topic);
        }
        return null;
    }
    //DELETE http://localhost:8080/topics/1
    //@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @DeleteMapping("/{id}")
    public Topic deleteTopic(@PathVariable int id) {
        return service.deleteTopic(id);
    }

}
