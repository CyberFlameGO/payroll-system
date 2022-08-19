package me.aleishawalters.payrollsystem.controllers.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class CreateCompanyRequest {
    private String companyCode;
    private String companyName;
    private Date startDate;
}
