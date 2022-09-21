import java.util.ArrayList;
import java.util.List;

public class StackImpl implements Stack{

    List<Integer> list = new ArrayList<>();

    @Override
    public void push(Integer number) {
        list.add(number);
        System.out.println("PUSH: Se inserto en la pila el elemento " + number);
    }

    @Override
    public Integer pop() {
        if(!list.isEmpty()) {
            int lastNumber = list.get(list.size()-1);
            list.remove(list.size()-1);
            return lastNumber;
        }

        return null;
       
        
    }

    @Override
    public Integer peek() {
        int top = list.get(list.size()-1);
        return top;
    }

    @Override
    public void print() {
        

        if(list.isEmpty()) {
            System.out.println("La pila ya no tiene elementos");
        } else {
            System.out.print("PRINT: La pila es ");
            list.forEach(n-> {
                System.out.print(n + ",");
            });  
        }
        
        System.out.println();
        
    }
    @Override
    public void printPop() {
        Integer number = pop(); 
        if(number != null) {
            System.out.println("POP se extrajo el elemento " + number);
        } else {
            System.out.println("Ya no quedan elementos en la pila");
        }
    }
    
}
