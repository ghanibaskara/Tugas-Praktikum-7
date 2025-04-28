// subclass dari abstract class Kue dengan keyword extends
public class KuePesanan extends Kue {
    // atribut private untuk beratPesanan (double)
    private double beratPesanan;

    // constructor kelas KuePesanan dengan parameter namaKue, hargaKuePesanan, dan beratPesanan
    // memanggil constructor superclass Kue dengan keyword super
    KuePesanan(String namaKue, double hargaKuePesanan, double beratPesanan) {
        super(namaKue, hargaKuePesanan);
        this.beratPesanan = beratPesanan;
    }

    // getter dan setter untuk beratPesanan
    public void setBeratPesanan(double beratPesanan) {
        this.beratPesanan = beratPesanan;
    }

    public double getBeratPesanan() {
        return beratPesanan;
    }

    // method override dari method abstrak hitungHarga() pada superclass Kue
    // menghitung harga kuePesanan berdasarkan beratPesanan dan hargaKuePesanan
    @Override
    public double hitungHarga() {
        // mengembalikan nilai double harga kue x berat pesanan dengan return getHargaKue() * beratPesanan;
        return getHargaKue() * beratPesanan;
    }

    // method override dari method toString() pada superclass Kue
    // memanggil method toString() pada superclass Kue dengan keyword super kemudian menambahkan informasi beratPesanan dan hargaKuePesanan serta jenis kue
    // menggunakan String.format untuk format string agar bisa menampilkan harga dengan pemisah ribuan dan dua angka di belakang koma
    @Override
    public String toString() {
        return super.toString() + String.format(
                "Berat Pesanan: %.2f kg\n" +
                "Harga Kue Pesanan: Rp. %,.2f\n" +
                "Jenis Kue: Kue Pesanan\n",
                beratPesanan, hitungHarga());
    
    }
}
