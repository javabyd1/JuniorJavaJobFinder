package com.sda.juniorjavajobfinder.groupproject.interfaces;

import com.sda.juniorjavajobfinder.groupproject.model.Company;

import java.util.List;


public interface CompanyService {

    List<Company> getAllCompanies();
    Company createCompany(Company company);
    Company updateCompany(Company company);
    void deleteCompany(Company company);

}
