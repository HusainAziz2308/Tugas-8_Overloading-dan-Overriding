# Tugas8_Overloading-dan-Overriding
## Identitas
- Nama : Husain Aziz Al Rosyid
- NIM : 4124031

## Tujuan Praktikum
1. Memahami tentang overloading.
2. Memahami tentang overriding.
3. Memahami aturan tentang overridden.

## Dasar Teori
Overloading adalah suatu keadaan dimana beberapa method dapat mempunyai nama yang sama, tetapi mempunyai parameter berbeda. Overriding adalah suatu keadaan dimana method pada subclass menggantikan method pada parent class-nya dengan definisi yang baru.

## Hasil Percobaan
**C. TUGAS PENDAHULUAN**

**1. Memahami tentang overloading**
> **Overloading(Method Overloading)** adalah kemampuan dalam Java untuk memiliki beberapa method dalam satu class yang memiliki nama yang sama, tetapi memiliki daftar parameter yang berbeda.

**2. Memahami tentang overriding.**
> **Overriding (atau Method Overriding)** adalah kemampuan dalam Java untuk class anak (subclass) untuk menyediakan implementasi spesifik dari method yang sudah didefinisikan di class induknya `(superclass)`.

**3. Memahami aturan tentang overridden.**
> "Aturan tentang overridden" adalah rangkuman dari poin-poin yang perlu diperhatikan saat melakukan overriding. Ini pada dasarnya mengulang dan memperjelas aturan-aturan yang telah disebutkan di poin 2. Berikut adalah penekanannya:

## File
**D. PERCOBAAN**

[Segiempat.java](Segiempat.java)

**E. LATIHAN**

_Latihan 1_

[Base.java](Base.java)

_Latihan 2_

[MySomeOne.java](MySomeOne.java)

_Latihan 3_

[Overloading.java](Overloading.java)

_Latihan 4_

[Dosen.java](Dosen.java)

**F. TUGAS**

_Tugas 1_

[TesTugas1.java](TesTugas1.java)

_Tugas 2_

[TesTugas2.java](TesTugas2.java)

## Analisa
- Overloading memungkinkan beberapa method memiliki nama yang sama tetapi dengan parameter berbeda, sehingga meningkatkan fleksibilitas pemrograman dan memudahkan penggunaan method sesuai kebutuhan.
- Overriding digunakan ketika subclass ingin mengganti atau menyesuaikan perilaku method yang diwarisi dari superclass, dengan syarat nama, parameter, dan tipe kembalian harus sama.
- Overloading dan overriding adalah bagian penting dari konsep polimorfisme dalam pemrograman berorientasi objek.
- Pada latihan dan tugas yang diberikan, konsep overloading berhasil diimplementasikan dengan benar melalui method average() dan addMe(), sedangkan overriding berhasil diterapkan pada method caraBergerak() di subclass Kecebong.
- Implementasi berdasarkan UML class diagram membantu mahasiswa memahami hubungan antar objek, pewarisan, dan penggunaan kembali kode secara efisien.
- Dengan latihan ini, pemahaman tentang perbedaan dan penerapan overloading dan overriding dapat meningkat secara praktis melalui penerapan langsung dalam program Java.

Overloading memungkinkan method yang sama digunakan untuk parameter berbeda, mempermudah fleksibilitas kode. Overriding memungkinkan subclass untuk menggantikan perilaku parent class dengan implementasi spesifik, memungkinkan polimorfisme dalam OOP.
