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
    
    // Memenuhi syarat atribut private
    private String customerId;
    private String name;
    private String phoneNumber;

    // Constructor ke-1
    public Customer(String customerId, String name, String phoneNumber) {
        this.customerId = customerId;
        this.name = name;
        setPhoneNumber(phoneNumber); // Menggunakan setter yang memiliki validasi
    }

    // Getter & Setter dengan access modifier public
    public String getName() { 
        return name; 
    }

    public void setPhoneNumber(String phoneNumber) {
        // Validation Logic 1: Nomor telepon harus valid (minimal 10 digit)
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

