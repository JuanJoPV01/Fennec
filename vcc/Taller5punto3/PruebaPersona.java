package personas;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona p = new Persona();

        
        p.setNombre("Juan");
        System.out.println("Nombre: " + p.getNombre()); 

        
       

        
        p.edad = 25;
        System.out.println("Edad: " + p.edad); 
    }
}
