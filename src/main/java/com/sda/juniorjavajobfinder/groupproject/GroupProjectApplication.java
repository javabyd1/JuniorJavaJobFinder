package com.sda.juniorjavajobfinder.groupproject;

import com.sda.juniorjavajobfinder.groupproject.interfaces.AnnouncementService;
import com.sda.juniorjavajobfinder.groupproject.model.Announcement;
import com.sda.juniorjavajobfinder.groupproject.service.CompanyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class GroupProjectApplication implements CommandLineRunner {

    @Autowired
    CompanyServiceImpl companyService;
    @Autowired
    AnnouncementService annoucementService;

    public static void main(String[] args) {
        SpringApplication.run(GroupProjectApplication.class, args);

    }


    @Override
    public void run(String... strings) throws Exception {

        for (Announcement announcement : annoucementService.getAllAnnouncement()) {
            announcement.setDate(LocalDate.now());
            annoucementService.updateAnnouncement(announcement);
        }
    }
}
