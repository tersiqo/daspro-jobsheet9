import java.util.Scanner;

public class SearchNilai22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang ingin diinput: ");
        int jumlahElemen = scanner.nextInt();

        int[] arrNilai = new int[jumlahElemen];

        System.out.println("Masukkan nilai-nilai:");
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            arrNilai[i] = scanner.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = scanner.nextInt();

        int noUrut = -1;
        for (int i = 0; i < jumlahElemen; i++) {
            if (arrNilai[i] == key) {
                noUrut = i;
                break;
            }
        }

        if (noUrut != -1) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (noUrut + 1));
        } else {
            System.out.println("Nilai yang dicaritidak ditemukan");
        }
    }
}