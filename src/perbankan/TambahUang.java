package perbankan;

public class TambahUang extends Tabungan {
    private double tingkatBunga;
    public TambahUang(int saldo, double tingkatBunga) {
        // this.saldo = saldo;
        super(saldo);
        this.tingkatBunga = tingkatBunga;
    }
    public double cekUang() {
        // return saldo += saldo * tingkatBunga;
        return saldo + saldo * tingkatBunga;
    }
}