package perbankan;

public class TopUpDompetDigital extends Tabungan {
    protected String namaDompetDigital;
    protected int saldoDompetDigital = 0;
    protected String namaTransaksi = "";
    public TopUpDompetDigital(int saldo, String namaDompetDigital) {
        super(saldo);
        this.namaDompetDigital = namaDompetDigital;
    }
    public void ambilUangTabungan(int jumlahUang) { saldo -= jumlahUang; }
    public void TopUp(int jumlahUang) { saldoDompetDigital += jumlahUang; }
    public boolean GunakanSaldoDompet(int jumlahUang, String namaTransaksi) {
        if( jumlahUang <= 0 || jumlahUang > saldoDompetDigital ) {
            System.out.println("Pembayaran Dompet Digital Gagal, Saldo Tabungan tidak mencukupi");
            return false; // Saldo tidak mencukupi atau jumlah-nya negatif
        }
        saldoDompetDigital -= jumlahUang;
        this.namaTransaksi += namaTransaksi;
        return true;
    }
    public int getSaldo() { return saldo; }
    public int getSaldoDompetDigital() { return saldoDompetDigital; }
    public String getNamaDompetDigital() { return namaDompetDigital; }

    public String getNamaTransaksi() { return namaTransaksi; }
}