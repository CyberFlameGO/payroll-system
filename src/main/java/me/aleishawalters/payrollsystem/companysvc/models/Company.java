package me.aleishawalters.payrollsystem.companysvc.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
@Getter @Setter @Entity
@AllArgsConstructor @NoArgsConstructor
public class Company
{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(unique = true)
    private String companyCode;
    @Column(length = 255)
    private String name;
    private Date startDate;
    private Date endDate;
}
