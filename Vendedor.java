package casoprogramado1;

import javax.swing.JOptionPane;

public class Vendedor {
// Atributos 
    private String nombre;
    private String cedula;
    private String codigo;
    private String sucursal;
    private double totalVentas;
    private double comisiones;
    private int puntos;
//Constructores 
    public Vendedor(String nombre, String cedula, String codigo, String sucursal) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.codigo = codigo;
        this.sucursal = sucursal;
        this.totalVentas = 0;
        this.comisiones = 0;
        this.puntos = 0;
    }
//Desarrollo
    public void Venta(double monto, int productoselectricos, int productosautomotrices, int productosconstruccion) {
        double bono = 0;

        if (productoselectricos > 0 && productosautomotrices > 0 && productosconstruccion > 0) {
            bono = monto * 0.10;
            puntos += 3;
        } else {
            if (productoselectricos >= 3) {
                bono = monto * 0.04;
                puntos += 1;
            } else if (productoselectricos > 0) {
                bono = monto * 0.02;
            }

            if (productosautomotrices > 4) {
                bono += monto * 0.04;
                puntos += 1;
            } else if (productosautomotrices > 0) {
                bono += monto * 0.02;
            }

            if (productosconstruccion > 0) {
                bono += monto * 0.08;
                puntos += 2;
            }
        }
        if (monto > 50000) {
            bono += monto * 0.05;
            puntos += 1;
        }

        this.totalVentas += monto;
        this.comisiones += bono;
    }

    public void factura() {
        JOptionPane.showMessageDialog(null, "Vendedor: " + nombre + "\nCédula: " + cedula + "\nCódigo: " + codigo + "\nSucursal: " + sucursal + "\nTotal Ventas: " + totalVentas + "\nComisiones: " + comisiones + "\nPuntos: " + puntos);
    }
}
        
    

