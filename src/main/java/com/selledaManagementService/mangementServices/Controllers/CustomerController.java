package com.selledaManagementService.mangementServices.Controllers;

import com.selledaManagementService.mangementServices.Model.Customers;
import com.selledaManagementService.mangementServices.Services.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomersService customerService;

    @PostMapping("/register")
    public ResponseEntity<?> registerCustomer(@RequestBody Customers customer) {
        return new ResponseEntity<>(customerService.saveCustomer(customer), HttpStatus.CREATED);
    }

    @GetMapping("/get/{customerId}")
    public ResponseEntity<Customers> getCustomer(@PathVariable("customerId") String customerId) {
        return new ResponseEntity<>(customerService.findByCustomerId(customerId), HttpStatus.FOUND);
    }

    @PutMapping("/update/{customerId}")
    public ResponseEntity<Customers> updateCustomer(@PathVariable("customerId") String customerId, @RequestBody Customers customer) {
        return new ResponseEntity<>(customerService.updateByCustomerId(customerId, customer), HttpStatus.OK);
    }

}