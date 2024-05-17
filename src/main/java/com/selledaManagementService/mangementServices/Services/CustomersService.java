package com.selledaManagementService.mangementServices.Services;

import com.selledaManagementService.mangementServices.Dto.customerDto;
import com.selledaManagementService.mangementServices.Model.Customers;
import com.selledaManagementService.mangementServices.Repository.cmsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.rmi.server.UID;
import java.util.Optional;
import java.util.UUID;

@Service
public class CustomersService {

    @Autowired
    private cmsRepo customerRepository;

    private String generateUniqueId() {
        return "Cust" + UUID.randomUUID();
    }


    public customerDto saveCustomer(Customers customer) {
        try {
            String uniqueId = generateUniqueId();
            customer.setCustomerId(uniqueId);
            customerRepository.save(customer);
            return new customerDto(customer, "Registration Successful", "1000");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new customerDto(null, "Registration Failed", "500");
        }
    }

    public Customers findByCustomerId(String customerId) {
        Optional<Customers> cust = customerRepository.findById(customerId);
        if (cust.isPresent()) {
            return cust.get();
        }
        return null;
    }

    public Customers updateByCustomerId(String customerId, Customers customer) {
        Optional<Customers> cust = customerRepository.findById(customerId);
        if (cust.isPresent()) {
            Customers currCustomer = cust.get();
            currCustomer.setFirstName(customer.getFirstName());
            currCustomer.setLastName(customer.getLastName());
            currCustomer.setPhone(customer.getPhone());
            currCustomer.setEmail(customer.getEmail());
            customerRepository.save(currCustomer);
            return currCustomer;
        }
        return null;
    }

}