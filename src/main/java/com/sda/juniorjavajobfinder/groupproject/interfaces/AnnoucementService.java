package com.sda.juniorjavajobfinder.groupproject.interfaces;

import com.sda.juniorjavajobfinder.groupproject.model.Annoucement;

import java.util.List;

public interface AnnoucementService {
    List<Annoucement> getAllAnnoucement();
    Annoucement createAnnoucement(Annoucement annoucement);
    Annoucement updateAnnoucement(Annoucement annoucement);
    void deleteAnnoucement(Annoucement annoucement);
}
