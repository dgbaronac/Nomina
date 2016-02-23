/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomina;

/**
 *
 * @author Usuario5
 */
public class Nomina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado e= new Empleado("Gauss Jordan",50,80.2);
        e.Añadir(20);
        e.Pago();
    }
    
}
