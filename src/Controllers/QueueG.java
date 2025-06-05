package Controllers;

import java.util.EmptyStackException;
import Models.Persona;
import Models.NodeGeneric;

public class QueueG<T> {
    private NodeGeneric<T> primero; //head - front
    private NodeGeneric<T> ultimo; // back- rear - tail
    private int size;


    public QueueG() {
        this.primero = null;
        this.ultimo = null;
        this.size = 0;
    }

    public void add(T value) {
        NodeGeneric<T> newNode = new NodeGeneric<>(value);
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
        }else{
            T aux = primero.getValue();
            primero = primero.getNext();
            size--;
            return aux;
        }
    }

    public Persona findByName(String name) {
        NodeGeneric<T> aux = primero;
        while (aux != null) {
            Persona persona = (Persona) aux.getValue();
            if (persona.getNombre().equals(name)) {
                return persona;
            }
            aux = aux.getNext();
        }
        return null;
    }

    public Persona deleteByName(String name) {
        NodeGeneric<T> aux = primero;
        NodeGeneric<T> anterior = null;
        while (aux != null) {
            Persona persona = (Persona) aux.getValue();

            if (persona.getNombre().equals(name)) {
                if (anterior == null) {
                    primero = aux.getNext();
                } else {
                    anterior.setNext(aux.getNext());
                }
                return persona;
            }
            anterior = aux;
            aux = aux.getNext();
        }
        return null;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }else{
            return primero.getValue();
        }
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return primero == null;
    }
    public void printCola() {
        NodeGeneric<T> aux = primero;
        while (aux != null) {
            System.out.print(aux.getValue() + " | ");
            aux = aux.getNext();
        }
    }
}