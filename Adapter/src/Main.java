
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class Main {
    public static void main (String[] args){
        PersonaVieja personavieja = new PersonaVieja();
        personavieja.setApellido("Ramirez");
        personavieja.setNombre("Jesus");
        GregorianCalendar g = new GregorianCalendar();
        g.set(2000, 01, 01);
        Date d = g.getTime();
        personavieja.setFechaDeNacimiento(d);
        IPersonaVieja personaVieja = null;
        
        
        ViejaToNuevaAdapter personaNueva = new ViejaToNuevaAdapter(personaVieja);
        
        System.out.println(personaNueva.getEdad());
        System.out.println(personaNueva.getNombre());
        
        personaNueva.setEdad(10);
        personaNueva.setNombre("Juan perez");
        
        System.out.println(personaNueva.getEdad());
        System.out.println(personaNueva.getNombre());
        
        
    }
    
}
