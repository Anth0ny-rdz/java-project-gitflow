public class Main {
    public static void main(String[] args) {
        Saludo saludo = new Saludo(); // Crear una instancia
        System.out.println(saludo.generaSaludo("Mundo"));
        System.out.println("Version 1.0.0 lista para la produccion");
        Despedida despedida = new Despedida();
        System.out.println(despedida.generarDespedida("Mundo"));
    }
}