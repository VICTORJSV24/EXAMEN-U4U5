/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenu4u5;

/**
 *
 * @author Usuario
 */
public class ExamenU4U5 {
public static void producto (double[][]ventas){
            for (int i = 0; i < ventas.length; i++) {
            double suma = 0;
            for (int j = 0; j < ventas[0].length; j++) {
             suma+= ventas [i][j];
                }
                System.out.println("promedio de ventas producto" + suma/3);   
            }
}
public static void meses (double [][]ventas){
            for (int i = 0; i < ventas[0].length; i++) {
            double suma = 0;
            for (int j = 0; j < ventas.length ; j++) {
              suma+= ventas [j][i];  
            }
            System.out.println("promedio de ventas mensuales" + suma/4);
    }
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       double [][] ventas = {
       {1500.0,2200.0,1800.0,2000.0},
       {1200.0,2800.0,2100.0,1900.0},
       {1600.0,1900.0,2200.0,2300.0},
    };  
    ExamenU4U5.producto(ventas);
    ExamenU4U5.meses(ventas);
        System.out.println("venta total mes 2 , venta total producto 3" +ventas [2][1]);
    }
   
    
}
