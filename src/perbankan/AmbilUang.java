package perbankan;

public class AmbilUang extends Tabungan {
    private int proteksi;
    public AmbilUang(int saldo) { super(saldo); }
    public AmbilUang(int saldo, int proteksi) {
        super(saldo);
        this.proteksi = proteksi;
    }
    public boolean ambilUang(int jumlahUang) {
        if(jumlahUang <= saldo - proteksi) {
            saldo -= proteksi;
            saldo -= jumlahUang;
        }
        else { return false; }
        return true;
    }
    public int getSaldo() { return saldo; }
}