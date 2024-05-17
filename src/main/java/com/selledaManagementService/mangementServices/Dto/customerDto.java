package com.selledaManagementService.mangementServices.Dto;

import com.selledaManagementService.mangementServices.Model.Customers;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class customerDto {

    private Customers customers;
    private String message;
    private String statusCode;
}
