

package com.mycompany.peluqueriacanina;

import com.mycompany.peluqueriacanina.igu.Principal;

public class PeluqueriaCanina {

    public static void main(String[] args) {
        
        //Con esto me aseguro que la interfaz gráfica se ejecute desde el Main
        Principal principal = new Principal();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
        
    }
}
