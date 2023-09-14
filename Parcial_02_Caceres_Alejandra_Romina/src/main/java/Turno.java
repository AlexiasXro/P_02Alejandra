
import java.util.Date;


/**
 *
 * @author Romin
 */
public class Turno {

    private int nro;
    private Date fechaTurno;
    private Paciente paciente;

    public Turno(){
        this.setNro(0);
        this.setFechaTurno(null);
        this.setPaciente(new Paciente());
    }

    public Turno(int nro, Date fecha, Paciente p){
        this.setNro(nro);
        this.setFechaTurno(fecha);
        this.setPaciente(p);
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public Date getFechaTurno() {
        return fechaTurno;
    }

    public void setFechaTurno(Date fechaTurno) {
        this.fechaTurno = fechaTurno;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
}
