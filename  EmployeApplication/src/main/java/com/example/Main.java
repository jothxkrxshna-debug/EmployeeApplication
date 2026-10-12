package com.example;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        EmployeService employeeService =
                context.getBean(EmployeService.class);

        employeeService.addEmployee();

        employeeService.displayEmployee();

        employeeService.calculateSalary();

        context.close();
    }
}


