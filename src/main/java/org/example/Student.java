package org.example;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Student")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student {
    @Id
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    private Grades grades;

    @Column(name = "fullName", length = 50)
    private String name;

    @Column(name = "mail", unique = false)
    private String mail;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "health")
    private Health health;


}
