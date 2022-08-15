package me.aleishawalters.payrollsystem.controllers;

import me.aleishawalters.payrollsystem.models.Company;
import me.aleishawalters.payrollsystem.services.CompanyService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Controller @RestController
public class CompanyController {

    private CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping ("/company")
    public String getCompany(){
        return "Heath smells";
    }

    @PostMapping("/company")
    public Company createCompany(){
        Company company = this.companyService.createCompany(new Company(1, "test", "Test Company", new Date(), null));
        return company;
    }
}
