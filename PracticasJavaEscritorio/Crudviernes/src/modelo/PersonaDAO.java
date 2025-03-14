
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PersonaDAO {
    Conexion conexion = new Conexion();
    
    public PersonaDAO(){
    
    }
    //insertar
    public String insper(int ced, String nom, String ape, float sue){
        String rpta=null;
        try {
            Connection acceso = conexion.getconexion();
            PreparedStatement ps = acceso.prepareStatement(
            "insert into persona (cedper, nomper, apeper, sueper) values (?,?,?,?)");
            ps.setInt(1, ced);
            ps.setString(2, nom);
            ps.setString(3, ape);
            ps.setFloat(4, sue);
            if(ps.executeUpdate()>0)
                rpta = "Registro exitoso";
            ps.close();
            acceso.close();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return rpta;
    }
    //listar
    public ArrayList<Persona> lisper(){
        ArrayList listper = new ArrayList();
        Persona per;
        try {
            Connection acceso = conexion.getconexion();
            PreparedStatement ps = acceso.prepareStatement("select * from persona");
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                per = new Persona();
                per.setCed(rs.getInt(1));
                per.setNom(rs.getString(2));
                per.setApe(rs.getString(3));
                per.setSue(rs.getFloat(4));
                listper.add(per);
            }
            rs.close();
            ps.close();
            acceso.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return listper;
    }
    //editar
    public int ediper(int ced, String nom, String ape, float sue)
    {
        int b=0;
        try {
            Connection acceso = conexion.getconexion();
            PreparedStatement ps = acceso.prepareStatement(
            "update persona set nomper=?, apeper=?, sueper=? where cedper=?");
            ps.setString(1, nom);
            ps.setString(2, ape);
            ps.setFloat(3, sue);
            ps.setInt(4, ced);
            b = ps.executeUpdate();
            ps.close();
            acceso.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return b;
    }
    
    //eliminar
    public int eliper(int ced)
    {
        int b=0;
        try {
            Connection acceso = conexion.getconexion();
            PreparedStatement ps = acceso.prepareStatement(
            "delete from persona where cedper=?");
            ps.setInt(1, ced);
            b = ps.executeUpdate();
            ps.close();
            acceso.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return b;
    }
}
