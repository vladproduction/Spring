package com.vladproduction.springtransactions.repository;

import com.vladproduction.springtransactions.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Created by vladproduction on 14-Mar-24
 */

@Repository
public class CustomerRepo {

    @Autowired
    private DataSource dataSource;

    public void saveCustomer(Customer customer){
        String sql = "insert into customer (customerName, isValidAccount) values (?, ?)";
        try(Connection c = dataSource.getConnection()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, customer.getCustomerName());
            ps.setBoolean(2, customer.isValidAccount());
            ps.execute();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

}
