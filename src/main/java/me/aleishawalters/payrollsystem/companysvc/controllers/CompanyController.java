package me.aleishawalters.payrollsystem.companysvc.controllers;

import me.aleishawalters.payrollsystem.companysvc.controllers.requests.CreateCompanyRequest;
import me.aleishawalters.payrollsystem.companysvc.exceptions.CompanyCodeDuplicateException;
import me.aleishawalters.payrollsystem.companysvc.models.Company;
import me.aleishawalters.payrollsystem.companysvc.CompanyService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Controller @RestController
public class CompanyController {

    private CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping ("/company")
    public List<Company> getCompany()
    {
        List<Company> companies = this.companyService.getCompanies();

        return companies;
    }

    @PostMapping("/company")
    public Company createCompany(@RequestBody CreateCompanyRequest createCompanyRequest)
    {
        Company company = new Company();
        company.setCompanyCode(createCompanyRequest.getCompanyCode());
        company.setName(createCompanyRequest.getCompanyName());
        company.setStartDate(createCompanyRequest.getStartDate());

        try
        {
            Company savedCompany = this.companyService.createCompany(company);
            return savedCompany;
        } catch(CompanyCodeDuplicateException e)
        {
            throw new ResponseStatusException(HttpStatus.CONFLICT, e.getMessage(), e);
        }
    }
}
