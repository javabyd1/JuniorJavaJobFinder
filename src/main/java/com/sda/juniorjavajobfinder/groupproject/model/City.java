package com.sda.juniorjavajobfinder.groupproject.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String region;

    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL)
    private List<Annoucement> annoucements;
}
