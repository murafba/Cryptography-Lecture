# Cryptography-Lecture
This repository contains the source code that I created from the cryptography lecture at Sriwijaya University. Moreover, there are also cryptography materials that I learn from various sources beside the lecture.

  ### First Lesson:
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

# Kuliah Kriptografi
## Indonesia Translation
Repositori ini berisi kode sumber dari mata kuliah kriptografi di Universitas Sriwijaya. Selain itu, terdapat materi kriptografi yang saya pelajari dari sumber-sumber lain.

  - Pelajaran pertama:
    Membuat kode sumber dari Caesar Cipher dengan menggunakan 256 kunci karakter ASCII, dengan masing-masing perubahan 3 buah karakter

