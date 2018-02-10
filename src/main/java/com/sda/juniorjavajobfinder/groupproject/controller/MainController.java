package com.sda.juniorjavajobfinder.groupproject.controller;

import com.sda.juniorjavajobfinder.groupproject.model.Announcement;
import com.sda.juniorjavajobfinder.groupproject.model.Company;
import com.sda.juniorjavajobfinder.groupproject.service.AnnouncementServiceImpl;
import com.sda.juniorjavajobfinder.groupproject.service.CityServiceImpl;
import com.sda.juniorjavajobfinder.groupproject.service.CompanyServiceImpl;
import com.sda.juniorjavajobfinder.groupproject.service.DevskillsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    private CompanyServiceImpl companyService;
    @Autowired
    private CityServiceImpl cityService;
    @Autowired
    private DevskillsServiceImpl devskillsService;
    @Autowired
    private AnnouncementServiceImpl announcementService;

    @GetMapping("/announcements/{name}")
    public ResponseEntity<List<Announcement>> findAnnouncementBySkills(@PathVariable(value = "name") String name) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(announcementService.getDevskillsByName(name));
    }

    @GetMapping("/announcements/{devName}/{cityName}")
    public ResponseEntity<List<Announcement>> findAnnouncementBySkillsAndCities(@PathVariable(value ="devName") String devName, @PathVariable(value = "cityName" ) String cityName){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(announcementService.getOffersByDevskillsAndCities(devName,cityName));
    }

    @GetMapping(value = "")
    public ModelAndView home() {
        ModelAndView model = new ModelAndView();
        model.addObject("cities", cityService.getAllCity());
        model.addObject("devskills", devskillsService.getAllDevskills());
        model.setViewName("home");
        return model;
    }

    @GetMapping(value = "company")
    public ModelAndView showCompanies() {
        ModelAndView model = new ModelAndView();
        model.addObject("companies", companyService.getAllCompanies());
        model.setViewName("company");

        return model;
    }

    @GetMapping(value = "announcement")
    public ModelAndView showAnnoucements() {
        ModelAndView model = new ModelAndView();
        model.addObject("announcements", announcementService.getAllAnnouncement());
        model.setViewName("announcement");
        return model;
    }

    @RequestMapping(value = "/addnewcompany", method = RequestMethod.POST)
    public void saveCompany(@RequestBody Company company) {
        companyService.createCompany(company);
    }
//    @GetMapping(value = "{id}")
//    public ResponseEntity<Company>getCompanyId(@PathVariable int id){
//        return ResponseEntity.status(HttpStatus.OK)
//                .company(companyService.getCompanyById(id));
//    }

}
