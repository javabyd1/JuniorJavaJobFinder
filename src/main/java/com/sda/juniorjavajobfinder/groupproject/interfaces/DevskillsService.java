package com.sda.juniorjavajobfinder.groupproject.interfaces;

import com.sda.juniorjavajobfinder.groupproject.model.Devskills;

import java.util.List;

public interface DevskillsService {
    List<Devskills> getAllDevskills();
    Devskills createDevskills(Devskills devskills);
    Devskills updateDevskills(Devskills devskills);
    void deleteDevskills(Devskills devskills);
}
