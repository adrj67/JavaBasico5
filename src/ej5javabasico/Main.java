
package ej5javabasico;

import java.util.List;

public class Main {
    
    static CocheCRUD cocheCRUD = new CocheCRUDImpl();

    public static void main(String[] args) {
        
        Coche ford = new Coche("Ford", "F100", 3.0f, 2);
        Coche chevy = new Coche("Chevrolet", "Agile", 1.4f, 3);
        Coche fiat = new Coche("Fiat", "600", 1.0f, 2);
        Coche renault = new Coche("Renault", "Fuego", 1.6f, 4);

        //Guardar coches
        cocheCRUD.save(ford);
        cocheCRUD.save(chevy);
        cocheCRUD.save(fiat);
        cocheCRUD.save(renault);
        System.out.println("Metodo Save - Se guardaron los coches: " + cocheCRUD);
        
        //Consultar coches
         List<Coche> coches = cocheCRUD.findAll();
        System.out.println("Listar coches guardados en la lista: \n" + coches);
        
        //Borrar coches
        System.out.println("Metodo delete - se borro el coche: " + coches.remove(2));
        
        List<Coche> coches2 = cocheCRUD.findAll();
        System.out.println("Listar coches despues de borrar uno: \n" + coches2);
    }
    
}
