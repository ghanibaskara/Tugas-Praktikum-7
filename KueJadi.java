public class KueJadi extends Kue {
    private double JumlahKueJadi;

    KueJadi(String namaKue, double hargaKueJadi, double JumlahKueJadi) {
        super(namaKue, hargaKueJadi);
        this.JumlahKueJadi = JumlahKueJadi;
    }

    public void setJumlahKueJadi(double JumlahKueJadi) {
        this.JumlahKueJadi = JumlahKueJadi;
    }

    public double getJumlahKueJadi() {
        return JumlahKueJadi;
    }

   @Override
   public double hitungHarga() {
       return getHargaKue() * JumlahKueJadi * 2;
   }

    @Override
    public String toString() {
        return super.toString() + String.format(
                "Jumlah Kue Jadi: %.0f \n" +
                "Harga Kue Jadi: Rp. %.2f\n" +
                "Jenis Kue: Kue Jadi\n",
                JumlahKueJadi, hitungHarga());

}
}
    