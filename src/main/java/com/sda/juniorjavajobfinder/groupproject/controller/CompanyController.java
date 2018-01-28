package com.sda.juniorjavajobfinder.groupproject.controller;

import com.sda.juniorjavajobfinder.groupproject.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    private CompanyServiceImpl companyService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Company> getAllCompany(){
        return companyService.getAllCompany();
    }
    @RequestMapping(value = "/addnewcompany", method = RequestMethod.POST)
    public void saveCompany(@RequestBody Company company){
        companyService.saveCompany(company);
    }
    @GetMapping(value = "{id}")
    public ResponseEntity<Company>getCompanyId(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK)
                .company(companyService.getCompanyById(id));
    }

}
