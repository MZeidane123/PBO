/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbozidan;

/**
 *
 * @author LENOVO
 */
public class Customer {
    

    private String customerId;
    private String name;
    private String phoneNumber;

  
    public Customer(String customerId, String name, String phoneNumber) {
        this.customerId = customerId;
        this.name = name;
        setPhoneNumber(phoneNumber);
    }

   
    public String getName() { 
        return name; 
    }

    public void setPhoneNumber(String phoneNumber) {
       
        if (phoneNumber != null && phoneNumber.length() >= 10) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("Error: Nomor telepon untuk " + name + " tidak valid.");
        }
    }

    public String getPhoneNumber() { 
        return phoneNumber; 
    }
}

