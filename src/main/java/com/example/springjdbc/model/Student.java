package com.example.springjdbc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "student")
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @OneToOne(targetEntity = Avatar.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "avatar_id")
    private Avatar avatar;

    @OneToMany(targetEntity = EMail.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "student_id")
    private List<EMail> emails;

    @ManyToMany(targetEntity = Course.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "student_courses", joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id"))
    private List<Course> courses;
}
