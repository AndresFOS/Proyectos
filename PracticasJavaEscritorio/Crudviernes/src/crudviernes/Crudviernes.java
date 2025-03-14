
package crudviernes;

import controlador.ControladorCRUD;
import modelo.PersonaDAO;
import vista.Jfvista;



public class Crudviernes {

    public static void main(String[] args) {
        Jfvista v = new Jfvista();
        PersonaDAO p = new PersonaDAO();
        ControladorCRUD c = new ControladorCRUD(v, p);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }
    
}
