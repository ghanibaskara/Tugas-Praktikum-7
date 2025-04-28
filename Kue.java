//abstract class Kue
public abstract class Kue {
    // atribut private untuk namaKue(String) dan hargaKue(Double)
    private String namaKue;
    private double hargaKue;

    // constructor kelas Kue dengan parameter namaKue dan hargaKue
    Kue(String namaKue, double hargaKue) {
        this.namaKue = namaKue;
        this.hargaKue = hargaKue;
    }

    // getter dan setter untuk namaKue dan hargaKue
    public void setHargaKue(double hargaKue) {
        this.hargaKue = hargaKue;
    }

    public double getHargaKue() {
        return hargaKue;
    }

    public String getNamaKue() {
        return namaKue;
    }

    public void setNamaKue(String namaKue) {
        this.namaKue = namaKue;
    }

    // Method abstrak untuk menghitung harga kue (abstract method tidak memiliki body)
    public abstract double hitungHarga();

    // Method toString untuk menampilkan informasi kue
    // Menggunakan String.format untuk format string agar bisa menampilkan harga dengan pemisah ribuan dan dua angka di belakang koma
    @Override
    public String toString() {
        return String.format(
                "Nama Kue: %s\n" +
                "Harga Kue: Rp. %,.2f\n",
                namaKue, hargaKue);
    }
}
