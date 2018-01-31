package com.sda.juniorjavajobfinder.groupproject.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Annoucement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "job_position")
    private String jobPosition;
    @Column(name = "job_description")
    private String jobDescription;
    private LocalDate date;
    @Column(name = "min_salary")
    private BigDecimal minSalary;
    @Column(name = "max_salary")
    private BigDecimal maxSalary;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;
    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;
    @ManyToOne
    @JoinColumn(name = "devskills_id")
    private Devskills devskills;
    @ManyToOne
    @JoinColumn(name = "recruiter_id")
    private User recruiter;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<User> applyingUsers;

}
