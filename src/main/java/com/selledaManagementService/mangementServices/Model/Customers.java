package com.selledaManagementService.mangementServices.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customers {


    @Id
    private String customerId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String notes;
    private Address address;
    private customFields customFields;
}

//    public String getId() {
//        return customerId;
//    }

//    public void setId(String id) {
//        this.customerId = id;
//    }
//}
