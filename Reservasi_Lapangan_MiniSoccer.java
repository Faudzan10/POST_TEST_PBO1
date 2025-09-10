package com.mycompany.reservasi_lapangan_minisoccer;

import java.util.ArrayList;
import java.util.Scanner;

public class Reservasi_Lapangan_MiniSoccer {

    // Inner class untuk data reservasi
    static class Reservasi {
        String namaPemesan;
        String tanggal;
        String jam;
        int durasi;

        Reservasi(String namaPemesan, String tanggal, String jam, int durasi) {
            this.namaPemesan = namaPemesan;
            this.tanggal = tanggal;
            this.jam = jam;
            this.durasi = durasi;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Reservasi> daftarReservasi = new ArrayList<>();

        while (true) {
            System.out.println("\n=== SISTEM RESERVASI LAPANGAN MINI SOCCER ===");
            System.out.println("1. Tambah Reservasi");
            System.out.println("2. Lihat Reservasi");
            System.out.println("3. Ubah Reservasi");
            System.out.println("4. Hapus Reservasi");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int menu = input.nextInt();
            input.nextLine();

            switch (menu) {
                case 1 -> {
                    // Tambah Reservasi (validasi input kosong)
                    String nama;
                    do {
                        System.out.print("Nama Pemesan: ");
                        nama = input.nextLine().trim();
                        if (nama.isEmpty()) System.out.println("Nama tidak boleh kosong!");
                    } while (nama.isEmpty());

                    String tanggal;
                    do {
                        System.out.print("Tanggal (dd-mm-yyyy): ");
                        tanggal = input.nextLine().trim();
                        if (tanggal.isEmpty()) System.out.println("Tanggal tidak boleh kosong!");
                    } while (tanggal.isEmpty());

                    String jam;
                    do {
                        System.out.print("Jam (contoh: 18:00): ");
                        jam = input.nextLine().trim();
                        if (jam.isEmpty()) System.out.println("Jam tidak boleh kosong!");
                    } while (jam.isEmpty());

                    int durasi = 0;
                    while (durasi <= 0) {
                        System.out.print("Durasi (jam, minimal 1): ");
                        if (input.hasNextInt()) {
                            durasi = input.nextInt();
                            input.nextLine();
                            if (durasi <= 0) System.out.println("Durasi harus lebih dari 0!");
                        } else {
                            System.out.println("Durasi harus berupa angka!");
                            input.nextLine();
                        }
                    }

                    daftarReservasi.add(new Reservasi(nama, tanggal, jam, durasi));
                    System.out.println("Reservasi berhasil ditambahkan!");
                }

                case 2 -> {
                    // Lihat Reservasi
                    if (daftarReservasi.isEmpty()) {
                        System.out.println("Belum ada data reservasi.");
                    } else {
                        System.out.println("\n--- Daftar Reservasi ---");
                        for (int i = 0; i < daftarReservasi.size(); i++) {
                            Reservasi r = daftarReservasi.get(i);
                            System.out.println((i + 1) + ". " + r.namaPemesan + " - " + r.tanggal +
                                    " " + r.jam + " (" + r.durasi + " jam)");
                        }
                    }
                }

                case 3 -> {
                    // Ubah Reservasi
                    if (daftarReservasi.isEmpty()) {
                        System.out.println("Belum ada data reservasi untuk diubah.");
                    } else {
                        System.out.print("Masukkan nomor reservasi yang ingin diubah: ");
                        int index = input.nextInt();
                        input.nextLine();

                        if (index > 0 && index <= daftarReservasi.size()) {
                            Reservasi r = daftarReservasi.get(index - 1);

                            System.out.print("Nama Pemesan baru (" + r.namaPemesan + "): ");
                            String namaBaru = input.nextLine();
                            if (!namaBaru.trim().isEmpty()) r.namaPemesan = namaBaru;

                            System.out.print("Tanggal baru (" + r.tanggal + "): ");
                            String tanggalBaru = input.nextLine();
                            if (!tanggalBaru.trim().isEmpty()) r.tanggal = tanggalBaru;

                            System.out.print("Jam baru (" + r.jam + "): ");
                            String jamBaru = input.nextLine();
                            if (!jamBaru.trim().isEmpty()) r.jam = jamBaru;

                            System.out.print("Durasi baru (" + r.durasi + " jam, isi 0 jika tidak diubah): ");
                            int durasiBaru = input.nextInt();
                            input.nextLine();
                            if (durasiBaru > 0) r.durasi = durasiBaru;

                            System.out.println("Reservasi berhasil diubah!");
                        } else {
                            System.out.println("Nomor tidak valid.");
                        }
                    }
                }

                case 4 -> {
                    // Hapus Reservasi
                    if (daftarReservasi.isEmpty()) {
                        System.out.println("Belum ada data reservasi untuk dihapus.");
                    } else {
                        System.out.print("Masukkan nomor reservasi yang ingin dihapus: ");
                        int index = input.nextInt();
                        input.nextLine();

                        if (index > 0 && index <= daftarReservasi.size()) {
                            daftarReservasi.remove(index - 1);
                            System.out.println("Reservasi berhasil dihapus!");
                        } else {
                            System.out.println("Nomor tidak valid.");
                        }
                    }
                }

                case 5 -> {
                    System.out.println("Terima kasih! Program selesai.");
                    return;
                }

                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }
}