package e.ict.kosovogrowth.coursetopic.repository;

import e.ict.kosovogrowth.coursetopic.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, String> {

}
