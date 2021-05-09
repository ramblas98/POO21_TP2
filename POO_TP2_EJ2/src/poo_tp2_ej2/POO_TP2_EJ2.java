
package poo_tp2_ej2;

/**
 *
 * @author Antonio
 */
public class POO_TP2_EJ2 {

    public static void main(String[] args) {
        Fecha fecha1 = new Fecha(21,4,1922);
        Fecha fecha2 = new Fecha(45,12,1999);
        Fecha fecha3 = new Fecha(18,67,2001);
        
        fecha2.reiniciar(15,8,1996);
        fecha1.adelantar(22);
        boolean f;
        f = fecha3.valida();
        System.out.println(f);
        
       if(Fecha.bisiesto(fecha2.getAnio())== true){
           System.out.println("Fecha 2 es Bisiesta");
       }
       else{
           System.out.println("Fecha 2 no es bisiesta");
       }
       
       fecha1.normalizar();
       fecha2.normalizar();
       fecha3.normalizar();
       
       fecha1.imprimir();
       fecha2.imprimir();
       fecha3.imprimir();
    }
    
}
