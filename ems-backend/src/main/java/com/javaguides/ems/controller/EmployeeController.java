package com.javaguides.ems.controller;

import com.javaguides.ems.dto.EmployeeDto;
import com.javaguides.ems.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    // building add employee REST API
    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto) {
        EmployeeDto savedEMployee = employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(savedEMployee, HttpStatus.CREATED);
    }

    // building GEt Employee REST API
    @GetMapping("{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable("id") Long employeeId) { // here id and employeeId
                                                                                              // names are different
                                                                                              // that is why we need to
                                                                                              // give path to it
        EmployeeDto employeeDto = employeeService.getEmployeeById(employeeId);
        return ResponseEntity.ok(employeeDto);
    }

    // bbuid get all employees REST API
    @GetMapping
    public ResponseEntity<List<EmployeeDto>> getAllEmployees() {
        List<EmployeeDto> employees = employeeService.getAllEmployees();
        return ResponseEntity.ok(employees);
    }

    // build update employee REST API
    @PutMapping("{id}")
    public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable("id") Long employeeId,
            @RequestBody EmployeeDto updatedEmployee) {
        EmployeeDto employeeDto = employeeService.updateEmployee(employeeId, updatedEmployee);
        return ResponseEntity.ok(employeeDto);
    }

    // build delete rest api
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") Long employeeId) {
        employeeService.deleteEmployee(employeeId);
        return ResponseEntity.ok("Employee deleted successfully");
    }

    // // build delete rest api
    // @DeleteMapping("{id}")
    // public ResponseEntity<String> deleteEmployee(@PathVariable("id") Long employeeId) {
    //     employeeService.deleteEmployee(employeeId);
    //     return ResponseEntity.ok("Employee deleted successfully");
    // }
}




















// public class EmployeeController {
//     private EmployeeService employeeService;

//     // building add employee REST API
//     @PostMapping
//     public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto) {
//         EmployeeDto savedEMployee = employeeService.createEmployee(employeeDto);
//         return new ResponseEntity<>(savedEMployee, HttpStatus.CREATED);
//     }

//     // building GEt Employee REST API
//     @GetMapping("{id}")
//     public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable("id") Long employeeId) { // here id and employeeId
//                                                                                               // names are different
//                                                                                               // that is why we need to
//                                                                                               // give path to it
//         EmployeeDto employeeDto = employeeService.getEmployeeById(employeeId);
//         return ResponseEntity.ok(employeeDto);
//     }

//     // bbuid get all employees REST API
//     @GetMapping
//     public ResponseEntity<List<EmployeeDto>> getAllEmployees() {
//         List<EmployeeDto> employees = employeeService.getAllEmployees();
//         return ResponseEntity.ok(employees);
//     }

//     // build update employee REST API
//     @PutMapping("{id}")
//     public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable("id") Long employeeId,
//             @RequestBody EmployeeDto updatedEmployee) {
//         EmployeeDto employeeDto = employeeService.updateEmployee(employeeId, updatedEmployee);
//         return ResponseEntity.ok(employeeDto);
//     }

//     // build delete rest api
//     @DeleteMapping("{id}")
//     public ResponseEntity<String> deleteEmployee(@PathVariable("id") Long employeeId) {
//         employeeService.deleteEmployee(employeeId);
//         return ResponseEntity.ok("Employee deleted successfully");
//     }

//     // // build delete rest api
//     // @DeleteMapping("{id}")
//     // public ResponseEntity<String> deleteEmployee(@PathVariable("id") Long employeeId) {
//     //     employeeService.deleteEmployee(employeeId);
//     //     return ResponseEntity.ok("Employee deleted successfully");
//     // }
// }

// public class EmployeeController {
//     private EmployeeService employeeService;

//     // building add employee REST API
//     @PostMapping
//     public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto) {
//         EmployeeDto savedEMployee = employeeService.createEmployee(employeeDto);
//         return new ResponseEntity<>(savedEMployee, HttpStatus.CREATED);
//     }

//     // building GEt Employee REST API
//     @GetMapping("{id}")
//     public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable("id") Long employeeId) { // here id and employeeId
//                                                                                               // names are different
//                                                                                               // that is why we need to
//                                                                                               // give path to it
//         EmployeeDto employeeDto = employeeService.getEmployeeById(employeeId);
//         return ResponseEntity.ok(employeeDto);
//     }

//     // bbuid get all employees REST API
//     @GetMapping
//     public ResponseEntity<List<EmployeeDto>> getAllEmployees() {
//         List<EmployeeDto> employees = employeeService.getAllEmployees();
//         return ResponseEntity.ok(employees);
//     }

//     // build update employee REST API
//     @PutMapping("{id}")
//     public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable("id") Long employeeId,
//             @RequestBody EmployeeDto updatedEmployee) {
//         EmployeeDto employeeDto = employeeService.updateEmployee(employeeId, updatedEmployee);
//         return ResponseEntity.ok(employeeDto);
//     }

//     // build delete rest api
//     @DeleteMapping("{id}")
//     public ResponseEntity<String> deleteEmployee(@PathVariable("id") Long employeeId) {
//         employeeService.deleteEmployee(employeeId);
//         return ResponseEntity.ok("Employee deleted successfully");
//     }

//     // // build delete rest api
//     // @DeleteMapping("{id}")
//     // public ResponseEntity<String> deleteEmployee(@PathVariable("id") Long employeeId) {
//     //     employeeService.deleteEmployee(employeeId);
//     //     return ResponseEntity.ok("Employee deleted successfully");
//     // }
// }
