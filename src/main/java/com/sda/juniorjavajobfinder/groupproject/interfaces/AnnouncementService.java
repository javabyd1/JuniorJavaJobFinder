package com.sda.juniorjavajobfinder.groupproject.interfaces;

import com.sda.juniorjavajobfinder.groupproject.model.Announcement;

import java.util.List;

public interface AnnouncementService {
    List<Announcement> getAllAnnouncement();
    Announcement createAnnouncement(Announcement announcement);
    Announcement updateAnnouncement(Announcement announcement);
    void deleteAnnouncement(Announcement announcement);

}
