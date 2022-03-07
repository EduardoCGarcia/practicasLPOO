package d21022022;

/**
 *
 * @author EduardoCGarcia
 */
public class Solicitante {
    private Nombre nombre;
    private Correo correo;
    private String numero;

    public Solicitante(Nombre nombre, Correo correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }

    public Correo getCorreo() {
        return correo;
    }

    public void setCorreo(Correo correo) {
        this.correo = correo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero){}

    @Override
    public String toString() {
        return nombre.toString()  + correo + numero;
    }
    
    
}
