# Implementasi 4 Pilar OOP - Sistem Informasi Akademik (MyITS)

Proyek sederhana ini mendemonstrasikan penerapan empat pilar utama Pemrograman Berorientasi Objek (OOP) menggunakan bahasa pemrograman **Java**. Studi kasus yang digunakan adalah pengelolaan data tugas mahasiswa berdasarkan jurusan.

## 🚀 4 Pilar OOP dalam Proyek Ini

Berikut adalah detail penerapan masing-masing pilar dalam kode `Classroom.java`:

### 1. Abstraction (Abstraksi)
Diterapkan pada class `AkunMahasiswa`. 
- Menggunakan keyword `abstract` sehingga class ini tidak bisa dibuat objeknya secara langsung.
- Terdapat *abstract method* `lihatTugas()` yang menjadi kontrak wajib bagi semua jurusan untuk menentukan jenis tugasnya masing-masing.

### 2. Encapsulation (Enkapsulasi)
Data mahasiswa diproteksi menggunakan akses modifier `private`.
- Variabel `nama` dan `nilai` tidak dapat diakses langsung dari luar class.
- Akses data dilakukan secara aman melalui metode **Getter** (`getNama()` dan `getNilai()`).

### 3. Inheritance (Pewarisan)
Pemanfaatan kembali kode (*reusability*) melalui keyword `extends`.
- Class `MahasiswaIT` dan `MahasiswaSipil` mewarisi sifat dan perilaku dari `AkunMahasiswa`.
- Kita tidak perlu menulis ulang variabel `nama` dan `nilai` di setiap class anak.

### 4. Polymorphism (Polimorfisme)
Diterapkan melalui *Method Overriding*.
- Meskipun keduanya bertipe `AkunMahasiswa`, saat metode `lihatTugas()` dipanggil, output yang dihasilkan berbeda sesuai dengan perilaku spesifik masing-masing objek (IT vs Sipil).

---

## 💻 Struktur Kode

- `AkunMahasiswa` (Abstract Class) - Induk
- `MahasiswaIT` (Class) - Anak 1
- `MahasiswaSipil` (Class) - Anak 2
- `Classroom` (Main Class) - Tempat eksekusi program

## 📝 Cara Menjalankan

1. Pastikan Java JDK sudah terinstall.
2. Compile file:
   ```bash
   javac Classroom.java
