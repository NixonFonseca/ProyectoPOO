/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author PC_22
 */
public class Principal {
    public static void main(String[] args) {
        Reportes reportes = new Reportes();
        reportes.agregarInstrumento();
        reportes.mostrarInstrumentos();
        reportes.registraPrestamo();
        reportes.mostrarInstrumentos();
    }
}
