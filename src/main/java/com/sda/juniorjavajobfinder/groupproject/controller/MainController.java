package com.sda.juniorjavajobfinder.groupproject.controller;

import com.sda.juniorjavajobfinder.groupproject.model.Company;
import com.sda.juniorjavajobfinder.groupproject.service.AnnoucementServiceImpl;
import com.sda.juniorjavajobfinder.groupproject.service.CityServiceImpl;
import com.sda.juniorjavajobfinder.groupproject.service.CompanyServiceImpl;
import com.sda.juniorjavajobfinder.groupproject.service.DevskillsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @Autowired
    private CompanyServiceImpl companyService;
    @Autowired
    private CityServiceImpl cityService;
    @Autowired
    private DevskillsServiceImpl devskillsService;
    @Autowired
    private AnnoucementServiceImpl annoucementService;

    @GetMapping(value = "")
    public ModelAndView home(){
        ModelAndView model= new ModelAndView();
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
    @GetMapping(value = "annoucement")
    public ModelAndView showAnnoucements(){
        ModelAndView model = new ModelAndView();
//        model.addObject("annoucements", annoucementService.getAllAnnoucement());

        model.setViewName("annoucement");

        return model;
    }


    @RequestMapping(value = "/addnewcompany", method = RequestMethod.POST)
    public void saveCompany(@RequestBody Company company){
        companyService.createCompany(company);
    }
//    @GetMapping(value = "{id}")
//    public ResponseEntity<Company>getCompanyId(@PathVariable int id){
//        return ResponseEntity.status(HttpStatus.OK)
//                .company(companyService.getCompanyById(id));
//    }

}
