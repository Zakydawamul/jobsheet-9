import java.util.Scanner;
public class ArrayRataNilai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahSiswa = 0;
        System.out.print("Masukkan jumlah Siswa: ");
        jumlahSiswa = sc.nextInt();
        int[] nilaiMhs = new int[jumlahSiswa];
        double totalLulus = 0, totalTidakLulus = 0, rata2Lulus, rata2TidakLulus;
        int siswaLulus = 0;
        
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++){
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                siswaLulus += 1;
            } else {
                totalTidakLulus += nilaiMhs[i];
            }
        }
        rata2Lulus = totalLulus/siswaLulus;
        rata2TidakLulus = totalTidakLulus/(nilaiMhs.length - siswaLulus);
        System.out.println("Rata-rata nilai lulus = "+rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = "+rata2TidakLulus);
    }
}