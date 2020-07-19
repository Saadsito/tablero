package proyect;


public class Player {
    private String nombre, personaje, ip;
    private int numjugador;
    private Inventario inventario;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getNumjugador() {
        return numjugador;
    }

    public void setNumjugador(int numjugador) {
        this.numjugador = numjugador;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public Player(String nombre, String personaje, String ip, int numjugador, Inventario inventario) {
        this.nombre = nombre;
        this.personaje = personaje;
        this.ip = ip;
        this.numjugador = numjugador;
        this.inventario = inventario;
    }
}
