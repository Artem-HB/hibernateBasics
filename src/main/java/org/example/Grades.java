package org.example;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Grades")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Grades {
    @Id
    private int id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "headTeacher")
    private Teacher teacher;
}
