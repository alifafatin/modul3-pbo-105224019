import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan;
        int saldo = 500000;
        int setor;
        int tarik;

        do {
            System.out.println(" === menu ATM === ");
            System.out.println("1. cek saldo anda");
            System.out.println("2. Ssetor tunai anda");
            System.out.println("3. tarik tunai anda");
            System.out.println("4. keluar");
            System.out.print("pilih menu yang mana: ");
            pilihan = input.nextInt();

            switch(pilihan){
                case 1:
                    System.out.print("Saldo anda adalah Rp " + saldo);
                    break;

                case 2:
                    System.out.print("masukkan jumlah uang yang ingin disetor: ");
                    setor = input.nextInt();
                    saldo += setor;
                    System.out.println("saldo anda sekarang adalah Rp " + saldo);
                    break;

                case 3:
                    System.out.print("masukkan jumlah uang yang ingin ditarik: ");
                    tarik = input.nextInt();
                    
                    if (saldo - tarik < 500000){
                        System.out.println("maaf, saldo anda tidak mencukupi untuk melakukan penarikan, saldo minimum adalah Rp 500000");
                    } else {
                        saldo = saldo - tarik;
                        System.out.println("penarikan berhasil, saldo anda sekarang adalah Rp " + saldo);
                    }  
                    break;
                    
                case 4:
                    System.out.println("terimakasih telah menggunakan layanan ATM kami");
                    break;
                default:
                    System.out.println("pilihan tidak tersedia");

            }
            System.out.println();
        } while (pilihan != 4);
        input.close();
    }
}