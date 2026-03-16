import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner input = new Scanner(System.in);

        System.out.print("Masukkan usia Anda: ");
        int usia = input.nextInt(); 
        System.out.print ("Masukkan berat badan (kg): ");
        double beratBadan = input.nextDouble();
        System.out.print("Masukkan kadar hemoglobin (g/dl): ");
        double hemoglobin = input.nextDouble();

        if (usia >= 17){
            if (usia <= 60){
                if (beratBadan >= 45){
                    if (hemoglobin >= 12.5){
                        System.out.println("Anda memenuhi syarat untuk mendonorkan darah.");
                    } else {
                        System.out.println("Maaf, Anda tidak memenuhi syarat karena kadar hemoglobin Anda kurang dari 12.5 g/dl.");
                    }
                } else {
                    System.out.println("Maaf, Anda tidak memenuhi syarat karena berat badan Anda kurang dari 45 kg.");
                }
            } else {
                System.out.println("Maaf, Anda tidak memenuhi syarat karena usia Anda lebih dari 60 tahun.");
            }
        } else {
            System.out.println("Maaf, Anda tidak memenuhi syarat karena usia Anda kurang dari 17 tahun.");
        }
        input.close();
    }
}
