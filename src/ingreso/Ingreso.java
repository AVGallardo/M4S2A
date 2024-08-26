package ingreso;

import java.util.Scanner;

public class Ingreso {
    public void Ingresado() {

        Scanner sc = new Scanner(System.in);
        String name;
        int total = 0;
        int i = 0;

        System.out.println("Ingrese su nombre por favor : " );
        name = sc.nextLine();

        while ( i < 5) {
            i++;
            System.out.println("Ingrese el producto " + i +":");
            total = total + sc.nextInt();
        }

        respuesta(total, name);
    }

    private void respuesta(int total, String name) {
        System.out.print("Estimade " + name + ", ");
        if (total <= 10000) {
            System.out.print("El pago será en efectivo.");
        }
        if (total > 10000 && total <= 20000) {
            System.out.print("El pago será con tarjeta.");
        }
        if (total > 20000 ) {
            System.out.print("El pago será con cheque.");
        }
    }
}
