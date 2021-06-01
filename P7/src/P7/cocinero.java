package P7;

public class cocinero extends maquina implements Funciones {

    public cocinero(String nombre, String funcion, String modelo) {
        super(nombre, funcion, modelo);
    }

    @Override
    public void presentarRobot() {
        System.out.println("Hola me llamo " + nombre + " y sere tu " + funcion);
    }

    public void elegir() {
        System.out.println("El chef esta eligiendo los ingredientes mas frescos!");
        System.out.println("Listo! se los pasara a Edward para empezar");
    }

    @Override
    public void funcion() {
        System.out.println("El Chef " + nombre + " Esta sirviendo el platillo");
    }

    @Override
    public void mensaje() {
        System.out.println(nombre + " pasa los ingredientes al robot estufa");
    }

    @Override
    public void modelo() {
        System.out.println(nombre + " es un modelo " + modelo + " tipo " + funcion);
    }

}
