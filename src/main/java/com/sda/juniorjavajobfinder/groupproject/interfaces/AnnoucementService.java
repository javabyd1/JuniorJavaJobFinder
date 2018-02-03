package com.sda.juniorjavajobfinder.groupproject.interfaces;

import com.sda.juniorjavajobfinder.groupproject.model.Announcement;

import java.util.List;

public interface AnnoucementService {
    List<Announcement> getAllAnnoucement();
    Announcement createAnnoucement(Announcement annoucement);
    Announcement updateAnnoucement(Announcement annoucement);
    void deleteAnnoucement(Announcement annoucement);
}
