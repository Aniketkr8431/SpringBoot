package net.springbootproject.springboot.repository;

import net.springbootproject.springboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    // all crud methods
}
