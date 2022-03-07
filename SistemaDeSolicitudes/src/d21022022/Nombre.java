package d21022022;

/**
 *
 * @author EduardoCGarcia
 */
public class Nombre {
    private String nombres;
    private String primerApellido;
    private int tipo;/*0 = AAN    1 = NAA*/

    public Nombre(String nombres, String primerApellido) {
        this.setNombres(nombres);
        this.setPrimerApellido(primerApellido);
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        if(!nombres.matches("[a-zA-Z\s]+") && nombres.startsWith(" ") || nombres.length() == 0 )
            return;
        this.nombres = nombres;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        if(!primerApellido.matches("[a-zA-Z\s]+") || primerApellido.startsWith(" ") || primerApellido.length() == 0)
            return;
        this.primerApellido = primerApellido;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    
    
    @Override
    public String toString() {
        if (this.tipo==0) 
            return  primerApellido + " " +nombres;
        else
            return  nombres + " " + primerApellido;
        
        
    }
    
}
