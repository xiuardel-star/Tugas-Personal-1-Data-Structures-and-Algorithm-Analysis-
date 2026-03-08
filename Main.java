import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Menyimpan 5 objek Mahasiswa ke dalam array [1, 9]
        Mahasiswa[] daftar = new Mahasiswa[5];
        daftar[0] = new Mahasiswa("Ardelia", "99123456", "Teknik Informatika", 3.75);
        daftar[1] = new Mahasiswa("Cindy", "99453688", "Teknik Informatika", 3.40);
        daftar[2] = new Mahasiswa("Wulandari", "99176553", "Teknik Informatika", 3.90);
        daftar[3] = new Mahasiswa("Eka Putra", "99634367", "Teknik Informatika", 3.00);
        daftar[4] = new Mahasiswa("Rivaldy", "99843235", "Teknik Informatika", 3.20);

        // Menampilkan data awal menggunakan loop [15, 16]
        System.out.println("=== Data Mahasiswa Awal ===");
        for (Mahasiswa m : daftar) {
            m.tampilkanLengkap();
        }

        // Fitur Update IPK menggunakan Scanner [15, 16]
        System.out.print("Masukkan NIM mahasiswa yang ingin diupdate: ");
        String cariNim = input.nextLine();
        
        boolean ditemukan = false;
        for (Mahasiswa m : daftar) {
            // Memanggil method getNim() yang sudah ditambahkan [15]
            if (m.getNim().equals(cariNim)) {
                System.out.print("Masukkan IPK baru: ");
                double ipkBaru = input.nextDouble();
                m.updateIpk(ipkBaru);
                
                System.out.println("\n=== Data Mahasiswa Setelah Update ===");
                m.tampilkanLengkap();
                ditemukan = true;
                break;
            }
        }
        
        if (!ditemukan) {
            System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
        }
        input.close();
    }
}