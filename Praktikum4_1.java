
import java.util.Scanner;

public class Bab4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan, b = 0, c = 0, z = 0, t = 0;
        int a[] = null;
        boolean kondisi = false;
        while (true) {
            System.out.println("1. Input Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Average");
            System.out.println("4. Sum");
            System.out.println("5. Max");
            System.out.println("6. Min");
            System.out.println("7. Keluar");
            System.out.print("Masukkan nilai : ");
            pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    kondisi = true;
                    System.out.print("Masukkan Panjang:");
                    b = sc.nextInt();
                    a = new int[b];
                    for (int i = 0; i < b; i++) {
                        System.out.print("Nilai " + (i + 1) + " : ");
                        a[i] = sc.nextInt();
                    }
                    break;
                case 2:
                    if (kondisi == false) {
                        System.out.println("Masukkan Array Pada Pilihan 1");
                    } else {
                        for (int i = 0; i < b; i++) {
                            System.out.print(a[i] + ", ");
                        }
                    }
                    break;
                case 3:
                    if (kondisi == false) {
                        System.out.println("Masukkan Array Pada Pilihan 1");
                    } else {
                        for (int i = 0; i < b; i++) {
                            c += a[i];
                        }
                        z = c / b;
                        System.out.println(z);
                    }
                    break;
                case 4:
                    if (kondisi == false) {
                        System.out.println("Masukkan Array Pada Pilihan 1");
                    } else {
                        System.out.println(c);
                    }
                    break;
                case 5:
                    if (kondisi == false) {
                        System.out.println("Masukkan Array Pada Pilihan 1");
                    } else {
                        for (int i = 0; i < b; i++) {
                            if (a[i] > t) {
                                t = a[i];
                            }
                        }
                        System.out.println(t);
                    }
                    break;
                case 6:
                    if (kondisi == false) {
                        System.out.println("Masukkan Array Pada Pilihan 1");
                    } else {
                        for (int i = 0; i < b; i++) {
                            if (a[i] < t) {
                                t = a[i];
                            }
                        }
                        System.out.println(t);
                    }
                    break;
                case 7:
                    System.out.println("Anda Keluar Dari Program");
                    return;
                default:
                    break;
            }
        }
    }
}
