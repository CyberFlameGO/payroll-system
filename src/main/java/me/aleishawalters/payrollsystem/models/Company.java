package me.aleishawalters.payrollsystem.models;

import lombok.Getter;
import lombok.Setter;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
@Getter @Setter @Entity
public class Company {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
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
