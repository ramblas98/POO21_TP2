
package poo_tp2_ej2;

/**
 *
 * @author  Marco  Antonio
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
        this.dia = 0;
        this.mes = 0;
        this.anio = 0;
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    //Metodos
    
    public void reiniciar(int d, int m, int a){
        this.dia = d;
        this.mes = m;
        this.anio = a;
    }
    
    public static boolean bisiesto(int a){
        if((a%4==0)&&((a%100!=0)||(a%400==0))){
            return true;
        }
        else{
            return false;
        }
    }
    
    public int dias(int m){
        if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12){
            return 31;
        }
        else{
            if(m==4 || m==6 || m==9 || m==11){
                return 30;
            }
            else{
                return 28;
            }
        }
        
    }
    
    public boolean valida(){
        if(this.dia > this.dias(this.mes) || this.dia < 1){
            return false;
        }
        else{
            if(this.mes>12 || this.mes < 1){
                return false;
            }
            else{
                if(this.anio < 1){
                    return false;
                }
            }
        }
        
        return true;
    }
    
    public void normalizar(){
        if(this.anio < 1){
            System.out.println("No se puede normalizar la fecha , Año menor a 1");
        }
        else{
            while(this.mes>12){
                 this.mes = this.mes - 12;
                 this.anio++;
            }
            while(this.dia>this.dias(this.mes)){
                this.dia = this.dia - this.dias(this.mes);
                this.mes++;
                if(this.mes>12){
                    this.mes = this.mes - 12;
                    this.anio++;
                }
            }
        }
    }
    
    public void adelantar(int d){
        this.dia+=d;
        this.normalizar();
    }
    
    public void imprimir(){
        System.out.println("La fecha es "+this.dia+"/"+this.mes+"/"+this.anio);
    }
    
    
}
