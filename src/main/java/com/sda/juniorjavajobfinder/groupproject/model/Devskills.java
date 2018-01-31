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
    private Long id;
    private String area;
    private String name;

    @OneToMany(mappedBy = "devskills", cascade = CascadeType.ALL)
    private List<Annoucement> annoucements;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<User> devUsers;
}
