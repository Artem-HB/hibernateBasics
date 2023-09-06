package org.example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
public class Heath {
    @Id
    private int id;
    @Column(name = "date")
    private String date;
    @Column(name = "status")
    private String status;
}
