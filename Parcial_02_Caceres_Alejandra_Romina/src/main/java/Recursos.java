/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Romin
 */
public class Recursos {
    private int computadora;
    private int muebles;
    private int televisor;
    private int silla;
    private int cama1plaza;
    private int cama2plaza;

    public Recursos(int computadora, int muebles, int televisor, int silla, int cama1plaza, int cama2plaza) {
        this.computadora = computadora;
        this.muebles = muebles;
        this.televisor = televisor;
        this.silla = silla;
        this.cama1plaza = cama1plaza;
        this.cama2plaza = cama2plaza;
    }

    public int getComputadora() {
        return computadora;
    }

    public void setComputadora(int computadora) {
        this.computadora = computadora;
    }

    public int getMuebles() {
        return muebles;
    }

    public void setMuebles(int muebles) {
        this.muebles = muebles;
    }

    public int getTelevisor() {
        return televisor;
    }

    public void setTelevisor(int televisor) {
        this.televisor = televisor;
    }

    public int getSilla() {
        return silla;
    }

    public void setSilla(int silla) {
        this.silla = silla;
    }

    public int getCama1plaza() {
        return cama1plaza;
    }

    public void setCama1plaza(int cama1plaza) {
        this.cama1plaza = cama1plaza;
    }

    public int getCama2plaza() {
        return cama2plaza;
    }

    public void setCama2plaza(int cama2plaza) {
        this.cama2plaza = cama2plaza;
    }
    public static void main(String[] args) {
        // Crear una instancia de Recursos con valores de ejemplo
        Recursos recursos = new Recursos(10, 20, 5, 30, 15, 10);

        // Obtener la cantidad de camas de una plaza y televisores
        int camas1Plaza = recursos.getCantidadCama1Plaza();
        int televisores = recursos.getCantidadTelevisores();

        // Mostrar los resultados
        System.out.println("Cantidad de camas de una plaza: " + camas1Plaza);
        System.out.println("Cantidad de televisores: " + televisores);
    }

    private int getCantidadCama1Plaza() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private int getCantidadTelevisores() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
