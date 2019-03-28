package com.ttn.springDataJPApractise;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface EmployeeRepository extends CrudRepository<Employee,Integer>
{
    Employee findById(@Param("id") Integer id);
}