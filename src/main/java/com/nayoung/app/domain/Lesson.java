package com.nayoung.app.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Lesson {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private int quota;

    @ManyToOne(fetch = FetchType.LAZY)
    private Course course;

    public void setCourse(Course course) {
        this.course = course;
        this.course.getLessons().add(this);
    }
}
