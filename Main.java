public class Main {
    public static void main(String[] args) {
        // membuat array reference daftarKue dengan reference type Kue[] dengan panjang 20
        // membuat variabel totalHarga, totalBerat, totalJumlah, totalHargaKueJadi, dan totalHargaKuePesanan dengan tipe data double
        Kue[] daftarKue = new Kue[20];
        double totalHarga = 0.0;
        double totalBerat = 0.0;
        double totalJumlah = 0.0;
        double totalHargaKueJadi = 0.0;
        double totalHargaKuePesanan = 0.0;

        // membuat objek KueJadi dan KuePesanan dengan parameter namaKue, hargaKue, dan jumlahKueJadi/beratPesanan
        // memasukkan objek KueJadi dan KuePesanan ke dalam array reference daftarKue
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

        // menampilkan daftar kue, total harga, total berat kue pesanan, total harga kue pesanan, total jumlah kue jadi, total harga kue jadi, jenis kue dengan harga tertinggi, dan kue termahal
        System.out.println("Daftar Kue:");
        // for each loop untuk menampilkan daftar kue dari array reference daftarKue
        for (Kue kue : daftarKue) {
            // print out informasi kue dengan memanggil method toString() pada objek kue
            System.out.println(kue);
            // menambahkan totalHarga dengan harga kue dengan memanggil method hitungHarga() pada objek kue
            totalHarga += kue.hitungHarga();
            // menambahkan totalBerat atau totalJumlah dengan beratPesanan atau jumlahKueJadi sesuai dengan jenis kue serta menambahkan totalHargaKuePesanan atau totalHargaKueJadi dengan harga kue dengan memanggil method hitungHarga() pada objek kue
            // menggunakan instanceof untuk mengecek apakah objek kue merupakan objek KuePesanan atau KueJadi (instanceof adalah operator untuk mengecek apakah objek merupakan instance dari class tertentu/objek dari subclass tertentu)
            if (kue instanceof KuePesanan) {
                // jika objek kue merupakan objek KuePesanan, maka tambahkan totalBerat dengan beratPesanan dan totalHargaKuePesanan dengan harga kue
                // menggunakan casting untuk mengubah tipe data objek kue menjadi KuePesanan
                totalBerat += ((KuePesanan)kue).getBeratPesanan();
                totalHargaKuePesanan += kue.hitungHarga();
            } else if (kue instanceof KueJadi) {
                // jika objek kue merupakan objek KueJadi, maka tambahkan totalJumlah dengan jumlahKueJadi dan totalHargaKueJadi dengan harga kue
                totalJumlah += ((KueJadi) kue).getJumlahKueJadi();
                totalHargaKueJadi += kue.hitungHarga();
            }
        }

        // menampilkan total harga, total berat kue pesanan, total harga kue pesanan, total jumlah kue jadi, total harga kue jadi, jenis kue dengan harga tertinggi, dan kue termahal
        System.out.printf("Total Harga Kue: Rp. %,.2f\n", totalHarga);
        System.out.println("----------------------------------------");
        System.out.printf("Total Berat Kue Pesanan: %.2f kg\n", totalBerat);
        System.out.printf("Total Harga Kue Pesanan: Rp. %,.2f\n", totalHargaKuePesanan);
        System.out.println("----------------------------------------");
        System.out.printf("Total Jumlah Kue Jadi: %.0f\n", totalJumlah);
        System.out.printf("Total Harga Kue Jadi: Rp. %,.2f\n", totalHargaKueJadi);
        System.out.println("----------------------------------------");
        // menggunakan operator ternary untuk menentukan jenis kue dengan harga tertinggi
        // jika totalHargaKuePesanan lebih besar dari totalHargaKueJadi, maka jenis kue dengan harga tertinggi adalah Kue Pesanan, jika tidak maka Kue Jadi
        System.out.printf("Jenis Kue dengan harga penjualan tertinggi: %s\n", 
                (totalHargaKuePesanan > totalHargaKueJadi) ? "Kue Pesanan" : "Kue Jadi");
        System.out.printf("Total Harga Jenis Kue Termahal: Rp. %,.2f\n", totalHargaKuePesanan);
        System.out.println("----------------------------------------");

        // mencari kue dengan harga akhir termahal dengan menggunakan loop for each untuk menampilkan kue termahal dari array reference daftarKue
        // membuat variabel kueTermahal dengan tipe data Kue dan inisialisasi dengan null

        Kue kueTermahal = null;
        for (Kue kue : daftarKue) {
            // jika kueTermahal null atau harga kue lebih besar dari harga kue termahal, maka kue termahal adalah kue tersebut
            // menggunakan method hitungHarga() untuk menghitung harga kue
            // menggunakan operator > untuk membandingkan harga kue dengan harga kue termahal
            if (kueTermahal == null || kue.hitungHarga() > kueTermahal.hitungHarga()) {
                // apabilsa kondisi if terpenuhi yaitu harga kue lebih besar dari harga kue termahal, maka kue termahal adalah kue tersebut 
                // kue termahal diisi dengan objek kue tersebut
                kueTermahal = kue;
            }
        }
        // menampilkan kue termahal dengan memanggil method toString() pada objek kue termahal
        System.out.println("Kue dengan harga termahal:");
        System.out.println(kueTermahal);
        
    }
}