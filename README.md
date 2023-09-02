# Cryptography-Lecture
Language: Java OOP

## English Version
This repository contains the source code that I created from the lesson cryptography lecture at Sriwijaya University. Moreover, there are also cryptography materials that I learn from various sources beside the lecture.

  ### First Lesson: Caesar Cipher (src/caesarCipher)
  Creating the source code of Caesar Cipher with 256 ASCII key, shifting to 3 characters
  #### Class Encrypt.java
  This class turns a plain text into a cipher text
  ##### Algorithm:
  - Get the plain text and cipher key inputted from Main.java
  - Split the plain text into each character
  - Cast the character data type into ASCII integer value
  - Shift integer value based on the key inputted to the right and mod by 256
  - Get the shifted integer value
  - Turn the new integer value into a new character
  - Cast the character data type into string
  - Join the character to become a cipher text


  #### Class Decrypt.java
  This class turns a cipher text into a plain text
  ##### Algorithm:
  - Get the cipher text from Encrypt.java
  - Get the cipher key inputted from Main.java
  - Split the cipher text into each character
  - Cast the character data type into ASCII integer value
  - Shift integer value based on the key inputted to the left and mod by 256
  - Get the shifted integer value
  - Turn the new integer value into a new character
  - Cast the character data type into string
  - Join the character to become a plain text

---

# Kuliah Kriptografi
Bahasa: Java OOP

## Indonesia Version
Repositori ini berisi kode sumber buatan saya sendiri dari pembelajaran mata kuliah kriptografi di Universitas Sriwijaya. Selain itu, terdapat materi kriptografi yang saya pelajari dari sumber-sumber lain.

  ### Pelajaran Pertama: Caesar Cipher (src/caesarCipher)
  Membuat kode sumber Caesar Cipher dengan menggunakan 256 kunci ASCII, melakukan pergeseran sebanyak 3 buah karakter
  #### Kelas Encrypt.java
  Kelas ini mengubah teks biasa menjadi teks yang disandikan (teks cipher)  
  ##### Algoritma:
  - Ambil teks biasa dan kunci cipher yang diinput dari Main.java
  - Pisahkan teks biasa ke dalam karakter terpisah
  - Ubah tipe data karakter menjadi nilai integer
  - Geser nilai integer ke kanan sebanyak kunci cipher dan modulo dengan 256
  - Ambil nilai integer baru yang telah digeser
  - Ubah nilai integer baru menjadi karakter baru
  - Ubah tipe data karakter baru menjadi string
  - Gabungkan karakter agar menjadi teks cipher


  #### Kelas Decrypt.java
  Kelas ini mengubah teks cipher menjadi teks biasa
  ##### Algoritma:
  - Ambil teks cipher dari kelas Encrypt.java
  - Pisahkan teks cipher menjadi karakter terpisah
  - Ubah tipe data karakter menjadi nilai integer ASCII
  - Geser nilai integer ke kiri sebanyak kunci cipher dan modulo dengan 256
  - Ambil nilai integer baru yang telah digeser
  - Ubah nilai integer baru menjadi karakter baru
  - Ubah tipe data karakter baru menjadi string
  - Gabungkan karakter agar menjadi teks cipher
