
package comunes;

/**
 *
 * @author Alumno Mañana
 */
public class Operaciones {
    
    public int n1;
    public int n2;
    
    //getter and setter
    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
    
    //constructor
    public Operaciones(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public Operaciones() {
    }
    
    

    //toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Operaciones{n1=").append(n1);
        sb.append(", n2=").append(n2);
        sb.append('}');
        return sb.toString();
    }
    
    public void suma(int n1, int n2){
        System.out.println("La suma entre "+n1 + " y " + n2 + " es: "+(n1 + n2));
    }
    public void resta(int n1, int n2){
        System.out.println("La resta entre "+n1 + " y " + n2 + " es: "+(n1 - n2));
    }
    public void multiplicacion(int n1, int n2){
        System.out.println("La multiplicación entre "+n1 + " y " + n2 + " es: "+(n1 * n2));
    }
    public void division(int n1, int n2){
        System.out.println("La división entre "+n1 + " y " + n2 + " es: "+(n1 / n2));
    }
    
    
    
    

}
