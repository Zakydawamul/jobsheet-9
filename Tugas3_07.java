import java.util.Scanner;
public class Tugas3_07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", 
        "Teh Tarik", "Cappucino", "Chocolate Ice"};

        System.out.println("=======MENU ZAK'S KAFE=======");
        for (int i = 0; i < menu.length; i++){
            System.out.println("- "+menu[i]);
        }
        System.out.print("Masukkan menu makanan yang ingin dicari: ");
        String makananDicari = sc.nextLine();

        boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++){
            if (menu[i].equalsIgnoreCase(makananDicari)) {
                ditemukan = true;
                break;
            }
        }
        System.out.println("Menu \""+makananDicari+"\" "+(ditemukan ?"tersedia di menu":"Tidak tersedia di menu"));

    }
    
}
