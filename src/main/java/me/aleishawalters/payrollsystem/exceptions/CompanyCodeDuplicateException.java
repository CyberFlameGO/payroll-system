package me.aleishawalters.payrollsystem.exceptions;

public class CompanyCodeDuplicateException extends RuntimeException
{
    public CompanyCodeDuplicateException(String companyCode) {
        super("Company Code '" + companyCode + "' already exists");
    }
}
