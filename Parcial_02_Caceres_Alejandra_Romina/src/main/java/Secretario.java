
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Romin
 */
public class Secretario extends Persona{
    private String horarioSecretario;

    public Secretario(String turno) {
        this.horarioSecretario = turno;
    }

    public Secretario(String turno, int id, String apellido, String nombres, Date fechaNacimiento) {
        super(id, apellido, nombres, fechaNacimiento);
        this.horarioSecretario = turno;
    }

    public String getTurno() {
        return horarioSecretario;
    }

    public void setTurno(String turno) {
        this.horarioSecretario = turno;
    }
    
}
