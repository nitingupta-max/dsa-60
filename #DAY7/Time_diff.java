import java.util.*;

public class Time_diff {

    static void getTimeDiff(List<Integer> list) {
        long start = System.currentTimeMillis();
        for(int i=0; i<100000; i++)
        {
            // list.add(i);
            list.add(0,i); // it adds i at index 0;
        }
        long end = System.currentTimeMillis();

        System.out.println(list.getClass().getName()+" --> " +(end-start));

    }

    public static void main(String[]args) {

        List<Integer> LL = new LinkedList<>();
        List<Integer> AL = new ArrayList<>();

        getTimeDiff(LL); // it gives the running time add operation
        getTimeDiff(AL); // it gives the running time add operation

    }

}