package net.springbootproject.springboot;

import net.springbootproject.springboot.model.Employee;
import net.springbootproject.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
//		Employee employee = new Employee();
//		employee.setFirstName("Aniket");
//		employee.setLastName("Kumar");
//		employee.setEmailId("Aniket@gmail.com");
//		employeeRepository.save(employee);
//
//		Employee employee1 = new Employee();
//		employee1.setFirstName("John");
//		employee1.setLastName("Cena");
//		employee1.setEmailId("John@gmail.com");
//		employeeRepository.save(employee1);
	}
}
