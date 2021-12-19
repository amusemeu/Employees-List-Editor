package com.amusemeu.employee.Employee.Editor.Service;

import com.amusemeu.employee.Employee.Editor.Repositories.DepartmentsRepository;
import com.amusemeu.employee.Employee.Editor.Repositories.EmployeeRepository;
import com.amusemeu.employee.Employee.Editor.Models.Departments;
import com.amusemeu.employee.Employee.Editor.Models.Employee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class EmployeeConfiguration {


    @Bean
    public CommandLineRunner commandLineRunner1(DepartmentsRepository departmentsRepository){
        return args -> {
            departmentsRepository.saveAll(List.of(
                    new Departments(1L, "IT"),
                    new Departments(2L, "HR"),
                    new Departments(3L,"Invest"),
                    new Departments(4L, "Sales")
            ));
        };
    }
    @Bean
    public CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository){
        return args -> {
            employeeRepository.saveAll(List.of(
                    new Employee(1L,"Mark", "Markov", 24596, new Departments(1L, "IT")),
                    new Employee(2L,"Ivan", "Ivanov", 74709, new Departments(3L, "Invest"))
            ));
        };
    }
}
