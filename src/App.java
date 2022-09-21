import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Student{}
class Rockstar{}
class Hacker{}



public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        Integer[]s=new Integer[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.nextInt();
        }
        sc.close();

        //Write your code here
        Arrays.sort(s, Collections.reverseOrder());
        System.out.println(s);

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
     }
    

    static String count(ArrayList mylist){
        int a = 0,b = 0,c = 0;
        for(int i = 0; i < mylist.size(); i++){
           Object element=mylist.get(i);
           if(element.getClass() == new Student().getClass())
              a++;
           if(element.getClass() == new Rockstar().getClass())
              b++;
           if(element.getClass() == new Hacker().getClass())
              c++;
        }
        String ret = Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
        return ret;
     }
}
