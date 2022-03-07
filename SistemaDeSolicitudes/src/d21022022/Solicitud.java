package d21022022;

import java.util.Date;

/**
 *
 * @author EduardoCGarcia
 */
public class Solicitud {
    private Date fecha;
    private String Asunto;
    private String solicidante;

    public Solicitud() {
    }

    public Solicitud(Date fecha, String Asunto, String solicidante) {
        this.fecha = fecha;
        this.Asunto = Asunto;
        this.solicidante = solicidante;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        /*
        No debe estar en periodo de vacaciones
        No debe estar en el futuro
        
        */
        this.fecha = fecha;
    }

    public String getAsunto() {
        return Asunto;
    }

    public void setAsunto(String Asunto) {
        /*
        No debe ser nulo
        No debe seer una cadena vacia
        */
        this.Asunto = Asunto;
    }

    public String getSolicidante() {
        return solicidante;
    }

    public void setSolicidante(String solicidante) {
        /*
            
        */
        this.solicidante = solicidante;
    }
    
    
    
    
}
