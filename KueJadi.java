// subclass dari abstrak Kue dengan keyword extends
public class KueJadi extends Kue {
    // atribut private untuk jumlahKueJadi (double)
    private double jumlahKueJadi;

    // constructor kelas KueJadi dengan parameter namaKue, hargaKueJadi, dan jumlahKueJadi
    KueJadi(String namaKue, double hargaKueJadi, double jumlahKueJadi) {
        super(namaKue, hargaKueJadi);
        this.jumlahKueJadi = jumlahKueJadi;
    }

    // getter dan setter untuk jumlahKueJadi
    public void setJumlahKueJadi(double jumlahKueJadi) {
        this.jumlahKueJadi = jumlahKueJadi;
    }

    public double getJumlahKueJadi() {
        return jumlahKueJadi;
    }

    // method override dari method abstrak hitungHarga() pada superclass Kue
    // menghitung harga kueJadi berdasarkan jumlahKueJadi dan hargaKueJadi
   @Override
   public double hitungHarga() {
    // mengembalikan nilai double harga kue x jumlah kue jadi x 2 dengan return getHargaKue() * jumlahKueJadi * 2;
       return getHargaKue() * jumlahKueJadi * 2;
   }

   // memanggil method toString() pada superclass Kue dengan keyword super kemudian menambahkan informasi jumlahKueJadi dan hargaKueJadi serta jenis kue
    // menggunakan String.format untuk format string agar bisa menampilkan harga dengan pemisah ribuan dan dua angka di belakang koma
    @Override
    public String toString() {
        return super.toString() + String.format(
                "Jumlah Kue Jadi: %.0f \n" +
                "Harga Kue Jadi: Rp. %.2f\n" +
                "Jenis Kue: Kue Jadi\n",
                jumlahKueJadi, hitungHarga());

}
}
    