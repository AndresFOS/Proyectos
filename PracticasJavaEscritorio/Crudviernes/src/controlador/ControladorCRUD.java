
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.PersonaDAO;
import vista.Jfvista;

public class ControladorCRUD implements ActionListener, KeyListener{
    Jfvista vc = new Jfvista();
    PersonaDAO mc = new PersonaDAO();
    
    //constructor
    public ControladorCRUD(Jfvista vc, PersonaDAO mc)
    {
        this.mc = mc;
        this.vc = vc;
        this.vc.btnregistrar.addActionListener(this);
        this.vc.btnlistar.addActionListener(this);
        this.vc.btneditar.addActionListener(this);
        this.vc.btneliminar.addActionListener(this);
        this.vc.btnok.addActionListener(this);
        this.vc.btnok.setVisible(false); 
        this.vc.txtced.addKeyListener(this);
        this.vc.txtnom.addKeyListener(this);
        this.vc.txtape.addKeyListener(this);
        this.vc.txtsue.addKeyListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vc.btnregistrar)
        {
            if(validar()==1)
            {   
                String rpta= mc.insper(Integer.parseInt(vc.txtced.getText()), vc.txtnom.getText(), vc.txtape.getText(), Float.parseFloat(vc.txtsue.getText()));
                if(rpta!=null){
                    JOptionPane.showMessageDialog(null, rpta);
                    borrar();
                    Llenartabla(vc.jtdatos);
                }else
                    JOptionPane.showMessageDialog(null, "el registro ya existe");
            }
        }
        
        if(e.getSource()==vc.btnlistar)
            Llenartabla(vc.jtdatos);
        
        if(e.getSource()==vc.btneditar)
        {
            int cf = vc.jtdatos.getSelectedRowCount();
            int fe = vc.jtdatos.getSelectedRow();
            if(cf==1 && fe>=0)
            {
                vc.txtced.setText(String.valueOf(vc.jtdatos.getValueAt(fe, 0)));
                vc.txtnom.setText(String.valueOf(vc.jtdatos.getValueAt(fe, 1)));
                vc.txtape.setText(String.valueOf(vc.jtdatos.getValueAt(fe, 2)));
                vc.txtsue.setText(String.valueOf(vc.jtdatos.getValueAt(fe, 3)));
                vc.txtced.setEnabled(false);
                vc.btnregistrar.setEnabled(false);
                vc.btneditar.setEnabled(false);
                vc.btneliminar.setEnabled(false);
                vc.btnlistar.setEnabled(false);
                vc.btnok.setVisible(true);
                vc.txtnom.requestFocus();
                //JOptionPane.showMessageDialog(null, "ok");
            }
            else
                JOptionPane.showMessageDialog(null, "seleccione una fila");
        }
        
        if(e.getSource()==vc.btnok)
        {
            if(validar()==1)
            {
                if(mc.ediper(Integer.parseInt(vc.txtced.getText()), vc.txtnom.getText(), vc.txtape.getText(), Float.parseFloat(vc.txtsue.getText()))==1)
                    JOptionPane.showMessageDialog(null, "registro actualizado");
                vc.txtced.setEnabled(true);
                vc.btnregistrar.setEnabled(true);
                vc.btneditar.setEnabled(true);
                vc.btneliminar.setEnabled(true);
                vc.btnlistar.setEnabled(true);
                vc.btnok.setVisible(false);
                borrar();
                Llenartabla(vc.jtdatos);
            }
        }
        
        if(e.getSource()==vc.btneliminar)
        {
            if(vc.jtdatos.getSelectedRowCount()==1)
            {
                int fe = vc.jtdatos.getSelectedRow();
                if(mc.eliper(Integer.parseInt(String.valueOf(vc.jtdatos.getValueAt(fe, 0))))>0)
                    JOptionPane.showMessageDialog(null, "registro eliminado");
                Llenartabla(vc.jtdatos);
            }else
                JOptionPane.showMessageDialog(null, "seleccione un registro");
            
        }
    }
    
    //borrar
    public void borrar(){
        vc.txtced.setText("");
        vc.txtnom.setText("");
        vc.txtape.setText("");
        vc.txtsue.setText("");
        vc.txtced.requestFocus();
    }
    //validar
    public int validar()
    {
        int b=0;
        if(vc.txtced.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "falta la cedula");
            vc.txtced.requestFocus();
        }else if(vc.txtnom.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "falta la nombre");
            vc.txtnom.requestFocus();
        }else if(vc.txtape.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "falta la apellido");
            vc.txtape.requestFocus();
        }else if(vc.txtsue.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "falta la sueldo");
            vc.txtsue.requestFocus();
        }else 
            b=1;
        return b;
    }
    
    //llenar la tabla
    public void Llenartabla(JTable tablaD)
    {
        DefaultTableModel modeloT = new DefaultTableModel();
        tablaD.setModel(modeloT);
        modeloT.addColumn("CEDULA");
        modeloT.addColumn("NOMBRES");
        modeloT.addColumn("APELLIDOS");
        modeloT.addColumn("SUELDO");
        Object [] col = new Object[4];
        for(int i=0 ; i<mc.lisper().size() ; i++)
        {
            col[0] = mc.lisper().get(i).getCed();
            col[1] = mc.lisper().get(i).getNom();
            col[2] = mc.lisper().get(i).getApe();
            col[3] = mc.lisper().get(i).getSue();
            modeloT.addRow(col);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        if(e.getSource()==vc.txtced || e.getSource()==vc.txtsue)
            if(c<'0' || c>'9')
                e.consume();
        
        if(e.getSource()==vc.txtnom || e.getSource()==vc.txtape)
            if((c<'a' || c>'z')&&(c<'A' || c>'Z') && c!=' ' && c!='ñ' && c!='Ñ')
                e.consume();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
}
