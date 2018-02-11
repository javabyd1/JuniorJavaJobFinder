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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Announcement> getAddedAnnoucements() {
        return addedAnnoucements;
    }

    public void setAddedAnnoucements(List<Announcement> addedAnnoucements) {
        this.addedAnnoucements = addedAnnoucements;
    }

    public List<Announcement> getApplyingAnnoucements() {
        return applyingAnnoucements;
    }

    public void setApplyingAnnoucements(List<Announcement> applyingAnnoucements) {
        this.applyingAnnoucements = applyingAnnoucements;
    }

    public List<Devskills> getSkills() {
        return skills;
    }

    public void setSkills(List<Devskills> skills) {
        this.skills = skills;
    }
}
