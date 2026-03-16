import java.util.Scanner;

public class Kiosk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    //Stok awal sesuai dengan kebutuhan yang sudah dilampirkan pada THT
        int stokvip = 5;
        int stoktribune = 35;
        int stokfestival = 25;

        int hargavip = 1500000;
        int hargafestival = 800000;
        int hargatribune = 500000;

        String kategori = "";
        int harga = 0;
        int stok = 0;
        int batas = 0;
        int tiketdone = 0;
        int tagihan = 0;
        int umur = 0;

        boolean mesinnyala = true;

        while (mesinnyala) {
            System.out.println("========================================");
            System.out.println("Universitas Pertamina SoundFest 2026");
            System.out.println("========================================");
            System.out.println("sisa stok tiket: ");
            System.out.println("1. VIP Rp " + hargavip + " = Stok: " + stokvip + " (syarat: Minimal Umur 18 Tahun)");
            System.out.println("2. Festival Rp " + hargafestival + " = Stok: " + stokfestival + " (syarat: Minimal Umur 15 Tahun)");
            System.out.println("3. Tribune Rp " + hargatribune + " = Stok: " + stoktribune + " (syarat: tidak ada syarat umur)");
            System.out.println("4. Matikan Mesin");
            System.out.println("========================================");
            System.out.print("Pilih tiket yang anda inginkan: ");

            int pilih = input.nextInt();
        //pilihan untuk mematikan program (pilihan menu rahasia)
            if (pilih == 4) {
                System.out.println("Thank You!");
                mesinnyala = false;
                break;
            }

            if (pilih < 1 || pilih > 4) {
                System.out.println("Pilihan tidak valid. Silakan pilih tiket yang tersedia, pilih 1 - 4 ");
                continue;
            }
        //pilihan tiket yang harus sesuai dengan batas umurnya dan stok yang tersedia
            switch (pilih) {
                case 1:
                    kategori = "vip";
                    harga = hargavip;
                    stok = stokvip;
                    batas = 18;
                    break;

                case 2:
                    kategori = "festival";
                    harga = hargafestival;
                    stok = stokfestival;
                    batas = 15;
                    break;

                case 3:
                    kategori = "tribune";
                    harga = hargatribune;
                    stok = stoktribune;
                    batas = 0; 
                    break;
            }
        
        //imput dari user untuk memasukkan jumlah yang akan dibeli oleh pembeli
            System.out.print("Masukkan jumlah tiket " + kategori + ": ");
            int jumlahbeli = input.nextInt();

            if (jumlahbeli <= 0) {
                System.out.println("Jumlah tiket tidak valid, silahakan coba lagi");
                continue;
            }

            if (jumlahbeli > stok){
                System.out.println("Sorry, stok tiket " + kategori + " tidak cukup. Stok yang tersedia: " + stok);
                continue;
            }

        //input data pembeli dari user
            System.out.println("=== Input Data Pembeli ===");

            tiketdone = 0;
            tagihan = 0;
            boolean batalDarurat = false;

            for (int i = 1; i <= jumlahbeli; i++) {
                System.out.println("==== Tiket " + kategori + " ke-" + i + " ====");

                boolean inputumur = false;

                while (!inputumur) {
                    System.out.print("Masukkan umur (ketik -1 untuk keluar): ");
                    umur = input.nextInt();

                   if (umur == -1) {
                    System.out.println("Pembelian dibatalkan.");
                    batalDarurat = true;
                    break;
                }

                    if (umur <= 0 || umur >= 150) {
                        System.out.println("Usia tidak logis. Silakan masukkan kembali");
                        continue;
                    }

                    inputumur = true;
                }

                //keluar ketika batal darurat
                if(batalDarurat){
                    break;
                }

                 if (batas > 0 && umur < batas) {
                    System.out.println("Maaf, umur tidak memenuhi syarat untuk tiket " + kategori);
                    System.out.println("Tiket ke-" + i + " dibatalkan.");
                    continue;
                }
            //tiket diproses jika memenuhi syarat umur dan stok tersedia
                System.out.println("Tiket ke-" + i + " diterima.");
                tiketdone++;
                tagihan += harga;

                switch (pilih) {
                    case 1:
                        stokvip--;
                        break;

                    case 2:
                        stokfestival--;
                        break;

                    case 3:
                        stoktribune--;
                        break;
                }
            }

             if (batalDarurat) {
                continue;
            }

            if (tiketdone > 0) {
                System.out.println("========================================");
                System.out.println(" Nota Pembelian Tiket SoundFest 2026 ");
                System.out.println("========================================");
                System.out.println("Kategori: " + kategori);
                System.out.println("Jumlah Tiket dipesan: " + jumlahbeli);
                System.out.println("Jumlah tiket berhasil dibeli: " + tiketdone);
                System.out.println("Tiket gagal: " + (jumlahbeli - tiketdone));
                System.out.println("Total Harga: Rp " + tagihan);
                System.out.println("========================================");
                System.out.println("Terima kasih sudah berkunjung ke situs Universitas Pertamina SoundFest 2026");
            } else if (jumlahbeli > 0 && tiketdone == 0) {
                System.out.println("Tidak ada tiket yang berhasil diproses");
            
        }

        input.close();
    }
 }
}