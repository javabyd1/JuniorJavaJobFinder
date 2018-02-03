package com.sda.juniorjavajobfinder.groupproject.service;

import com.sda.juniorjavajobfinder.groupproject.interfaces.CompanyService;
import com.sda.juniorjavajobfinder.groupproject.model.Company;
import com.sda.juniorjavajobfinder.groupproject.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public List<Company> getAllCompanies() {

        return companyRepository.findAll();
    }

    @Override
    public Company createCompany(Company company) {

        return companyRepository.save(company);
    }

    @Override
    public Company updateCompany(Company company) {

        return companyRepository.save(company);
    }

    @Override
    public void deleteCompany(Company company) {

        companyRepository.delete(company);
    }
}
