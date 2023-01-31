package edu.school21.cinema.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "hall")
public class HallModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "h_id", nullable = false)
    private Long id;

    @Column(name = "seats_num", nullable = false)
    private int seatsNumber;
}
