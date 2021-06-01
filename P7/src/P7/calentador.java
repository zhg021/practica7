
package P7;


public class calentador extends maquina implements Funciones{

    public calentador(String nombre, String funcion, String modelo) {
        super(nombre, funcion, modelo);
    }

    @Override
    public void presentarRobot() {
        System.out.println("Hola me llamo "+nombre+" y sere su "+funcion);
    }

    @Override
    public void funcion() {
        System.out.println(nombre+" esta cociendo las verduras y friendo el pescado");
    }

    @Override
    public void mensaje() {
        System.out.println("Cocine todo a temperatura exacta!");
    }

    @Override
    public void modelo() {
        System.out.println(nombre+" es un modelo "+modelo+" tipo "+funcion);
    }
    
}
