package perbankan;

public class Teller extends User {
    private Nasabah[] nasabah;
    private int jumlahNasabah;
    public Teller(String username, String password) { super(username, password); }
    public Teller() {
        nasabah = new Nasabah[200];
        jumlahNasabah = nasabah.length;
    }
    @Override
    public String getUsername() { return super.getUsername(); }
    @Override
    public String getPassword() { return super.getPassword(); }
    @Override
    public boolean login() { return super.login(); }
    public void tambahNasabah(String username, String password, String namalengkap) {
        Nasabah newNasabah = new Nasabah(username, password, namalengkap);
        nasabah[jumlahNasabah] = newNasabah;
        jumlahNasabah++;
    }
    public Nasabah[] getNasabah() { return nasabah; }
    public int getJumlahNasabah() { return jumlahNasabah; }
    public Nasabah getNasabah(int indeks) {
        if(indeks >= 0 && indeks < jumlahNasabah) return nasabah[indeks];
        else return null;
    }
}