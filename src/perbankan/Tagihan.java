package perbankan;

public class Tagihan extends Tabungan {
    protected String namaTagihan = "";
    public Tagihan(int saldo) {
        super(saldo);
    }
    public int getSaldo() { return saldo; }
    public String getNamaTagihan() { return namaTagihan; }
    public boolean bayarTagihan(int jumlahTagihan, String namaTagihan) {
        if( jumlahTagihan <= 0 || jumlahTagihan > saldo ) {
            System.out.println("Pembayaran Tagihan Gagal, Saldo Tabungan tidak mencukupi");
            return false; // Saldo tidak mencukupi atau jumlah-nya negatif
        }
        saldo -= jumlahTagihan;
        this.namaTagihan = namaTagihan;
        System.out.println("Pembayaran Tagihan Berhasil");
        System.out.println("Besaran Tagihan : " + jumlahTagihan);
        return true;
    }
}