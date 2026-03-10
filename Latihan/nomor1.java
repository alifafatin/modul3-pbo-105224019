import java.util.Scanner;

public class nomor1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("input angka pertama: ");
        double angka1 = input.nextDouble();
        System.out.print("input angka kedua: ");
        double angka2 = input.nextDouble();
        System.out.print("masukkan operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        switch(operator){
            case '+': 
                System.out.println("hasilnya: " + (angka1 + angka2));
                break;
            case '-':
                System.out.println("hasilnya: " + (angka1 - angka2));
                break;
            case '*':
                System.out.println("hasilnya: " + (angka1 * angka2));
                break;

            case '/':
                if (angka2 != 0){
                    System.out.println("hasilnya: " + (angka1 / angka2));
                } else {
                    System.out.println("eror, tidak misa membagi dengan 0");
                }
                break;
            default:
                System.out.println("operator nggak ada");
        }

        input.close();

    }

}