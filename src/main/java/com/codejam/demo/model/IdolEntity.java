package com.codejam.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "idol", schema = "testdb")
public class IdolEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="user_id")
    private UserEntity user;

    @Column(name = "title")
    private String title;

    @Column(name = "schedule")
    private LocalDateTime schedule;

    @Column(name = "revenues")
    private Double revenues;

    @Column(name = "status")
    private boolean status;
}
