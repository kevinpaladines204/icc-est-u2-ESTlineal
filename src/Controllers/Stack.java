package Controllers;

import java.util.EmptyStackException;
import Models.Node;

public class Stack {
    private Node top; //Nodo cima de la pista
    private int size;

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    public void push(int value){
        Node nNode1 = new Node(value);
        nNode1.setNext(top);
        top = nNode1;
        size++;
    }

    public int pop(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int value = top.getValue();
        top = top.getNext();
        size --;
        return value;

    }

    public int peek(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int value= top.getValue();
        return value;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void printStack(){
        Node aux = top;
        while (aux != null) {
            System.out.print(aux.getValue() + " | ");
            aux = aux.getNext();
        }
    }

    public int size(){
        return size;
    }
}