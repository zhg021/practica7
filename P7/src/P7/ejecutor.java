package P7;

import java.util.Scanner;

public class ejecutor {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        cocinero chef = new cocinero("cooker", "Chef", "chef01");
        cortador cortador = new cortador("slasher", "Cortador", "cutter01");
        calentador cocinero = new calentador("heater", "Cocinero", "heat01");

        int opc = 0, aux = 0;
        boolean salir = false;

        System.out.println("Bienvenido al restaurante");
        do {
            if (opc == 0) {
                System.out.println("Usted puede dirigir a los robots pero antes se presentaran");
                chef.presentarRobot();
                cortador.presentarRobot();
                cocinero.presentarRobot();
            }
            System.out.println("1.-Preparar los Ingredientes \n2.-Cocinar \n3.-Servir \n4.-Salir");
            System.out.println("¿Que desea hacer primero?");
            opc = in.nextInt();
            switch (opc) {
                case 1:
                    if (aux == 0) {
                        chef.elegir();
                        cortador.funcion();
                        cortador.mensaje();
                        aux = 1;
                    } else {
                        System.out.println("No puede cortar los alimentos de nuevo! \ndebe servirlos!");
                    }
                    break;
                case 2:
                    if (aux == 1) {
                        chef.mensaje();
                        cocinero.funcion();
                        cocinero.mensaje();
                        aux = 2;
                    } else {
                        System.out.println("Primero se deben cortar los ingredientes!");
                    }
                    break;
                case 3:
                    if (aux == 2) {
                        chef.funcion();
                        System.out.println("Hurra!, el plato estuvo delicioso");
                        salir = true;
                    } else if (aux == 1) {
                        System.out.println("No puede servir el plato aun! \ndebe cocinar los alimentos primero!");
                    } else {
                        System.out.println("No puede servir el aun!\ndebe cortar los alimentos primero");
                    }
                    break;
                case 4:
                    System.out.println("Nos vemos");
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion Invalida");
            }
        } while (!salir);

        chef.modelo();
        cortador.modelo();
        cocinero.mensaje();

    }

}
