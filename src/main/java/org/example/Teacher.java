package org.example;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Teacher")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Teacher {
    @Id
    private int id;
    @Column(name = "fullName")
    private String name;
    @Column(name = "salary")
    private float salary;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "health")
    private Health health;
}
