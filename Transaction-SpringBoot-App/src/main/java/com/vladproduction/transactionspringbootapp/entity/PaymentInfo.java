package com.vladproduction.transactionspringbootapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by vladproduction on 26-Mar-24
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "paymentInfo")
public class PaymentInfo {

    @Id
    private long id;
    private String productName;
    private double amount;
}
