package com.selledaManagementService.mangementServices.Services;

import com.selledaManagementService.mangementServices.Dto.customerDto;
import com.selledaManagementService.mangementServices.Model.Customers;


public interface customerService{

    public customerDto createCustomer(Customers customers);
    public customerDto updateCustomer(Customers customers);
    public Customers callById(int id);
}
