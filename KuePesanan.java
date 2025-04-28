public class KuePesanan extends Kue {
    private double beratPesanan;
    private double hargaKuePesanan;

    KuePesanan(String namaKue, double hargaKuePesanan, double beratPesanan) {
        super(namaKue, hargaKuePesanan);
        this.beratPesanan = beratPesanan;
    }

    public void setBeratPesanan(double beratPesanan) {
        this.beratPesanan = beratPesanan;
    }

    public double getBeratPesanan() {
        return beratPesanan;
    }

    @Override
    public double hitungHarga() {
        return getHargaKue() * beratPesanan;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(
                "Berat Pesanan: %.2f kg\n" +
                "Harga Kue Pesanan: Rp. %,.2f\n" +
                "Jenis Kue: Kue Pesanan\n",
                beratPesanan, hitungHarga());
    
    }
}
