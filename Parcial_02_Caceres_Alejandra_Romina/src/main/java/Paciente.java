
import java.util.Date;


/**
 *
 * @author Romin
 */
public class Paciente extends Persona {
    private int nroDocumento;
    private String domicilio;
    private String celular;
    
    public Paciente(){
        this.setId(0);
        this.setApellido("");
        this.setNombres("");
        this.setFechaNacimiento(null);
        this.setNroDocumento(0);
        this.setDomicilio("");
        this.setCelular("");
    }
    
       public Paciente(int id, String apellido, String nombres, Date fechNac,
             int nroDoc, String dom, String cel){
        super(id,apellido,nombres,fechNac);
        this.setNroDocumento(nroDoc);
        this.setDomicilio(dom);
        this.setCelular(cel);
    }

    public int getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(int nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
}
