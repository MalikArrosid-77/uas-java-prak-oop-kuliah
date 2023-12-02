import perbankan.*;

public class TesBankApp {
    public static void main(String[] args) {
        // Tambah Nasabah
//        Teller addNasabahUser = new Teller();
//        addNasabahUser.tambahNasabah("Ardi", "12345", "Ahmad Ardianga");
//        System.out.println("Nasabah yang baru ditambah : ");
//        System.out.println("Nama Lengkap : " + addNasabahUser.getNasabah(0));
//        System.out.println("Username : " + addNasabahUser.getNasabah(1));
//        System.out.println("Password : *****");

        // Login Teller
//        User teller1 = new Teller("Bima", "a2341");
//        if(teller1.login()) System.out.println("Login Teller Berhasil");
//        else System.out.println("Login Teller Gagal!!!");
//        System.out.println("\nDengan Rincian Username dan Password Teller : ");
//        System.out.println("Username : " + teller1.getUsername());
//        System.out.println("Password : *****");

        // Login Nasabah
//        User nasabah1 = new Nasabah("Ardi", "12345");
//        if(nasabah1.login()) System.out.println("Login Nasabah Berhasil");
//        else System.out.println("Login Nasabah Gagal!!!");
//        System.out.println("\nDengan Rincian Username dan Password Nasabah : ");
//        System.out.println("Username : " + nasabah1.getUsername());
//        System.out.println("Password : *****");

        // Tambah Uang
//        TambahUang transaksi1 = new TambahUang(5000, 8.5/100);
//        System.out.println("Uang yang ditabung : 5000");
//        System.out.println("Tingkat bunga sekarang : 8.5%");
//        System.out.println("Total uang anda sekarang : " + transaksi1.cekUang() + "\n");

        // Ambil Uang
//        AmbilUang transaksi2 = new AmbilUang(5425, 500);
//        transaksi2.ambilUang(3000);
//        System.out.println("Uang yang ditabung : 5425");
//        System.out.println("Uang Proteksi : 500");
//        System.out.println("Uang yang akan di ambil : 3000");
//        System.out.println("Total uang anda sekarang : " + transaksi2.getSaldo());

        // Multi Tabungan
//        MultiTabungan tabungan = new MultiTabungan(2000000); // Saldo awal 2.000.000 IDR
//        System.out.println("Saldo anda sekarang sebelum penambahan : " + tabungan.getSaldoIDR() + " IDR");
//        tabungan.simpanUang(200, "AUD"); // Menyimpan 200 AUD
//        tabungan.simpanUang(150, "USD"); // Menyimpan 150 USD
//        tabungan.simpanUang(75000, "IDR"); // Menyimpan 75000 IDR
//        System.out.println("Saldo anda sekarang setelah penambahan : " + tabungan.getSaldoIDR() + " IDR");
//        boolean success = tabungan.ambilUang( 30, "USD" ); // Mengambil 30 USD
//        if( success ) {
//            System.out.println("\nPengambilan uang sukses");
//            System.out.println("Saldo anda sekarang : " + tabungan.getSaldoIDR() + " IDR");
//        } else {
//            System.out.println("\nMohon Maaf! 🙏 Pengambilan uang gagal. Saldo anda tidak mencukupi.");
//        }

        // Top Up Dompet Digital
//        TopUpDompetDigital dompetDigital = new TopUpDompetDigital(2000000, "Gopay");
//        System.out.println("Top Up Dompet Digital");
//        System.out.println("Saldo Dompet Digital Sebelum Top Up : " + dompetDigital.getSaldoDompetDigital());
//        System.out.println("Saldo Tabungan Sebelum Top Up Dompet Digital : " + dompetDigital.getSaldo() + "\n");
//
//        dompetDigital.ambilUangTabungan(80000);
//        dompetDigital.TopUp(80000);
//        if(dompetDigital.getSaldoDompetDigital() <= dompetDigital.getSaldo()) {
//            System.out.println("Top Up Dompet Digital Berhasil" + "\n");
//            System.out.println("Rincian Top Up Dompet Digital");
//            System.out.println("Top Up Dompet Digital sebanyak : " + dompetDigital.getSaldoDompetDigital());
//            System.out.println("Nama Dompet Digital : " + dompetDigital.getNamaDompetDigital());
//            System.out.println("Saldo " + dompetDigital.getNamaDompetDigital() + " Setelah Top Up : " + dompetDigital.getSaldoDompetDigital());
//            System.out.println("Saldo Tabungan Setelah Top Up Dompet Digital : " + dompetDigital.getSaldo());
//        } else System.out.println("Top Up Dompet Digital Gagal, karena Saldo Tabungan tidak mencukupi");
//
//        dompetDigital.GunakanSaldoDompet(20000, "Pesan Makanan Online");
//        System.out.println("\nSaldo " + dompetDigital.getNamaDompetDigital() + " setelah digunakan : " + dompetDigital.getSaldoDompetDigital());
//        System.out.println("Nama Transaksi Dompet Digital: " + dompetDigital.getNamaTransaksi());

        // Tagihan
//        Tagihan tagihan = new Tagihan(3000000);
//        tagihan.bayarTagihan(100000, "Tagihan Listrik");
//        System.out.println("\nRincian Tagihan");
//        System.out.println("Nama Tagihan : " + tagihan.getNamaTagihan());
//        System.out.println("Saldo Tabungan Setelah Bayar Tagihan : " + tagihan.getSaldo());
    }
}