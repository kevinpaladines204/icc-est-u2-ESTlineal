import Controllers.Stack;
import Controllers.StackG;
import Models.Persona;
import Controllers.QueueG;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("------------------- Realizado la primera clase -------------------");
        Stack stack = new Stack();
        stack.push(10);
        stack.push(-1);
        stack.push(5);
        stack.push(8);
        System.out.println("");
        System.out.println("Tam ="+ stack.size());   
        stack.printStack();
        stack.pop();
        System.out.println("");
        System.out.println("Tam ="+ stack.size());
        stack.printStack();
        System.out.println("\n");

        // Ejemplo de salida esperada:
        // Tam = 4
        // 8 | 5 | -1 | 10
        // Tam = 3
        // 5 | -1 | 10

        System.out.println("------------------- Realizado la segunda clase -------------------");

        System.out.println("");
        StackG<Integer> stackG = new StackG<>();
        stackG.push(10);
        stackG.push(8);
        stackG.push(-1);
        stackG.push(5);
        System.out.println("Tam = "+ stackG.getSize());
        stackG.printStack();
        stackG.pop();
        System.out.println("");
        System.out.println("Tam = "+ stackG.getSize());
        stackG.printStack();
        System.out.println("");
        System.out.println("");


        // Ejemplo de salida esperada:
        // Tam = 4
        // 5 | -1 | 8 | 10
        // Tam = 3
        // -1 | 8 | 10

        System.out.println("------------------- Implementacion de Buscar y eliminar -------------------");

        System.out.println("");
        Persona p1 = new Persona("Juan");
        Persona p2 = new Persona("Maria");
        Persona p3 = new Persona("Pedro");
        Persona p4 = new Persona("David");

        QueueG<Persona> colaPersonas = new QueueG<>();
        colaPersonas.add(p1);
        colaPersonas.add(p2);
        colaPersonas.add(p3);
        colaPersonas.add(p4);
        colaPersonas.printCola();
        System.out.println("");
        System.out.println("Persona atendida ->" + colaPersonas.remove());
        colaPersonas.printCola();


        Persona pB= colaPersonas.findByName("Juan");
        System.out.println("");
        System.out.println("Persona encontrada -> " + (pB != null ? pB.getNombre() : "ninguna"));
        Persona pE = colaPersonas.deleteByName("Pedro");
        System.out.println("Persona eliminada -> " + (pE != null ? pE.getNombre() : "ninguna"));
        colaPersonas.printCola();
        System.out.println("\n");

        // Ejemplo de salida esperada:
        // Juan | Maria | Pedro | David
        // Persona atendida -> Juan
        // Maria | Pedro | David
        // Persona encontrada -> ninguna
        // Persona eliminada -> Pedro
        // Maria |  David

    }
}
