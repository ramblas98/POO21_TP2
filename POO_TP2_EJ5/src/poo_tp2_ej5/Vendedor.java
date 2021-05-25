
package poo_tp2_ej5;

import java.util.Scanner;


public class Vendedor {
    private long legajo;
    private String zonaTrabajo;
    private double ventasMensuales[];
    private Persona datosPersonales;
    Scanner teclado = new Scanner(System.in);

    public Vendedor() {
        System.out.println("Ingrese legajo del Vendedor: ");
        this.legajo = teclado.nextInt();
        System.out.println("Declare la zona de Trabajo: ");
        this.zonaTrabajo = teclado.next();
//        System.out.println("Nombre del Vendedor:");
//        this.datosPersonales.setNombre(teclado.next());
//        System.out.println("Apellidos del Vendedor: ");
//        this.datosPersonales.setApellidos(teclado.next());
//        System.out.println("Dni del Vendedor:");
//        this.datosPersonales.setDni(teclado.nextInt());
        this.ventasMensuales = new double[12];
        this.ventasMensuales[0] = 0;
        this.ventasMensuales[1] = 0;
        this.ventasMensuales[2] = 0;
        this.ventasMensuales[3] = 0;
        this.ventasMensuales[4] = 0;
        this.ventasMensuales[5] = 0;
        this.ventasMensuales[6] = 0;
        this.ventasMensuales[7] = 0;
        this.ventasMensuales[8] = 0;
        this.ventasMensuales[9] = 0;
        this.ventasMensuales[10] = 0;
        this.ventasMensuales[11] = 0;
    }

    public Vendedor(long legajo, String zonaTrabajo) {
        this.legajo = legajo;
        this.zonaTrabajo = zonaTrabajo;
//        System.out.println("Nombre del Vendedor:");
//        this.datosPersonales.setNombre(teclado.next());
//        System.out.println("Apellidos del Vendedor: ");
//        this.datosPersonales.setApellidos(teclado.next());
//        System.out.println("Dni del Vendedor:");
//        this.datosPersonales.setDni(teclado.nextInt());
        this.ventasMensuales = new double[12];
        this.ventasMensuales[0] = 0;
        this.ventasMensuales[1] = 0;
        this.ventasMensuales[2] = 0;
        this.ventasMensuales[3] = 0;
        this.ventasMensuales[4] = 0;
        this.ventasMensuales[5] = 0;
        this.ventasMensuales[6] = 0;
        this.ventasMensuales[7] = 0;
        this.ventasMensuales[8] = 0;
        this.ventasMensuales[9] = 0;
        this.ventasMensuales[10] = 0;
        this.ventasMensuales[11] = 0;
    }

    public long getLegajo() {
        return legajo;
    }

    public String getZonaTrabajo() {
        return zonaTrabajo;
    }

    public void setLegajo(long legajo) {
        this.legajo = legajo;
    }

    public void setZonaTrabajo(String zonaTrabajo) {
        this.zonaTrabajo = zonaTrabajo;
    }
    
    public void ventasEnero(int n){
        this.ventasMensuales[0]+=n;
    }
    
    public void ventasFebrero(int n){
        this.ventasMensuales[1]+=n;
    }
    
    public void ventasMarzo(int n){
        this.ventasMensuales[2]+=n;
    }
    
    public void ventasAbril(int n){
        this.ventasMensuales[3]+=n;
    }
    
    public void ventasMayo(int n){
        this.ventasMensuales[4]+=n;
    }
    
    public void ventasJunio(int n){
        this.ventasMensuales[5]+=n;
    }
    
    public void ventasJulio(int n){
        this.ventasMensuales[6]+=n;
    }
    
    public void ventasAgosto(int n){
        this.ventasMensuales[7]+=n;
    }
    
    public void ventasSeptiembre(int n){
        this.ventasMensuales[8]+=n;
    }
    
    public void ventasOctubre(int n){
        this.ventasMensuales[9]+=n;
    }
    public void ventasNoviembre(int n){
        this.ventasMensuales[10]+=n;
    }
    
    public void ventasDiciembre(int n){
        this.ventasMensuales[11]+=n;
    }
    
    public double totalAnual(){
        double suma = 0;
        
        for(int i=0;i<12;i++){
            suma+=this.ventasMensuales[i];
        }
        
        return suma;
    }
    
    public double comision(){
        double comision;
        
        if(this.totalAnual()<50000){
            comision = 0;
        }
        else{
            if(this.totalAnual()<75000 && this.totalAnual()>= 50000){
                comision = 15;
            }
            else {
                if(this.totalAnual()<100000 && this.totalAnual()>= 75000){
                    comision = 20;
                }
                else{
                    comision = 30;
                }
            }
        }
        
        return comision;
    }
}
