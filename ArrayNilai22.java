import java.util.Scanner;

public class ArrayNilai22 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        int [] nilaiAkhir = new int[10];

        for (int i = 0; i < 10; i++){
            System.out.print("Masukkan nilai akhir ke-"+i+" : ");
            nilaiAkhir[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] >= 70) {
                System.out.println("Mahasiswa ke-" + i + " Lulus");
            } else {
                System.out.println("Mahasiswa ke-" + i + " Tidak Lulus");
             }
        }
    }
}