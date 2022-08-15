package me.aleishawalters.payrollsystem.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter @Setter
public class Company {

    private int id;
    private String companyCode;
    private String name;
    private Date startDate;
    private Date endDate;

    public Company(int id, String companyCode, String name, Date startDate, Date endDate) {
        this.id = id;
        this.companyCode = companyCode;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
