import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {



    public static void main(String[] args) {

        List<Integer> arrList1 = new LinkedList<>();
        List<Integer> arrList2 = new ArrayList<>();

        ListI<Integer> listI = new MyLinkedList<>();

        Integer int1 = 5;

        Integer int2 = 5;

        int1.compareTo(int2);


        Person p1 = new Person("name1", 10, 1.7);
        Person p2 = new Person("name", 10, 1.8);

        System.out.println(p1.compareTo(p2));
    }
}
