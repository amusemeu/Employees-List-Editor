package com.amusemeu.employee.Employee.Editor.Service;

import com.amusemeu.employee.Employee.Editor.EmployeeRepository.EmployeeRepository;
import com.amusemeu.employee.Employee.Editor.Model.Employee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class EmployeeConfiguration {

    @Bean
    public CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository){
        return args -> {
            employeeRepository.saveAll(List.of(
                    new Employee(1L,"Mark", "Markov", 24596, 3)
            ));
        };
    }
}
