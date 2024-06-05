/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaed6;

/**
 *
 * @author hctal
 */
class PracticaEd6 {
     public void aplicarDescuento(double precioProducto, int numProductos){     double Total;
    if(numProductos>3)
        precioProducto-=5;
            if (numProductos!=0){
            Total = precioProducto*descuentoProducto;
            mostrarTotal(Total);
        }else {
            Total = precioProducto*descuento_especial;
            mostrarTotal(Total);
        }   

    }
    private static final double descuento_especial = 0.95;
    private static final double descuentoProducto = 0.8;

    private void mostrarTotal(double Total) {
        System.out.println("El total a pagar es:"+Total);
        System.out.println("Enviado");
    }
}

