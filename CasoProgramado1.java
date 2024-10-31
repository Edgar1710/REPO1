package casoprogramado1;

import javax.swing.JOptionPane;

public class CasoProgramado1 {

    public static void main(String[] args) {
//preguntas para el usuario 
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre :");
        String cedula = JOptionPane.showInputDialog("Ingrese la cédula :");
        String codigo = JOptionPane.showInputDialog("Ingrese el código :");
        String sucursal = JOptionPane.showInputDialog("Ingrese la sucursal :");

        Vendedor vendedor = new Vendedor(nombre, cedula, codigo, sucursal); {
        
            double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la factura:"));
            int productoselectricos = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de productos eléctricos:"));
            int productosautomotrices = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de productos automotrices:"));
            int productosconstruccion = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de productos de construcción:"));
            vendedor.Venta(monto, productoselectricos, productosautomotrices, productosconstruccion);
        }
        vendedor.factura();
    }
}

