package javaapplication26;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class koneksi_db {
    private static Connection mysqlkonek;
    public static Connection koneksiDB() throws SQLException {
        if (mysqlkonek==null){
            try {
                String DB="jdbc:mysql://localhost:3306/tubes";
                String user="root";
                String pass="";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                mysqlkonek=(Connection) DriverManager.getConnection(DB,user,pass);
                JOptionPane.showMessageDialog(null, "koneksi berhasil");
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "koneksi gagal");
            }
        } return mysqlkonek;
    }
    public static void main(String[] args) {
        try{
            koneksiDB();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "koneksi gagal");
        }
    }
}