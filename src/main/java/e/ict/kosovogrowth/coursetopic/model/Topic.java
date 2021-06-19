package e.ict.kosovogrowth.coursetopic.model;
//model ose entity package


import java.time.LocalDate;

public class Topic {
    private int id;
    private String name;
    private String description;
    private boolean isActive;
    private LocalDate registrationDate;

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
