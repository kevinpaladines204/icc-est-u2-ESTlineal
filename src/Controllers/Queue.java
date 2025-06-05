package Controllers;

import java.util.EmptyStackException;
import Models.Node;

public class Queue {
    private Node primero;// head - front
    private Node ultimo;//back - rear - tail
    private int size;

    public Queue() {
        this.primero=null;
        this.ultimo=null;
    }

    public void add(int value){
        Node newnode= new Node(value);

        if(isEmpty()){
            primero = newnode;
            ultimo = newnode;
        }else{
            ultimo.setNext(newnode);
            ultimo = newnode;
        }
        size++;
    }

    public int remove(){
        if(isEmpty()){
            throw new EmptyStackException();
        }else{
            int aux = primero.getValue();
            primero.getNext();
            size--;
            return aux;
        }
    }

    public int size(){
        return size;
    }

    public int peek(){
        //if(isEmpty()) throw new EmptyStackException() ; return primero.getValue();
        if(isEmpty()){
            throw new EmptyStackException();
        }else{
            return primero.getValue();
        }
    }

    public boolean isEmpty(){
        return primero==null;
    }
}