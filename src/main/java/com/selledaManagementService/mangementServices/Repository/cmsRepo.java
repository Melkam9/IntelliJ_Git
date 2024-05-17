package com.selledaManagementService.mangementServices.Repository;

import com.selledaManagementService.mangementServices.Model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface cmsRepo extends JpaRepository<Customers, String> {

    @Query("Select * from Customers")
    public List<Customers> getCutomerbyId();
}
