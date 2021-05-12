
package poo_tp2_ej3;

/**
 *
 * @author Antonio
 */
public class POO_TP2_EJ3 {

  
    public static void main(String[] args) {
        Comision comision1 = new Comision(80);
        
        comision1.agregarEstudiante("Perez","Ana", 238940, "anaperez@gmail.com");
        comision1.agregarEstudiante("Martinez","Pity",8320923, "madrid912@gmail.com");
        comision1.agregarEstudiante();
        
        comision1.mostrarLista();
        comision1.ordenarLista();
        
        
        
    }
    
}
