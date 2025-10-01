/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.ejerciciotres;

/**
 *
 * @author MATEO
 */
public class Ejerciciotres {

    public static void main(String[] args) {
        
        Estudiantes estudianteUno = new Estudiantes ();
    estudianteUno.nombre = "Pedro";
    estudianteUno.identificacion = "2100101118";
    estudianteUno.calificacionPromedio = 10;
        System.out.println("nombre: "+estudianteUno.nombre);
        System.out.println("identificacion: "+estudianteUno.identificacion);
        System.out.println("promedio: "+estudianteUno.calificacionPromedio);
        
        
         Estudiantes estudianteDos = new Estudiantes ();
    estudianteDos.nombre = "Tandazo";
    estudianteDos.identificacion = "2101089222";
    estudianteDos.calificacionPromedio = 7;
        System.out.println("nombre: "+estudianteDos.nombre);
        System.out.println("identificacion: "+estudianteDos.identificacion);
        System.out.println("promedio: "+estudianteDos.calificacionPromedio);
    }
    }

