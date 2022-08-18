package me.aleishawalters.payrollsystem.repositories;

import me.aleishawalters.payrollsystem.models.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company,Integer> {
}
