package com.org.springJPA003.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.org.springJPA003.dto.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer> {
	List<Employee> findByName(String name);
	List<Employee> findByNameAndDeptno(String name, int deptno);
	List<Employee> findByNameOrDeptno(String name, int deptno);
	
	@Query("SELECT e FROM Employee e where e.deptno = ?1")
	List<Employee> getByDept(int deptno);
	
	@Query("SELECT e FROM Employee e where e.name=?1 AND e.sal=?2 ")
	List<Employee> getByNameSal(String name, int sal);
	
	@Query("SELECT e FROM Employee e where e.sal=:sal ")
	List<Employee> getBySal(@Param("sal") int sal);

	
	
}
