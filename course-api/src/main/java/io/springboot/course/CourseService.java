package io.springboot.course;

import io.springboot.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepo courseRepo;

    public List<Course> getAllCourses(String id){

        List<Course> courses = new ArrayList<>();
        courseRepo.findByTopicId(id)
                .forEach(t -> courses.add(t));
        return courses;
    }

    public Course getCourse(String id){

        return courseRepo.findById(id).get();
    }

    public void addCourse(Course course) {

        courseRepo.save(course);
    }

    public void updateCourse(Course course) {
        courseRepo.save(course);
    }

    public void deleteCourse(String id) {
        courseRepo.deleteById(id);
    }
}
