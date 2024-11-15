import java.util.Scanner;

public class ArrayRataNilai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        int[] nilaiMahasiswa = new int[jumlahMahasiswa];

        int totalLulus = 0, totalTidakLulus = 0, jumlahLulus = 0, jumlahTidakLulus = 0;
        double rataRataLulus = 0, rataRataTidakLulus = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = sc.nextInt();

            if (nilaiMahasiswa[i] >= 70) {
                totalLulus += nilaiMahasiswa[i];
                jumlahLulus++;
            } else {
                totalTidakLulus += nilaiMahasiswa[i];
                jumlahTidakLulus++;
            }
        }

        if (jumlahLulus > 0) {
            rataRataLulus = (double) totalLulus / jumlahLulus;
        }
        if (jumlahTidakLulus > 0) {
            rataRataTidakLulus = (double) totalTidakLulus / jumlahTidakLulus;
        }

        System.out.println("Rata-rata nilai lulus = " + rataRataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataRataTidakLulus);

    }
}