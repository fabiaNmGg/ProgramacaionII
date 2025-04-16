package herneciaMult1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el valor para x: ");
        int x = sc.nextInt();

        System.out.print("Ingresa el valor para y: ");
        int y = sc.nextInt();

        System.out.print("Ingresa el valor para z: ");
        int z = sc.nextInt();


        D objeto = new D(x, y, z);


        System.out.println("\nValores iniciales:");
        System.out.println(objeto.mostrarValores());

        objeto.incrementaXYZ();

        System.out.println("\nDespués de llamar a incrementaXYZ():");
        System.out.println(objeto.mostrarValores());

        sc.close();
    }
}
