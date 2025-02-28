public class AlatMusikTradisional {
    private String kode;
    private String nama;
    private String kategori;
    private double harga;
    private int stok;

    public AlatMusikTradisional(String kode, String nama, double harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.kategori = "Tradisional";
        this.harga = harga;
        this.stok = stok;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    @Override
    public String toString() {
        return kode + " - " + nama + " - " + kategori + " - Rp" + harga + " - Stok: " + stok;
    }
}
