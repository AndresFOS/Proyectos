
package com.mycompany.plantas;

public class Flor extends Planta{

    private String colorPetalos;
    private int cantPetalos;
    private String colorPistillo;
    private String variedad;
    private String estacion;
    
    public Flor(){
        
    }

    public Flor(String colorPetalos, int cantPetalos, String colorPistillo, String variedad, String estacion, String nombre, double altoTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.colorPetalos = colorPetalos;
        this.cantPetalos = cantPetalos;
        this.colorPistillo = colorPistillo;
        this.variedad = variedad;
        this.estacion = estacion;
    }

    public String getColorPetalos() {
        return colorPetalos;
    }

    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }

    public int getCantPetalos() {
        return cantPetalos;
    }

    public void setCantPetalos(int cantPetalos) {
        this.cantPetalos = cantPetalos;
    }

    public String getColorPistillo() {
        return colorPistillo;
    }

    public void setColorPistillo(String colorPistillo) {
        this.colorPistillo = colorPistillo;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getEstacion() {
        return estacion;
    }

    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }
    
    @Override
    public void decirLoQueSoy() {
        System.out.println("Hola, soy una flor");
    }
    
}
