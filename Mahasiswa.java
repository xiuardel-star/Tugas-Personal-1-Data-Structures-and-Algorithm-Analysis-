// Nama class diperbaiki dari Mahaiswa menjadi Mahasiswa
public class Mahasiswa {
    // Seluruh atribut dijadikan private untuk memenuhi prinsip enkapsulasi [1]
    private String nama;
    private String nim;
    private String jurusan;
    private double ipk; 

    // Constructor untuk inisialisasi data [3]
    public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    // Method Getter untuk NIM agar bisa diakses di class Main [2]
    public String getNim() {
        return nim;
    }

    // Getter dan Setter untuk IPK [4]
    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        if (ipk >= 0.0 && ipk <= 4.0) { // Validasi rentang IPK
            this.ipk = ipk;
        }
    }

    // Method untuk mengecek status kelulusan (IPK >= 3.00) [5, 6]
    public String cekKelulusan() {
        return (this.ipk >= 3.00) ? "Lulus" : "Belum Lulus";
    }

    // Method untuk menentukan predikat akademik sesuai kriteria [7]
    public String hitungPredikat() {
        if (ipk >= 3.75) return "Dengan Pujian";
        else if (ipk >= 3.50) return "Sangat Memuaskan";
        else if (ipk >= 3.00) return "Memuaskan";
        else return "Perlu Perbaikan";
    }

    // Method untuk menampilkan informasi lengkap [8]
    public void tampilkanLengkap() {
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Jurusan : " + jurusan);
        System.out.printf("IPK     : %.2f%n", ipk);
        System.out.println("Status  : " + cekKelulusan());
        System.out.println("Predikat: " + hitungPredikat());
        System.out.println("-------------------------");
    }

    // Method untuk memperbarui IPK dengan pesan konfirmasi [5]
    public void updateIpk(double ipkBaru) {
        setIpk(ipkBaru);
        System.out.println("Data berhasil diperbarui!");
    }
}