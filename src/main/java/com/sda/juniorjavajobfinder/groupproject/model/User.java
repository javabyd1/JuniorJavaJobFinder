package com.sda.juniorjavajobfinder.groupproject.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "last_name")
    private String lastName;
    private String email;
    private String password;
    @Column(name = "phone_number")
    private String phoneNumber;
    private String role;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;
    @OneToMany(mappedBy = "recruiter", cascade = CascadeType.ALL)
    private List<Annoucement> addedAnnoucements;

    @ManyToMany(mappedBy = "applyingUsers")
    private List<Annoucement> applyingAnnoucements;
    @ManyToMany(mappedBy = "devUsers")
    private List<Devskills> skills;
}
