package com.sda.juniorjavajobfinder.groupproject.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    @Column(name = "id")
    private Long id;
    private String name;
    @Column(name = "last_name")
    private String lastName;
    private String email;
    private String password;
    @Column(name = "phone_number")
    private String phoneNumber;
    private String role;
    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;
    @JsonBackReference
    @OneToMany(mappedBy = "recruiter", cascade = CascadeType.ALL)
    private List<Announcement> addedAnnoucements;
    @JsonBackReference
    @ManyToMany(mappedBy = "applyingUsers")
    private List<Announcement> applyingAnnoucements;
    @JsonBackReference
    @ManyToMany(mappedBy = "devUsers")
    private List<Devskills> skills;
}
