
package poo_tp2_ej5;

public class POO_TP2_EJ5 {

    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor();
        Vendedor vendedor2 = new Vendedor(3254, "Oran");
        Vendedor vendedor3 = new Vendedor(6409, "Salta");
        
        vendedor1.ventasAbril(2500);
        vendedor1.ventasAgosto(5646);
        vendedor1.ventasEnero(5879);
        vendedor1.ventasJulio(8796);
        vendedor2.ventasEnero(2000);
        vendedor2.ventasMarzo(4000);
        vendedor2.ventasMayo(8000);
        vendedor2.ventasJulio(16000);
        vendedor2.ventasSeptiembre(32000);
        vendedor2.ventasNoviembre(64000);
        vendedor3.ventasFebrero(2100);
        vendedor3.ventasAbril(3200);
        vendedor3.ventasJunio(5300);
        vendedor3.ventasAgosto(7400);
        vendedor3.ventasOctubre(11500);
        vendedor3.ventasDiciembre(13600);
        
        System.out.println("Comision de Vendedor 1: "+vendedor1.comision());
        System.out.println("Comision de Vendedor 2: "+vendedor2.comision());
        System.out.println("Comision de Vendedor 3: "+vendedor3.comision());
    }
    
}
