package me.aleishawalters.payrollsystem.services;

import me.aleishawalters.payrollsystem.models.Company;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {
    public Company createCompany(Company company){
        company.setId(500);
        return company;
    }
}
