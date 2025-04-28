public abstract class Kue {
    private String namaKue;
    private double hargaKue;

    Kue(String namaKue, double hargaKue) {
        this.namaKue = namaKue;
        this.hargaKue = hargaKue;
    }

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

    public abstract double hitungHarga();

    @Override
    public String toString() {
        return String.format(
                "Nama Kue: %s\n" +
                "Harga Kue: Rp. %,.2f\n",
                namaKue, hargaKue);
    }
}
