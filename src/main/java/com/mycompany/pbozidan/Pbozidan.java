/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pbozidan;

/**
 *
 * @author LENOVO
 */
public class Pbozidan {
    public static void main(String[] args) {
        System.out.println("=== SISTEM BANK SEDERHANA ===");
        
        // Membuat object Customer
        Customer cust1 = new Customer("C001", "Budi Santoso", "081234567890");
        Customer cust2 = new Customer("C002", "Siti Aminah", "123"); // Akan memicu error validasi no telp
        
        // Membuat object BankAccount
        BankAccount acc1 = new BankAccount("11223344", cust1, 500000);
        BankAccount acc2 = new BankAccount("99887766", cust2, -100000); // Akan memicu error validasi saldo awal
        
        // Cek info awal
        acc1.printAccountInfo();
        
        // Uji coba metode dengan validasi
        acc1.deposit(150000);    // Berhasil
        acc1.deposit(-50000);    // Gagal (Validasi 3)
        
        acc1.withdraw(800000);   // Gagal (Validasi 4 - saldo kurang)
        acc1.withdraw(200000);   // Berhasil
        
        // Cek info akhir
        acc1.printAccountInfo();
    }
}
    

