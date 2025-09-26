
# 📝 Inheritance Payroll System Java

Proyek ini menunjukkan cara menggunakan konsep **inheritance (pewarisan)** dalam pemrograman berorientasi objek untuk mengelola data karyawan tetap dan kontrak.

## 📖 Deskripsi Proyek
aplikasi Java yang mendemonstrasikan pewarisan antar kelas untuk menghitung pendapatan karyawan berdasarkan status dan jumlah anak.  
Proyek ini mencakup:

- 📊 **Karyawan.java** – Kelas induk yang merepresentasikan karyawan dengan atribut `NPP`, `nama`, `jumlahAnak`, serta metode menghitung tunjangan anak.
- 🔍 **KaryawanTetap.java** – Kelas turunan dari `Karyawan` untuk karyawan tetap, dengan atribut `gajiPokok` dan metode menghitung total pendapatan.
- 🔍 **KaryawanKontrak.java** – Kelas turunan dari `Karyawan` untuk karyawan kontrak, dengan atribut `upahHarian` dan `hariMasuk`.
- 🛠️ **MainKaryawan.java** – Kelas utama untuk menjalankan program dan menampilkan hasil perhitungan.

## 🧠 Teknologi
- Java SE 8+

## 📂 Struktur Proyek
```
Inheritance_Payroll_System_Java/
├── src/Modul_7/
├── MainKaryawan.java       # 🛠️ Kelas utama untuk pengujian
├── Karyawan.java           # 📊 Kelas induk
├── KaryawanTetap.java      # 🔍 Karyawan tetap
├── KaryawanKontrak.java    # 🔍 Karyawan kontrak
```

## 🟢 Catatan
- Program membuat dua objek: karyawan tetap dan kontrak.
- Perhitungan:
  - Tunjangan anak: `100.000 × jumlah anak`
  - Karyawan tetap: `gaji pokok + tunjangan anak`
  - Karyawan kontrak: `(upah harian × hari masuk) + tunjangan anak`

## 📈 Contoh Output
```
Data Karyawan Tetap:
NPP: 235314099
Nama: Eugenius
Gaji Total: 5200000

Data Karyawan Kontrak:
NPP: 235314098
Nama: Fransisco
Upah Total: 4100000
```

## 👨‍💻 Pengembang
**MBAHSINGO22** – 🔗 [GitHub](https://github.com/MBAHSINGO22)
