package com.sda.juniorjavajobfinder.groupproject.controller;

import com.sda.juniorjavajobfinder.groupproject.model.Announcement;
import com.sda.juniorjavajobfinder.groupproject.model.Company;
import com.sda.juniorjavajobfinder.groupproject.model.User;
import com.sda.juniorjavajobfinder.groupproject.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Arrays;
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
    @Autowired
    private UserServiceImpl userService;


    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public ModelAndView registration() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user", new User());
        modelAndView.setViewName("register");
        return modelAndView;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ModelAndView storeUser(@Valid User user, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();
        User userExist = userService.findByEmail(user.getEmail());
        if (userExist != null) {
            bindingResult.rejectValue("email",
                    "error.user",
                    "Email jest już zajety");
        }
        if (bindingResult.hasErrors()) {
            modelAndView.setViewName("registration");
        } else {
            userService.saveUser(user);
            modelAndView.addObject("successMessage", "zarejestrowales sie");
        }
        return modelAndView;
    }

    @RequestMapping(value = "/addannouncement", method = RequestMethod.GET)
    public ModelAndView addingAnnouncement() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("announcement", new Announcement());
        modelAndView.addObject("cities", cityService.getAllCity());
        modelAndView.addObject("companylist", companyService.getAllCompanies());
        modelAndView.addObject("devskill",devskillsService.getAllDevskills());
        modelAndView.setViewName("addannouncement");
        return modelAndView;
    }

    @RequestMapping(value = "/addannouncement", method = RequestMethod.POST)
    public ModelAndView storeAnnouncement(@Valid Announcement announcement, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("addannouncement");
        announcementService.createAnnouncement(announcement);
        modelAndView.addObject("successMessage", "dodałeś ogłoszenie");
        return modelAndView;
    }

    @GetMapping("/announcements/{name}")
    public ResponseEntity<List<Announcement>> findAnnouncementBySkills(@PathVariable(value = "name") String name) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(announcementService.getDevskillsByName(name));
    }

    @GetMapping("/announcements/{devName}/{cityName}")
    public ResponseEntity<List<Announcement>> findAnnouncementBySkillsAndCities(@PathVariable(value = "devName") String devName, @PathVariable(value = "cityName") String cityName) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(announcementService.getOffersByDevskillsAndCities(devName, cityName));
    }

    @GetMapping(value = "")
    public ModelAndView home() {
        ModelAndView model = new ModelAndView();
        model.addObject("cities", cityService.getAllCity());
        model.addObject("devskills", devskillsService.getAllDevskills());
        model.addObject("announcement", new Announcement());
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
    public ModelAndView showAnnouncements() {
        ModelAndView model = new ModelAndView();
        model.addObject("announcements", announcementService.getAllAnnouncement());
        model.setViewName("announcement");
        return model;
    }

    @PostMapping(value = "resultannouncement")
    public ModelAndView resultAnnouncement(@RequestBody MultiValueMap<String, String> formParams) {
        ModelAndView model = new ModelAndView();
        List<String> list = Arrays.asList(formParams.getFirst("city.id").split(","));

        model.addObject("resultannouncement", announcementService.getCityOffersByDevskillsAndCities
                ((Long.valueOf(formParams.getFirst("devskills.id"))),
                        (Long.valueOf(formParams.getFirst("city.id")))));
        model.setViewName("searchannouncement");

        System.out.println(Long.valueOf(formParams.getFirst("devskills.id")));
        System.out.println(Long.valueOf(formParams.getFirst("city.id")));
        System.out.println(formParams);
        return model;
    }

    @RequestMapping(value = "/addnewcompany", method = RequestMethod.POST)
    public void saveCompany(@RequestBody Company company) {
        companyService.createCompany(company);
    }
}

