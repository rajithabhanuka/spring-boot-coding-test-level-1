package com.codejam.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "PERSONAL_INFORMATION", schema = "testdb")
public class PersonalInformationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "real_name")
    private String realName;

    @Column(name = "idol_name")
    private String idolName;

    @Column(name = "date_time")
    private String dateTime;

}
