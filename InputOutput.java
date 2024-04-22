import java.util.Scanner;

public class InputOutput{
    public static void main(String[] args){
        int i = 0;
        double ipk = 4.0;
        //NamaClass namaObject = new Constructor()
        Scanner scanner = new Scanner(System.in);
        String nama = "Mirza";
        System.out.println("Nama :" + nama);
        System.out.print("Input nama baru :");
        nama = scanner.nextLine();
        System.out.println("Nama baru:" + nama);

    }
}