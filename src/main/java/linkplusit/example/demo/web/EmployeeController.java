package linkplusit.example.demo.web;

import linkplusit.example.demo.model.Employee;
import linkplusit.example.demo.repository.EmployeeRepository;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    @GetMapping("employees")
    public List<Employee> findAllEmployees(){
        
        return employeeRepository.findAll();
    }
    @PostMapping("employees")
    public Employee saveEmplyee(@RequestBody Employee employee){
        System.out.println(employee);
        return employeeRepository.save(employee);
    }
    @GetMapping("employees/{id}")
    public Employee findEmployeeById(@PathVariable String id){
        return employeeRepository.findById(Long.parseLong(id)).get();
    }
    @PostMapping("employees/example")
    public List<Employee> findEmplyeeByExample(@RequestBody Employee employee){
       org.springframework.data.domain.Example<Employee> example = Example.of(employee);

        return employeeRepository.findAll(example);
    }

}
