package javaapplication26;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class koneksi {
 
    private static Connection koneksi;
 
    public static Connection getKoneksi() {
        if (koneksi == null) {
            try {
                Class.forName("net.sourceforge.jtds.jdbc.Driver");
                System.out.println("Class Driver Ditemukan");
                try {
                    String url = "jdbc:jtds:sqlserver://127.0.0.1:1433/tubes"; //buka =  nama database yang digunakan 
                    koneksi = DriverManager.getConnection(url, "bagas3003", "Baba3003"); 
//irvan123 = user yang dibuat di SSMS , irvan1234 = passwod dari usernya 
                    System.out.println("Koneksi Database sukses");
                } catch (SQLException se) {
                    System.out.println("Koneksi Database Gagal error:" + se);
                    System.exit(0);
                }
            } catch (ClassNotFoundException cnfe) {
                System.out.println("Class tidak ditemukan, error: " + cnfe);
                System.exit(0);
            }
        }
        return koneksi;
    }
}
class Test{
     public static void main(String[] args) throws SQLException {
        koneksi connection = new koneksi();
        connection.getKoneksi();
    }
}
