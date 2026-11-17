public class HondaCivic extends AutoMovil {

    // Constructor: llama al constructor del padre con super()
    public HondaCivic() {
        super();
        System.out.println("Constructor de HondaCivic");
    }

    // Método sobrescrito 1
    @Override
    public void encender() {
        System.out.println("El Honda Civic está encendiendo con arranque deportivo...");
    }

    // Método sobrescrito 2
    @Override
    public void acelerar() {
        System.out.println("El Honda Civic acelera rápidamente...");
    }
}