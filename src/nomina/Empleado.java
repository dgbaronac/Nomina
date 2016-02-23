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
public class Empleado {
    private String Nombre;
    private int Horas;
    private double Valhora;
    
    public Empleado(String Nombre,int Horas,double Valhora){
            this.Nombre=Nombre;
            this.Horas=Horas;
            this.Valhora=Valhora;
                                                            }
    public void Añadir(int hora){
            Horas=Horas+hora;
            System.out.println("las nuevas horas de " + Nombre + " son: " + Horas);
                                }
    double salario;
    public void Pago(){
            salario=Horas*Valhora;
            System.out.println("El salario del empleado " + Nombre + "es: " + salario);
                                        }
}
