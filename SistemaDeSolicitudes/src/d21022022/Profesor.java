package d21022022;

/**
 *
 * @author EduardoCGarcia
 */
public class Profesor extends Empleado{
    private static final byte LENGTH = 5;
    
    public Profesor(Nombre nombre, Correo correo, String numero) {
        super(nombre, correo);
        this.setNumero(numero);
    }

    @Override
    public void setNumero(String numero) {
        if(numero.length() != LENGTH && numero.matches("[1-9]+"))
            return;
        super.setNumero(numero); 
    }
    
    @Override
    public String toString() {
        return super.toString();
    }

    
    
}
