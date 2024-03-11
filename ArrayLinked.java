import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayLinked
{
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(2);
        li.add(3);
        li.add(4);
        System.out.println(li);

        LinkedList<Integer> al = new LinkedList<>(li);
        System.out.println("the elements are " + al);

    }
    }