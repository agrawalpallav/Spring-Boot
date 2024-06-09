package com.org.springJPA003;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.org.springJPA003.dto.Employee;
import com.org.springJPA003.repo.EmpRepo;
import com.org.springJPA003.repo.PersonRepo;

@SpringBootApplication
public class SpringJpa003Application {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SpringJpa003Application.class, args);
		PersonRepo  repo = ac.getBean(PersonRepo.class);
		
//		EmpRepo  repo = ac.getBean(EmpRepo.class);
		
//		Employee e = new Employee();
//		e.setEid(106);
//		e.setName("SMITH");
//		e.setSal(800);
//		e.setDeptno(20);
//		repo.save(e);
//		
//		Employee e1 = new Employee();
//		e1.setEid(101);
//		e1.setName("SMITH RAO");
//		e1.setSal(1800);
//		e1.setDeptno(20);
//		
//		repo.save(e1);
//		
//		Employee e2 = new Employee();
//		e2.setEid(102);
//		e2.setName("ALLEN");
//		e2.setSal(1200);
//		e2.setDeptno(10);
//		
//		Employee e3 = new Employee();
//		e3.setEid(103);
//		e3.setName("WARD");
//		e3.setSal(1500);
//		e3.setDeptno(20);
//		
//		Employee e4 = new Employee();
//		e4.setEid(104);
//		e4.setName("MILLER");
//		e4.setSal(900);
//		e4.setDeptno(10);
//		
//		Employee e5 = new Employee();
//		e5.setEid(105);
//		e5.setName("ALLEN");
//		e5.setSal(1000);
//		e5.setDeptno(20);
//		
//		List<Employee> employees = new ArrayList<Employee>();
//		employees.add(e2);
//		employees.add(e3);
//		employees.add(e4);
//		employees.add(e5);
//		
//		repo.saveAll(employees);
//		
//		List<Employee> emps = repo.findAll();
//		for(Employee e5 : emps) {
//			System.out.println(e5.getEid());
//			System.out.println(e5.getName());
//			System.out.println(e5.getSal());
//			System.out.println(e5.getDeptno());
//			System.out.println("------------------");
//		}
//		
//		Optional<Employee> opt = repo.findById(103);
//		if(opt.isPresent()) {
//			Employee e6 = opt.get();
//			System.out.println(e6.getEid());
//			System.out.println(e6.getName());
//			System.out.println(e6.getSal());
//			System.out.println(e6.getDeptno());
//		}
			
//		Optional<Employee> opt = repo.findById(103);
//		repo.delete(opt.get());
//		
//		List<Employee> employee2 = repo.getByNameSal("ALLEN",1200);
//		for(Employee e7 : employee2) {
//			System.out.println(e7.getEid());
//			System.err.println(e7.getName());
//			System.out.println(e7.getSal());
//			System.out.println(e7.getDeptno());
//			System.out.println("-----------");
//		}
		
	}

}
