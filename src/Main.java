// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Pila<Integer> pila = new Pila<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);

        System.out.println("Elemento en la cima: " + pila.peek());
        System.out.println("Tamaño de la pila: " + pila.getSize());

        int elemento = pila.pop();
        System.out.println("Elemento retirado: " + elemento);

        pila.clear();
        System.out.println("Pila vacía: " + pila.isEmpty());
    }
}