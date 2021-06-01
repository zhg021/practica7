package P7;

public class cortador extends maquina implements Funciones {

    public cortador(String nombre, String funcion, String modelo) {
        super(nombre, funcion, modelo);
    }

    @Override
    public void presentarRobot() {
        System.out.println("Hola me llamo " + nombre + " y soy " + funcion + " de alimentos");
    }

    @Override
    public void funcion() {
        System.out.println(nombre + " esta cortando las verduras y el pescado");

    }

    @Override
    public void mensaje() {
        System.out.println("Todo quedo perfectamente cortado!");
    }

    @Override
    public void modelo() {
        System.out.println(nombre + " es un modelo " + modelo + " tipo " + funcion);
    }

}
