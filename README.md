**Deskripsi Program**

Program ini adalah Sistem Reservasi Lapangan Mini Soccer berbasis console menggunakan bahasa Java.
Fungsinya untuk mencatat, melihat, mengubah, dan menghapus data reservasi lapangan yang dilakukan oleh pengguna.
Data reservasi disimpan sementara di dalam ArrayList.

**Alur Program**

- Program dimulai, user ditampilkan menu utama:

- Tambah Reservasi

- Lihat Reservasi

- Ubah Reservasi

- Hapus Reservasi

- Keluar

*Tambah Reservasi*

- User memasukkan nama pemesan, tanggal, jam, dan durasi.

- Program memvalidasi input (tidak boleh kosong, durasi harus angka lebih dari 0).

- Data kemudian disimpan ke dalam daftar reservasi.

*Lihat Reservasi*

- Menampilkan semua reservasi yang sudah tersimpan dalam format daftar.

- Jika belum ada, program menampilkan pesan bahwa data kosong.

- Ubah Reservasi

- User memilih nomor reservasi yang ingin diubah.

- Data lama ditampilkan, lalu user bisa menginput data baru (atau biarkan kosong jika tidak ingin diubah).

- Reservasi diperbarui sesuai input.

*Hapus Reservasi*

- User memilih nomor reservasi yang ingin dihapus.

- Program menghapus data tersebut dari daftar.

- Keluar

Jika user memilih menu keluar, program menampilkan pesan perpisahan dan berhenti.

Jadi alurnya simpel: program jalan → tampilkan menu → user pilih → program proses → balik ke menu lagi, sampai user memilih keluar.

=====================================================================================================================================

**Penjelasan Kode Program**

1. Package dan Import

<img width="541" height="96" alt="image" src="https://github.com/user-attachments/assets/944f9dd3-cf28-43e0-9993-0a11f1b2c942" />

- package → penanda proyek berada di folder com.mycompany.reservasi_lapangan_minisoccer.

- Scanner → digunakan untuk membaca input dari user.

- ArrayList → digunakan untuk menyimpan banyak data reservasi.

2. Class Utama

<img width="472" height="47" alt="image" src="https://github.com/user-attachments/assets/12542453-1778-4406-98a0-7dd062f3e964" />

- Class utama yang berisi program. Semua logika ada di dalamnya.

3. Inner Class Reservasi

   <img width="781" height="312" alt="image" src="https://github.com/user-attachments/assets/15b5bdb0-b3b7-4335-8ebf-2760369ef87b" />

- Inner class → sebagai struktur data untuk menyimpan informasi reservasi.

- Atribut: namaPemesan, tanggal, jam, durasi.

- Konstruktor digunakan untuk mengisi data saat objek dibuat.

4. Method main

   <img width="646" height="84" alt="image" src="https://github.com/user-attachments/assets/33eef74e-8e4b-4a52-bf0e-8802c1af226c" />

- Membuat objek Scanner untuk input.

- Membuat ArrayList untuk menyimpan daftar reservasi.

5. Perulangan Menu

   <img width="752" height="246" alt="image" src="https://github.com/user-attachments/assets/5ca7b7be-8704-4720-bce4-90d5de8b041d" />

- Menu utama ditampilkan berulang dengan while(true).

- User memilih menu dengan angka 1–5.

6. Tambah Reservasi

   <img width="822" height="682" alt="image" src="https://github.com/user-attachments/assets/29d06291-1ac7-4cf7-bc20-80369550bb14" />
<img width="727" height="213" alt="image" src="https://github.com/user-attachments/assets/894fc650-9db3-46f2-83fe-522d2fc75814" />

- User memasukkan nama, tanggal, jam, dan durasi.

- Ada validasi supaya input tidak kosong dan durasi lebih dari 0.

- Data disimpan ke daftarReservasi.

7. Lihat Reservasi

  <img width="863" height="300" alt="image" src="https://github.com/user-attachments/assets/deb62585-3809-460a-941e-39822f953ff1" />

- Menampilkan semua data dalam list.

- Kalau kosong, tampil pesan “Belum ada data reservasi”.

8. Ubah Reservasi

   <img width="1001" height="781" alt="image" src="https://github.com/user-attachments/assets/50910226-3077-4980-a640-346e678439e0" />

- User memilih nomor reservasi.

- Bisa mengubah sebagian atau semua data.

- Validasi jika nomor salah atau list kosong.

