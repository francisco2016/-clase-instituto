
 /**
 * Cada alumno se caracteriza por un nombre, una edad, su número de clase (que empieza en 1 para el primer alumno y que debe
 * generarse automáticamente, es decir, no se pasa como parámetro al constructor). Esta clase alumno debe contar con 4 métodos:
 * 1.   Un método que permita introducir una nota entera del alumno. Este método se peude invocar tantas veces como deseemos.
 * 2.   Un método que permita conocer la nota media (en decimal) del alumno en este momento.
 * 3.   Un método que indique si el alumno esta aprobado o no en función de su nota media actual.
 * 4.   Un método que muestre todos los datos del alumno: nombe, edad, numero de clase, notas, nota media y si esta o no aprobado.
 */

public class Alumno
{
    // instance variables - replace the example below with your own
    private String nombre;
    private int edad;
    private int numClase;
    public static final int nota  = 1;
    private int[] notas;

    /**
     * Constructor for objects of class Alumno
     */
    public Alumno(String nombre, int edad )
    {
        this.nombre = nombre;
        this.edad = edad;
        numClase++;
        notas = new int[0];
    }

    /**
     * para introducir las notas del alummno.
     */
    public void addNota(int nota){
        int[] notas2 = notas;
        notas = new int[notas2.length + 1];
        for(int i = 0; i < notas2.length; i ++){
            notas[i] = notas2[i];
        }
        notas[notas2.length] = nota;
    }

    /**
     * método que permita conocer la nota media (en decimal) del alumno en este momento
     */
    public float notaMedia(){
        float sumaNotas = 0;
        for(int i = 0; i < notas.length; i ++){
            sumaNotas+= notas[i];
        }
        return sumaNotas/notas.length;
    }
    
    /**
     * método que indique si el alumno esta aprobado o no en función de su nota media actual.
     */
    public void haAprobado(){
        if(notaMedia() >= 5){
            System.out.println(" APROBADO ¡¡¡¡");
        }
        else{System.out.println(" SUSPENSO !!!!");}
    }
}




















