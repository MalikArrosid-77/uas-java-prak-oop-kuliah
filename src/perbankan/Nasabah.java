package perbankan;

public class Nasabah extends User {
    private Tabungan tabungan;
    private String namalengkap;
    public Nasabah(String username, String password) {
        super(username, password);
    }
    public Nasabah(String username, String password, String namalengkap) {
        super(username, password);
        this.namalengkap = namalengkap;
    }
    @Override
    public String getUsername() { return username; }
    @Override
    public String getPassword() { return password; }
    public String getNamalengkap() { return namalengkap; }
    @Override
    public boolean login() { return super.login(); }
    public Tabungan getTabungan() { return tabungan; }
    public void setTabungan(Tabungan tabungan) { this.tabungan = tabungan; }
}