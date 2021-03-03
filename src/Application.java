import java.util.ArrayList;
import java.util.LinkedList;

public class Application {
    public static void main(String[] args) {

        /*
        ARRAY LIST
        faster for data retrieval, slower for data manipulation
        when expanding arraylist, elements must be copied into new array
         */

        ArrayList<String> words = new ArrayList<String>();
        words.add("hello");
        words.add("there");
        words.add("10");

        String item1 = words.get(9);

        System.out.println(item1);


        /*
        LINKED LIST
        faster for data manipulation, slower for data retrieval
        must traverse linked list for data retrieval

         */
        LinkedList<Integer> numbers = new LinkedList<Integer>();

        numbers.add(4);
        numbers.add(100);
        numbers.add(200);
        numbers.add(45);
        numbers.add(1000);
        numbers.add(109);

        for(int number : numbers){
            System.out.println(number);
        }




    }
}
