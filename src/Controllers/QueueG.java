package Controllers;

import java.util.EmptyStackException;

import Models.Node;

public class QueueG<T> {
    private Node<T> primero; //head - front
    private Node<T> ultimo; // back- rear - tail
    private int size;


    public QueueG() {
        this.primero = null;
        this.ultimo = null;
        this.size = 0;
    }

    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (isEmpty()) {
            primero = newNode;
            ultimo = newNode;
        } else {
            ultimo.setNext(newNode);
            ultimo = newNode;
        }
        size++;
    }

    public T remove() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T aux = primero.getValue();
        primero = primero.getNext();
        size--;
        return aux;
    }

        public T findByName(String name) {
        Node<T> current = primero;
        while (current != null) {
            if (current.getValue().getNombre().equals(name)) {
                return current.getValue();
            }
            current = current.getNext();
        }
        return null;
    }

    public T deleteByName(String name) {
        if (isEmpty()) {
            return null;
        }

        if (primero.getValue().getNombre().equals(name)) {
            return remove();
        }

        Node<T> current = primero;
        while (current.getNext() != null) {
            if (current.getNext().getValue().getNombre().equals(name)) {
                T valueToDelete = current.getNext().getValue();
                current.setNext(current.getNext().getNext());
                size--;
                return valueToDelete;
            }
            current = current.getNext();
        }
        return null;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return primero.getValue();
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return primero == null;
    }
    public void printCola() {
        Node<T> current = primero;
        while (current != null) {
            System.out.print(current.getValue() + " | ");
            current = current.getNext();
        }
        System.out.println();
    }
}