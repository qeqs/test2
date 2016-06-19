package test;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        HashSet<Object> a = new HashSet<Object>();
        a.add(1);a.add(3);a.add(4);a.add(10);
        HashSet<Object> b = new HashSet<Object>();
        b.add(2);b.add(3);b.add(4);b.add(20);

        Set<Object> c = getIntersection(a,b);
        for (Object o:c
             ) {
            System.out.println(o);

        }
    }
    public static Set<Object> getIntersection(Set<Object> a, Set<Object> b) {
        /*
          Please implement this method to
          return a Set equal to the intersection of the parameter Sets
          The method should not chage the content of the parameters.
         */
        Set<Object> result = new HashSet<Object>();
        for (Object aObj:a) {
            for (Object bObj:b) {
                if(aObj.equals(bObj)) {
                    result.add(aObj);
                    break;
                }

            }
        }
        return result;
    }
}
