package d21022022;

/**
 *
 * @author EduardoCGarcia
 */
public class Correo {
    private String dir;

    public Correo() {
    }

    public Correo(String dir) {
        setDir(dir);
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        if (dir == null || dir.length() < 3 || !(Character.isAlphabetic(dir.charAt(0)) || Character.isDigit(dir.charAt(0))) || 
                !dir.endsWith(".uaemex.mx") || !contieneArr(dir) || dir.matches("[^!#$%&/()=¨}{]") || !dir.contains(".") ||
                dir.endsWith(".") || dir.endsWith("@")) {
            return;
        }
        
        this.dir = dir;
    }
    
    static boolean contieneArr(String cad){
        int cont = 0;
        for (int i = 0; i < cad.length(); i++) {
            if (cad.charAt(i)=='@') {
                cont++;
            }
        }
        return cont == 1;
    }

    @Override
    public String toString() {
        return dir;
    }
    
    
}
