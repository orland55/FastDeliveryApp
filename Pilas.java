import java.util.Stack;

public class Pilas {
    public static void main(String[] args) {
        // Crear la pila para el historial de la app
        Stack<String> historial = new Stack<>();

        // El usuario navega por la app
        historial.push("Pantalla de Inicio");
        historial.push("Catálogo de Restaurantes");
        historial.push("Detalle del Pedido");

        // Mostramos la pantalla actual
        System.out.println("Pantalla actual: " + historial.peek());

        // El usuario presiona el botón "Atrás"
        historial.pop(); 

        // Mostramos la pantalla anterior
        System.out.println("Pantalla anterior: " + historial.peek());
    }
}
