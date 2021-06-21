package e.ict.kosovogrowth.coursetopic.model;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

//TABELA - CLASS
@Entity
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TOPIC_ID")
    private int id;//autoincrement - identitet


    @Column(name = "TOPIC_NAME", length = 50, unique = true)
    private String name;
    @Column(name = "TOPIC_DESCRIPTION", length = 2000)
    private String description;
    private boolean isActive;
    private LocalDate registrationDate;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Course> courses;

    public Topic() {

    }

    public Topic(int id, String name, String description, boolean isActive, LocalDate registrationDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.isActive = isActive;
        this.registrationDate = registrationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }
}
