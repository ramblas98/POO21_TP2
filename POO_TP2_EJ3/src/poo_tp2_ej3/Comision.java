
package poo_tp2_ej3;

import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class Comision {
    private int totalClases;
    private Estudiante listaEstudiantes[];
    private int totalEstudiantes;
    Scanner teclado = new Scanner(System.in);

    public Comision() {
         this.listaEstudiantes = new Estudiante[35];
    }

    public Comision(int totalClases) {
        this.totalClases = totalClases;
        this.listaEstudiantes = new Estudiante[35];
    }

    public int getTotalClases() {
        return totalClases;
    }

    public void setTotalClases(int totalClases) {
        this.totalClases = totalClases;
    }

    public Estudiante[] getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(Estudiante[] listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public int getTotalEstudiantes() {
        return totalEstudiantes;
    }

    public void setTotalEstudiantes(int totalEstudiantes) {
        this.totalEstudiantes = totalEstudiantes;
    }

    public void agregarEstudiante(){
         String apellido,nombre,email;
         int lu;
         
         System.out.println("Nombre del alumno: ");
         nombre = teclado.next();
         System.out.println("Apellido del alumno: ");
         apellido = teclado.next();
         System.out.println("Email del alumno: ");
         email = teclado.next();
         System.out.println("Ingrese el numero de libreta: ");
         lu = teclado.nextInt();
         
         Estudiante estudiante = new Estudiante(apellido,nombre,lu,email);
         
        int i=0;
        int band=0;
        
        while(i<listaEstudiantes.length && band==0){
            if (listaEstudiantes[i] == null){
                listaEstudiantes[i]=estudiante;
                band=1;
            }
            else{
                i++;
            }
        }
        this.totalEstudiantes++;
    }
    
    public void agregarEstudiante(String apellidos, String nombres, int lu, String email){
        Estudiante est= new Estudiante(apellidos,nombres,lu,email);
        
        int i=0;
        int band=0;
        
        while(i<listaEstudiantes.length && band==0){
            if (listaEstudiantes[i] == null){
                listaEstudiantes[i]=est;
                band=1;
            }
            else{
                i++;
            }
        }
        this.totalEstudiantes++;
    }
    
    public void mostrarLista(){
        int i=0;
        
        while(i<listaEstudiantes.length && listaEstudiantes[i]!=null){
            System.out.println(" ------------------------------------------- ");
            System.out.println("Alumno : " +listaEstudiantes[i]);
            i++;
        }
    }
    
    public void regularizarEstudiantes(){
        int i=0;
        while(i<listaEstudiantes.length && listaEstudiantes[i]!=null){
            double resultado;
            resultado= (listaEstudiantes[i].getAsistencia()*100)/this.totalClases;
            if(listaEstudiantes[i].getNotaR()>=6 && resultado>=80){
                listaEstudiantes[i].regular= true;
            }
            else{
                listaEstudiantes[i].regular=false;
            }
            i++;
        }
    }
    
    public void mostrarRegulares(){
       int i=0;
        while(i<listaEstudiantes.length && listaEstudiantes[i]!=null){
          if(listaEstudiantes[i].regular==true){
              System.out.println("---------------------------------");
              System.out.println("Alumno: " +listaEstudiantes[i]);
          }
          i++;
       }
    }
    
    public Estudiante buscarEstudiante(int lu){
        int i=0;
        int band=0;
        while(i<listaEstudiantes.length && listaEstudiantes[i]!=null && band==0){
            if(listaEstudiantes[i].getLu()==lu){
                band=1; 
            }
            else{
                i++;
            }
        }
        if(band==1){
            return listaEstudiantes[i];
        }
        else{
            return null;
        }
    }
    
 
    public void ordenarLista(){
        //Ordeno por Notas de Mayor a Menor.
        int i=0;
        int j;
        int cant=0;
        Estudiante aux;
        
        while(i<listaEstudiantes.length&&listaEstudiantes[i]!=null){
            cant++;
            i++;
        }
        for(i=0;i<cant;i++){
            for(j=i+1;j<cant;j++){
                if(listaEstudiantes[i].getNotaR()<listaEstudiantes[j].getNotaR()){
                    aux=listaEstudiantes[i];
                    listaEstudiantes[i]=listaEstudiantes[j];
                    listaEstudiantes[j]=aux;
                }
            }
        }
    }
}
