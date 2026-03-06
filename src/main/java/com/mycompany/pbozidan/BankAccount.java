/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbozidan;

/**
 *
 * @author LENOVO
 */
public class BankAccount {
    // Memenuhi syarat atribut private, total lebih dari 5 atribut jika digabung dengan class Customer
    private String accountNumber;
    private double balance;
    private Customer owner;

    // Constructor ke-2
    public BankAccount(String accountNumber, Customer owner, double initialBalance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        
        // Validation Logic 2: Saldo awal tidak boleh negatif
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Error: Saldo awal tidak boleh negatif. Saldo diatur ke Rp0.");
            this.balance = 0.0;
        }
    }

    // Constructor ke-3 (Overloading - memenuhi syarat minimal 2 constructor)
    public BankAccount(String accountNumber, Customer owner) {
        this(accountNumber, owner, 0.0); // Default saldo 0 jika tidak diinput
    }

    // Method operasional rekening (memenuhi syarat minimal 6 method dalam sistem)
    public void deposit(double amount) {
        // Validation Logic 3: Deposit harus lebih dari 0
        if (amount > 0) {
            balance += amount;
            System.out.println("Berhasil: Deposit Rp" + amount + " ke rekening " + accountNumber);
        } else {
            System.out.println("Error: Jumlah deposit harus lebih besar dari Rp0.");
        }
    }

    public void withdraw(double amount) {
        // Validation Logic 4: Tarik tunai validasi jumlah dan ketersediaan saldo
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Berhasil: Penarikan Rp" + amount + " dari rekening " + accountNumber);
        } else {
            System.out.println("Error: Penarikan gagal. Saldo tidak mencukupi atau jumlah tidak valid.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void printAccountInfo() {
        System.out.println("\n--- Informasi Rekening ---");
        System.out.println("No Rekening  : " + accountNumber);
        System.out.println("Nama Pemilik : " + owner.getName());
        System.out.println("Saldo Terkini: Rp" + balance);
        System.out.println("--------------------------\n");
    }
}