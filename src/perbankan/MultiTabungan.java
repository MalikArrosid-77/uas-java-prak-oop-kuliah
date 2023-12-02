package perbankan;

public class MultiTabungan {
    private int saldoIDR;
    // Constructor untuk inisialisasi saldo dalam IDR
    public MultiTabungan(int initSaldoIDR) { saldoIDR = initSaldoIDR; }
    // Method untuk mendapatkan saldo dalam mata uang IDR
    public int getSaldoIDR() { return saldoIDR; }
    // Method untuk menyimpan uang dalam mata uang tertentu
    public void simpanUang( int jumlahUang, String mataUang ) {
        if( "AUD".equals( mataUang ) ) {
            saldoIDR += jumlahUang * 10000; // 1 AUD = 10.000 IDR
        } else if( "USD".equals( mataUang ) ) {
            saldoIDR += jumlahUang * 9000; // 1 USD = 9.000 IDR
        } else { saldoIDR += jumlahUang; } // mata uang IDR, tidak ada konversi
    }
    // Method untuk mengambil uang dalam mata uang tertentu
    public boolean ambilUang(int jumlahUang, String mataUang) {
        if( jumlahUang <= 0 || jumlahUang > saldoIDR ) return false; // Saldo tidak mencukupi atau jumlah-nya negatif
        if( "AUD".equals( mataUang ) ) {
            int jumlahUangIDR = jumlahUang * 10000; // 1 AUD = 10.000 IDR
            if( saldoIDR >= jumlahUangIDR ) {
                saldoIDR -= jumlahUangIDR;
                return true;
            }
        } else if( "USD".equals( mataUang ) ) {
            int jumlahUangIDR = jumlahUang * 9000; // 1 USD = 9.000 IDR
            if( saldoIDR >= jumlahUangIDR ) {
                saldoIDR -= jumlahUangIDR;
                return true;
            }
        } else {
            if( saldoIDR >= jumlahUang ) {
                saldoIDR -= jumlahUang;
                return true;
            }
        }
        return false; // return value default
    }
}