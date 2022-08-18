package me.aleishawalters.payrollsystem.services;

import me.aleishawalters.payrollsystem.models.Company;
import me.aleishawalters.payrollsystem.repositories.CompanyRepository;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

    private CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public Company createCompany(Company company){
        this.companyRepository.save(company);
        return company;
    }
}
