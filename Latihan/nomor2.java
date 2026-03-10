import java.util.Scanner;

public class nomor2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int pinRight = 123456;
        int percobaan = 0;

        while(percobaan < 3){
            System.out.print("masukkan PIN: ");
            int pin = input.nextInt();
            if(pin == pinRight){
                System.out.println("login sukses");
                break;
            } else {
                percobaan++;
                System.out.println("pin salah");
            } if (percobaan == 3){
                System.out.println("akun diblokir");
            }
        }
        input.close();
    }
}