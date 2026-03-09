import java.util.Scanner;

public class LogiCalc {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println(" === Sistem Logical FastSend === ");

        System.out.print(" Masukkan Nama Klien: ");
        String namaKlien = input.nextLine();

        System.out.print(" Masukkan berat (kg): ");
        double berat = input.nextDouble();

        System.out.print (" Masukkan jarak (km): ");
        int jarakTujuan = input.nextInt();

        System.out.print(" Masukkan jumlah box: ");
        int jumlahBox = input.nextInt();

        int kapasitasTruk = 150;
        int trukPenuh = jumlahBox / kapasitasTruk;
        int sisaBox = jumlahBox % kapasitasTruk;
        int tarifJarak = 15000;

        double tarifBerat = 5500;
        double dasarBiaya = (tarifJarak * jarakTujuan) + (tarifBerat * berat);
        double asuransiWajib = 0.035 * dasarBiaya;
        double totalBiaya = dasarBiaya + asuransiWajib;

        int kecepatan = 60;
        int waktuTempuh = jarakTujuan / kecepatan;
        int waktuMenit = jarakTujuan % kecepatan;

        System.out.println( " === Resi Pengiriman === ");
        System.out.println(" Nama Klien: " + namaKlien);
        System.out.println(" Total box: " + jumlahBox + " box");
        System.out.println("Kebutuhan Armada: [" + trukPenuh + "] Truk Penuh dan sisa [" + sisaBox + "] box via Pikap.");
        System.out.println("Estimasi Waktu : [" + waktuTempuh + "] Jam [" + waktuMenit + "] Menit (Asumsi 60km/jam)");

        System.out.println(" === RINCIAN BIAYA === ");
        System.out.println("Dasar Biaya : Rp [" + dasarBiaya + "]");
        System.out.println("Asuransi (3.5%) : Rp [" + asuransiWajib + "]");
        System.out.println("----------------------------------------------");
        System.out.println("TOTAL BAYAR : Rp [" + totalBiaya + "]");

        input.close();

    }
}
