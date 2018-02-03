package com.sda.juniorjavajobfinder.groupproject.service;

import com.sda.juniorjavajobfinder.groupproject.interfaces.AnnoucementService;
import com.sda.juniorjavajobfinder.groupproject.model.Annoucement;
import com.sda.juniorjavajobfinder.groupproject.repository.AnnoucementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnnoucementServiceImpl implements AnnoucementService {

    @Autowired
    private AnnoucementRepository annoucementRepository;

    @Override
    public List<Annoucement> getAllAnnoucement() {
        return annoucementRepository.findAll();
    }

    @Override
    public Annoucement createAnnoucement(Annoucement annoucement) {
        return annoucementRepository.save(annoucement);
    }

    @Override
    public Annoucement updateAnnoucement(Annoucement annoucement) {
        return annoucementRepository.save(annoucement);
    }

    @Override
    public void deleteAnnoucement(Annoucement annoucement) {
        annoucementRepository.delete(annoucement);
    }
}
