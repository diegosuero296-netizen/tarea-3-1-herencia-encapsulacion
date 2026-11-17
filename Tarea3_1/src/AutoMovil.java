public class AutoMovil {

    // Atributos privados (encapsulación)
    private String marca;
    private String modelo;
    private int año;
    private String color;

    // Constructor
    public AutoMovil() {
        System.out.println("Constructor de AutoMóvil");
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Métodos
    public void encender() {
        System.out.println("El automóvil está encendiendo...");
    }

    public void apagar() {
        System.out.println("El automóvil se está apagando...");
    }

    public void acelerar() {
        System.out.println("El automóvil está acelerando...");
    }

    public void frenar() {
        System.out.println("El automóvil está frenando...");
    }
}
