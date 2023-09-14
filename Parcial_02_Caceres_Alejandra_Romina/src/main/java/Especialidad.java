
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Romin
 */
public class Especialidad extends Persona {
  private int id;
    private String nombre;
    private ArrayList<Turno> turnos;
    private String Secretario;

    
    public Especialidad(){
        this.setId(0);
        this.setNombre("");
        this.setTurnos(new ArrayList<Turno>());
    }
    
    public Especialidad(int id, String nombre, ArrayList<Turno> turList){
        this.setId(id);
        this.setNombre(nombre);
        this.setTurnos(turList);
        this.Secretario = Secretario;
    }

    public String getSecretario() {
        return Secretario;
    }

    public void setSecretario(String secretario) {
        this.Secretario = secretario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(ArrayList<Turno> turnos) {
        this.turnos = turnos;
    }
    
}
