package com.sda.juniorjavajobfinder.groupproject;

import com.sda.juniorjavajobfinder.groupproject.interfaces.AnnoucementService;
import com.sda.juniorjavajobfinder.groupproject.model.Annoucement;
import com.sda.juniorjavajobfinder.groupproject.model.City;
import com.sda.juniorjavajobfinder.groupproject.model.Company;
import com.sda.juniorjavajobfinder.groupproject.service.CompanyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootApplication
public class GroupProjectApplication implements CommandLineRunner {

    @Autowired
    CompanyServiceImpl companyService;
    @Autowired
    AnnoucementService annoucementService;

    public static void main(String[] args) {
        SpringApplication.run(GroupProjectApplication.class, args);

    }


    @Override
    public void run(String... strings) throws Exception {

        Company company = new Company();
        company.setCity("Bydgoszcz");
        company.setName("Atos");
        companyService.createCompany(company);

        for (Annoucement annoucement : annoucementService.getAllAnnoucement()) {
            annoucement.setDate(LocalDate.now());
            annoucementService.updateAnnoucement(annoucement);
        }
    }
}
