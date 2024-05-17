package com.selledaManagementService.mangementServices.Services.ServiceImplementation;

import com.selledaManagementService.mangementServices.Dto.customerDto;
import com.selledaManagementService.mangementServices.Model.Customers;
import com.selledaManagementService.mangementServices.Repository.cmsRepo;
import com.selledaManagementService.mangementServices.Services.customerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class customerServiceImp implements customerService {

    @Autowired
    cmsRepo cmsRepo;

    @Override
    public customerDto createCustomer(Customers customers) {

        try {
            cmsRepo.save(customers);

            customerDto customerDto = new customerDto(customers, "Registration Successful", "1000");

            return customerDto;
        } catch (Exception e) {

//            System.out.println(e.getMessage());
            customerDto customerDto = new customerDto(null, "Registration Failed", "500");

            return customerDto;
        }
    }

    @Override
    public customerDto updateCustomer(Customers customers) {
        return null;
    }

    @Override
    public Customers callById(int id) {
        return null;
    }
}
