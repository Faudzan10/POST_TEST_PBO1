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


