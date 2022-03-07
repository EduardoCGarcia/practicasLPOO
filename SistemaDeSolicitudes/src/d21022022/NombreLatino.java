package d21022022;

/**
 *
 * @author EduardoCGarcia
 */
public class NombreLatino extends Nombre{
    
    private String segundoApellido;
    
    public NombreLatino(String nombres, String primerApellido, String segundoApellido) {
        super(nombres, primerApellido);
        this.setSegundoApellido(segundoApellido);
    }
    
    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        if(!segundoApellido.matches("[a-zA-Z\s]+") || !segundoApellido.startsWith(" ")  || segundoApellido.length() == 0)
            return;
        this.segundoApellido = segundoApellido;
    }

    @Override
    public String toString() {
        if (super.getTipo()==0) 
            return  super.getPrimerApellido() + " " + segundoApellido + " " + super.getNombres();
        else
            return  super.getNombres() + " " + super.getPrimerApellido() + " " + segundoApellido;
    }
    
    
    
}
