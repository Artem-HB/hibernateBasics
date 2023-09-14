package org.example;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "FinalMark")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FinalMark {
    @Id
    private int id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student")
    private Student student;
    @Column(name = "description")
    private String description;
    @Column(name = "mark")
    private int mark;
}
