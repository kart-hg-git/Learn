package in.swf.react.controller;


import in.swf.react.model.Employee;
import in.swf.react.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/list")
    public Flux<Employee> listofEmployees() {
        return employeeRepository.findAll();
    }

    @PostMapping("/employee")
    public Mono<Employee> createTweets(@Valid @RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }
}
