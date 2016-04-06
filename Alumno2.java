
/**
 * Write a description of class Alumno2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno2{
    private String nombre;
    private int edad;
    public static int numeroClase = 0;
    private int[] notas;

    /**
     * Constructor for objects of class Alumno
     */
    public Alumno2(String nombre,int edad)
    {
        notas = new int[0];
        this.nombre= nombre;
        this.edad=edad;
        numeroClase ++;
    }

    /**
     * Método que permite introducir una nota entera del alumno.
     * Este método se peude invocar tantas veces como deseemos.
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void addNota(int nota)
    {
        int notasBis[] = new int [notas.length+1];
        for (int index = 0 ; index <notas.length; index++)
        {
            notasBis[index] = notas[index];
        }
        notasBis[notasBis.length-1]=nota;
        notas = notasBis;

    }

    /**
     * método que permita conocer la nota media (en decimal) del alumno en este momento.
     */
    public float notaMedia()
    {
        int sumaNotas=0;
        for(int index = 0; index < notas.length; index++)
        {
            sumaNotas+=notas[index];
        }
        return sumaNotas/notas.length;
    }

    /**
     * método que indica si el alumno esta aprobado o no en función de su nota media actual.
     */
    public String aprobado()
    {

        String mensaje ="APROBADO!!!!!!!!";
        if (notaMedia() < 5)
        {
            mensaje = "SUSPENSO!!!!!!";
        }
        return mensaje;
    }

    /**
     * método que muestra todos los datos del alumno: nombe, edad, numero de clase, notas, nota media y si esta o no aprobado.
     */
    public void muestraDatos()
    {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Numero de clase: " + numeroClase);
        System.out.println("-------NOTAS---------");
        for(int index = 0; index < notas.length; index++)
        {
            System.out.println("Nota numero "+ (index+1) + " : " + notas[index]);
        }
        System.out.println("===========================");
        System.out.println("Nota media: " + notaMedia());
        System.out.println(aprobado());
        System.out.println("*************************************************************************************");

    }

}
