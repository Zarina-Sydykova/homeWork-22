import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer>numbers = new ArrayList<>(Arrays.asList(10,15,20,25,30,35,40,45,50,55,
                60,66,65,70,77,80,88,85,90,99,98,97,94,95,96,91,92,93,12,13,14,15,16,17,
                18,19,22,23,24,25,26,27,28,29,44,46,1,2,3,4));
        System.out.println("Ichinde "+numbers.size()+" san bar");
        jupSandar(numbers);
        takSandar(numbers);
//        Collections.sort(numbers);
//        System.out.println(numbers);


    }
    public static void jupSandar(ArrayList<Integer>numbers){
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 !=0)
                numbers.remove(i);



        }
        System.out.println(numbers);

    }
    public static void takSandar(ArrayList<Integer>numbers){
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 ==0)
                numbers.remove(i);



        }
        System.out.println(numbers);

    }

}