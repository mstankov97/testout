package linkplusit.example.demo.repository;

import linkplusit.example.demo.model.Employee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class populateDatabase implements CommandLineRunner {
    EmployeeRepository employeeRepository;

    public populateDatabase(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Employee e1 = new Employee();
        e1.name ="Marjan";
        e1.lastName="Stankov";
        e1.division = "Java";

        Employee e2 = new Employee();
        e2.name ="John";
        e2.lastName="Doe";
        e2.division = "WSS";
        Employee e3 = new Employee();
        e3.name ="Bob";
        e3.lastName="Prisley";
        e3.division = "Music";

        Employee e4 = new Employee();
        e4.name ="Ken";
        e4.lastName="Barbievski";
        e4.division = "Dance";

        Employee e5 = new Employee();
        e5.name ="Petko";
        e5.lastName="Petkov";
        e5.division = "Java";

        employeeRepository.save(e1);
        employeeRepository.save(e2);
        employeeRepository.save(e3);
        employeeRepository.save(e4);
        employeeRepository.save(e5);



    }
}
