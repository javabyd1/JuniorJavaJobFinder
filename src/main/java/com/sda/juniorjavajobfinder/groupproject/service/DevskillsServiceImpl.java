package com.sda.juniorjavajobfinder.groupproject.service;

import com.sda.juniorjavajobfinder.groupproject.interfaces.DevskillsService;
import com.sda.juniorjavajobfinder.groupproject.model.Devskills;
import com.sda.juniorjavajobfinder.groupproject.repository.DevskillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DevskillsServiceImpl implements DevskillsService {

    @Autowired
    private DevskillsRepository devskillsRepository;

    @Override
    public List<Devskills> getAllDevskills() {
        return devskillsRepository.findAll();
    }

    @Override
    public Devskills createDevskills(Devskills devskills) {
        return devskillsRepository.save(devskills);
    }

    @Override
    public Devskills updateDevskills(Devskills devskills) {
        return devskillsRepository.save(devskills);
    }

    @Override
    public void deleteDevskills(Devskills devskills) {
        devskillsRepository.delete(devskills);
    }
}
