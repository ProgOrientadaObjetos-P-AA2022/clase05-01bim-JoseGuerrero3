/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author SALA I
 */
public class Ejecutor02 {
    public static void main(String[] arga) {
        //1. Crear una persona del Barrio el valle de la ciudad de Loja
        //2. Crear una persona del Barrio Central de la ciudad de cuenca
        //3. Crear una persona del Barrio Centenario de la ciudad de Guayaquil
        
        Ciudad ciudad1 = new Ciudad("Loja");
        Ciudad ciudad2 = new Ciudad("Cuenca");
        Ciudad ciudad3 = new Ciudad("Guayaquil");

        
        Barrio barrio1 = new Barrio("Valle", ciudad1);
        Barrio barrio2 = new Barrio("Central", ciudad2);
        Barrio barrio3 = new Barrio("Centenario",ciudad3);
        
        Persona persona1 = new Persona("Jose Guerrero", "1100675767", barrio1);
        Persona persona2 = new Persona("Daniela Morillo", "1108987545", barrio2);
        Persona persona3 = new Persona("Domenica Diaz", "110567568", barrio3);
        
        System.out.println("------------------------------------------");
        System.out.printf("El barrio de la persona %s es: %s\n Y pertenece a la "
                + "ciudad: %s\n",
                persona1.obtenerNombre(),
                persona1.obtenerBarrio().obtenerNombre(),
                persona1.obtenerBarrio().obtenerCiudad().obtenerNombre()); 
        System.out.println("------------------------------------------");
        
        persona1.establecerBarrio(barrio2);
        
        System.out.printf("El barrio de la persona %s es: %s\n Y pertenece a la "
                + "ciudad: %s\n",
                persona2.obtenerNombre(),
                persona2.obtenerBarrio().obtenerNombre(),
                persona2.obtenerBarrio().obtenerCiudad().obtenerNombre());
        
        System.out.println("------------------------------------------");
        
        persona1.establecerBarrio(barrio3);
        
        System.out.printf("El barrio de la persona %s es: %s\n Y pertenece a la "
                + "ciudad: %s\n",
                persona3.obtenerNombre(),
                persona3.obtenerBarrio().obtenerNombre(),
                persona3.obtenerBarrio().obtenerCiudad().obtenerNombre());
        
        
    }
    
}
