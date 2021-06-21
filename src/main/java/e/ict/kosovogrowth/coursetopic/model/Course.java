package e.ict.kosovogrowth.coursetopic.model;

import javax.persistence.*;

@Entity
public class Course {
    @Id
    private String id;//OOP21, OOP22, ICT21_1
    @Column(length = 20)
    private String name;
    private int year;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TOPIC_ID")
    private Topic topic;


    public Course() {

    }

    public Course(String id, String name, int year) {
        this.id = id;
        this.name = name;
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
