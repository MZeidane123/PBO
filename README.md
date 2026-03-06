# Bank Account System - Encapsulation Challenge

Sistem mini berbasis Java ini dibuat untuk mensimulasikan operasional rekening bank sederhana dengan mengimplementasikan konsep Encapsulation dalam Object-Oriented Programming (OOP).

# Desain Class
Sistem ini terdiri dari 3 class utama:
1. Customer: Menyimpan entitas nasabah. Memiliki atribut private (customerId, name, phoneNumber) agar data pribadi tidak bisa dimanipulasi secara langsung. Terdapat validasi setter pada phoneNumber untuk memastikan nomor yang diinput memiliki minimal 10 digit.
2. BankAccount: Mengelola rekening dan transaksi. Atribut balance (saldo) dan AccountNumber bersifat private. Saldo hanya dapat diubah melalui method deposit() dan withdraw() yang telah dilengkapi aturan validasi (misal: penarikan tidak boleh melebihi saldo yang ada).
3. Main: Class eksekusi untuk menguji pembuatan akun, deposit, withdraw, dan penanganan error dari validasi yang berjalan.