9. Hapus Reservasi

   <img width="777" height="418" alt="image" src="https://github.com/user-attachments/assets/992c4eb8-7257-421d-bdcf-e21f7ed693df" />

- User memilih nomor reservasi untuk dihapus dari list.

- Validasi jika list kosong atau nomor tidak valid.

10. Keluar Program

    <img width="625" height="100" alt="image" src="https://github.com/user-attachments/assets/127f5568-ed18-49ca-a190-9b6f917553e5" />

- Program berhenti

11. Default

    <img width="568" height="60" alt="image" src="https://github.com/user-attachments/assets/a29abe1b-162a-4395-ab56-2e8acbec710c" />

- Jika user memasukkan angka selain 1–5.
=================================================================================

**OUTPUT**

1. Tambah Reservasi
   
<img width="469" height="280" alt="image" src="https://github.com/user-attachments/assets/4a5f8ecc-3798-4abe-84b5-58b24b0d7577" />

- Program selalu menampilkan menu utama karena ada while(true).

- User memasukkan angka 1 → artinya memilih Tambah Reservasi.

- Program minta nama pemesan.

- Kalau kosong → muncul pesan error “Nama tidak boleh kosong!” dan diminta ulang.

- Di sini user mengisi Faudzan 

- Program minta tanggal.

- Kalau kosong → muncul pesan “Tanggal tidak boleh kosong!”.

- User mengisi 10-09-2025.
Program minta jam main.

- Kalau kosong → muncul pesan “Jam tidak boleh kosong!”.

- User mengisi 19:00.

- Program minta durasi main (dalam jam).

- Kalau input bukan angka → muncul pesan “Durasi harus berupa angka!”.

- Kalau ≤ 0 → muncul pesan “Durasi harus lebih dari 0!”.

- User mengisi 2 

- Program membuat objek baru Reservasi → menyimpan data Faudzan | 10-09-2025 | 19:00 | 2 jam.


*Contoh jika mengisi dengan jawaban kosong*

<img width="493" height="431" alt="image" src="https://github.com/user-attachments/assets/3a0336e6-e6fc-4ac3-9452-ddc37e698035" />

2. Lihat Reservasi
   
<img width="429" height="233" alt="image" src="https://github.com/user-attachments/assets/ce103521-7ad3-4949-984c-39c4ebb5c2f6" />

- Jadi menu ini berfungsi untuk melihat semua data yang sudah ditambahkan ke sistem, sehingga user bisa mengecek kembali jadwal reservasi mereka.

3. Ubah Reservasi

   <img width="479" height="285" alt="image" src="https://github.com/user-attachments/assets/e545c46b-226e-405a-8670-22b9e8d263de" />

- Program minta input nomor reservasi yang mau diubah (berdasarkan daftar yang ditampilkan di menu 2).
→ contoh: user pilih nomor 1.

- Data reservasi lama ditampilkan dalam tanda kurung, lalu user bisa isi data baru.

  - Nama Pemesan baru (Faudzan): diubah jadi irdhan.

  - Tanggal baru (10-09-2025): diubah jadi 12-02-20245.

  - Jam baru (19:00): diubah jadi 12:00.

  - Durasi baru (2 jam, isi 0 jika tidak diubah): diubah jadi 9 jam.

-Kalau user mengosongkan input (langsung enter), maka nilai lama tetap dipakai.
Kalau user isi data baru → nilai langsung diperbarui.

- Setelah semua input selesai, program update objek Reservasi di dalam ArrayList.
→ muncul pesan “Reservasi berhasil diubah!”.

4. Hapus reservasi

<img width="447" height="199" alt="image" src="https://github.com/user-attachments/assets/1ea9dc91-29f5-4bd1-8e09-fb3ea1fea793" />

- Program minta input nomor reservasi yang mau dihapus (nomornya sesuai daftar di menu 2).
→ di contoh ini user pilih 2.

- Program cek:

  - Kalau nomor valid → data pada index tersebut dihapus dari ArrayList.

  - Kalau nomor tidak valid → muncul pesan “Nomor tidak valid”.

- Setelah sukses, muncul pesan:
“Reservasi berhasil dihapus!”

5. Keluar

<img width="441" height="176" alt="image" src="https://github.com/user-attachments/assets/73943499-c347-4469-97b5-4bab6f5770cd" />

- User memilih angka 5 di menu utama.

- Program langsung menjalankan perintah return; untuk menghentikan perulangan while(true).

- Muncul pesan:
“Terima kasih! Program selesai.”

- Program berhenti sepenuhnya.
