package com.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	
	@Query("SELECT p from Employee p WHERE " +
            " p.id LIKE CONCAT('%', :query, '%') OR " +
            " p.eName LIKE CONCAT('%', :query, '%')")
	List<Employee> searchEmployee(@Param("query") String query);

}
