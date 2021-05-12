
package poo_tp2_ej3;

/**
 *
 * @author Antonio
 */
public class Estudiante {
    private String apellidos;
    private String nombres;
    private int lu;
    private String email;
    public boolean regular;
    private int notaP1;
    private int notaP2;
    private int notaR;
    private int asistencia;

    public Estudiante() {
    }

    public Estudiante(String apellidos, String nombres, int lu, String email) {
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.lu = lu;
        this.email = email;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getLu() {
        return lu;
    }

    public void setLu(int lu) {
        this.lu = lu;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isRegular() {
        return regular;
    }

    public void setRegular(boolean regular) {
        this.regular = regular;
    }

    public int getNotaP1() {
        return notaP1;
    }

    public void setNotaP1(int notaP1) {
        this.notaP1 = notaP1;
    }

    public int getNotaP2() {
        return notaP2;
    }

    public void setNotaP2(int notaP2) {
        this.notaP2 = notaP2;
    }

    public int getNotaR() {
        return notaR;
    }

    public void setNotaR(int notaR) {
        this.notaR = notaR;
    }

    public int getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }
    
    public void incAsistencia(){
        this.asistencia++;
    }
    
    public void incAsistencia(int c){
        this.asistencia+=c;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "apellidos=" + apellidos + ", nombres=" + nombres + ", lu=" + lu + ", regular=" + regular + '}';
    }
    
    
}
