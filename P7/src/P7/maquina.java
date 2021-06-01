
package P7;

public abstract class maquina{
    
    protected String nombre, funcion, modelo;

    public maquina(String nombre, String funcion, String modelo) {
        this.nombre = nombre;
        this.funcion = funcion;
        this.modelo = modelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public abstract void presentarRobot();
    
    
}

