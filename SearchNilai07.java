import java.util.Scanner;
public class SearchNilai07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int jumlahNilai = 0;
        System.out.print("Masukkan jumlah nilai yang akan diinput: ");
        jumlahNilai = sc.nextInt();

        int[] arrNilai = new int[jumlahNilai];
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+i+" : ");
            arrNilai[i] = sc.nextInt();
        }
        int key, hasil = 0;
        System.out.print("Masukkan nilai yang akan dicari: ");
        key = sc.nextInt();
        for (int i = 0; i < arrNilai.length; i++){
            if (key == arrNilai[i]) {
                hasil = i;
                break;
            } else {
                hasil =arrNilai.length + 1;
            }
        }
        System.out.println();
        if (hasil == arrNilai.length+1) {
            System.out.println("key "+key+ " tidak ditemukan");
        } else {
        System.out.println("Nilai "+key+", merupakan nilai mahasiswa ke-"+hasil);
        }
        System.out.println();
    }
}
