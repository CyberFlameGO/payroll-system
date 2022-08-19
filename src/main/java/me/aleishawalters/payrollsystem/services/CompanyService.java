package me.aleishawalters.payrollsystem.services;

import me.aleishawalters.payrollsystem.exceptions.CompanyCodeDuplicateException;
import me.aleishawalters.payrollsystem.models.Company;
import me.aleishawalters.payrollsystem.repositories.CompanyRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyService
{
    private CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public Company createCompany(Company company) throws CompanyCodeDuplicateException
    {
        List<Company> companiesWithSameCode = this.companyRepository.findByCompanyCode(company.getCompanyCode());

        if(!companiesWithSameCode.isEmpty())
        {
            throw new CompanyCodeDuplicateException(company.getCompanyCode());
        }

        this.companyRepository.save(company);
        return company;
    }

    public List<Company> getCompanies()
    {
        List<Company> companies = new ArrayList<Company>();

        Iterable<Company> companyIterable = this.companyRepository.findAll();

        for (Company company : companyIterable) {
            companies.add(company);
        }

        return companies;
    }
}
