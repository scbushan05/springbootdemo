package in.bushansirgur.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class EmployeeController {
	
	private final EmployeeRepository employeeRepo;
	
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return employeeRepo.findAll();
	}
}
