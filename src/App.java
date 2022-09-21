import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Stack stack = new StackImpl();
        
        stack.push(5);
        stack.push(3);

        stack.print();

        System.out.println("PEEK: El elemento en el TOP de la pila es " + stack.peek());

        stack.printPop();

        stack.print();

        System.out.println("PEEK: El elemento enn el TOP de la pila es " + stack.peek());
        stack.printPop();
        stack.printPop();
        
       
        stack.print();


    }

   
}
