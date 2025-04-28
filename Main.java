public class Main {
    public static void main(String[] args) {
        Kue[] daftarKue = new Kue[20];
        Double totalHarga = 0.0;
        Double totalBerat = 0.0;
        Double totalJumlah = 0.0;
        Double totalHargaKueJadi = 0.0;
        Double totalHargaKuePesanan = 0.0;

        daftarKue[0] = new KueJadi("Brownies", 20000, 2);
        daftarKue[1] = new KuePesanan("Tart", 50000, 1.5);
        daftarKue[2] = new KueJadi("Donat", 10000, 5);
        daftarKue[3] = new KuePesanan("Kue Lapis", 30000, 2);
        daftarKue[4] = new KueJadi("Bolu Kukus", 15000, 3);
        daftarKue[5] = new KuePesanan("Kue Cubit", 12000, 1);
        daftarKue[6] = new KueJadi("Kue Lumpur", 18000, 2);
        daftarKue[7] = new KuePesanan("Kue Nastar", 40000, 1.2);
        daftarKue[8] = new KueJadi("Kue Putu", 9000, 4);
        daftarKue[9] = new KuePesanan("Kue Sagu", 25000, 1.8);
        daftarKue[10] = new KueJadi("Kue Cubit", 12000, 3);
        daftarKue[11] = new KuePesanan("Kue Soes", 35000, 2.1);
        daftarKue[12] = new KueJadi("Kue Pancong", 8000, 6);
        daftarKue[13] = new KuePesanan("Kue Kastengel", 45000, 1.3);
        daftarKue[14] = new KueJadi("Kue Ape", 7000, 7);
        daftarKue[15] = new KuePesanan("Kue Semprit", 22000, 2.4);
        daftarKue[16] = new KueJadi("Kue Bugis", 11000, 3);
        daftarKue[17] = new KuePesanan("Kue Putri Salju", 38000, 1.6);
        daftarKue[18] = new KueJadi("Kue Dadar Gulung", 13000, 3);
        daftarKue[19] = new KuePesanan("Kue Lemper", 27000, 2.2);

        System.out.println("Daftar Kue:");
        for (Kue kue : daftarKue) {
            System.out.println(kue);
            totalHarga += kue.hitungHarga();
            if (kue instanceof KuePesanan) {
                totalBerat += ((KuePesanan)kue).getBeratPesanan();
                totalHargaKuePesanan += kue.hitungHarga();
            } else if (kue instanceof KueJadi) {
                totalJumlah += ((KueJadi) kue).getJumlahKueJadi();
                totalHargaKueJadi += kue.hitungHarga();
            }
        }
        System.out.printf("Total Harga Kue: Rp. %,.2f\n", totalHarga);
        System.out.println("----------------------------------------");
        System.out.printf("Total Berat Kue Pesanan: %.2f kg\n", totalBerat);
        System.out.printf("Total Harga Kue Pesanan: Rp. %,.2f\n", totalHargaKuePesanan);
        System.out.println("----------------------------------------");
        System.out.printf("Total Jumlah Kue Jadi: %.0f\n", totalJumlah);
        System.out.printf("Total Harga Kue Jadi: Rp. %,.2f\n", totalHargaKueJadi);
        System.out.println("----------------------------------------");
        System.out.printf("Jenis Kue dengan harga tertinggi: %s\n", 
                (totalHargaKuePesanan > totalHargaKueJadi) ? "Kue Pesanan" : "Kue Jadi");
        System.out.printf("Total Harga Jenis Kue Termahal: Rp. %,.2f\n", totalHargaKuePesanan);
        System.out.println("----------------------------------------");
        Kue kueTermahal = null;
        for (Kue kue : daftarKue) {
            if (kueTermahal == null || kue.hitungHarga() > kueTermahal.hitungHarga()) {
                kueTermahal = kue;
            }
        }
        System.out.println("Kue Termahal:");
        System.out.println(kueTermahal);
        
    }
}