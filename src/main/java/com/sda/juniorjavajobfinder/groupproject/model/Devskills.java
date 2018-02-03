package com.sda.juniorjavajobfinder.groupproject.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Devskills {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String area;
    private String name;

    @OneToMany(mappedBy = "devskills", cascade = CascadeType.ALL)
    private List<Announcement> annoucements;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<User> devUsers;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Announcement> getAnnoucements() {
        return annoucements;
    }

    public void setAnnoucements(List<Announcement> annoucements) {
        this.annoucements = annoucements;
    }

    public List<User> getDevUsers() {
        return devUsers;
    }

    public void setDevUsers(List<User> devUsers) {
        this.devUsers = devUsers;
    }
}
