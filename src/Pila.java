public class Pila <T>{




    private Nodo<T> head;
    private Nodo<T> end;
    private int size;

    private static class Nodo<T> {
        T data;
        Nodo<T> next;

        Nodo(T data) {
            this.data = data;
            this.next= null;
        }
    }
    // Inserta un elemento en la pila
    public void push(T data) {
        Nodo<T> newNode = new Nodo<>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Retira el elemento en la cima de la pila
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        T data = head.data;
        head = head.next;
        size--;
        return data;
    }

    // Obtiene el elemento en la cima de la pila
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return head.data;
    }

    // Verifica si la pila está vacía
    public boolean isEmpty() {
        return size == 0;
    }

    // Obtiene el tamaño de la pila
    public int getSize() {
        return size;
    }

    // Limpia la pila
    public void clear() {
        head = null;
        size = 0;
    }





}
