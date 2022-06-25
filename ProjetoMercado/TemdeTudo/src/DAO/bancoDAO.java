package DAO;


import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class bancoDAO {
    private Connection conn;
    public boolean executaComando( String comando){
        PreparedStatement ps;
        boolean resultadoComando = false;
        try {
            ps = conn.prepareStatement(comando);
            resultadoComando = ps.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "bancoDAO.executaComando " + ex.getMessage());
        }
        return resultadoComando;
    }
    public bancoDAO(){
         String textoConexao = "jdbc:mysql://localhost:3306/mercadotemdetudo?user=root&password=";
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(textoConexao);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "bancoDAO.bancoDAO " + ex.getMessage());
        }
    }
    
    
}
