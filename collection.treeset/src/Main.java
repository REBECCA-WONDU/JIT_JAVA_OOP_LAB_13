import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        Set <Integer> s1=new TreeSet<>();
        s1.add(4);
        s1.add(6);
        s1.add(2);
        System.out.println(s1);
        Iterator <Integer> iterate=s1.iterator();
        while (iterate.hasNext()){
            iterate.next();
            System.out.println(s1);

        }

    }
}