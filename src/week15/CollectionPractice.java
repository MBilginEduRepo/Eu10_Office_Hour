package week15;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {
//        two();
//        three();
        four();
    }


    // List
    public static void one() {
        List<Integer> arraylist = new ArrayList<>();

        List<String> linkedList = new LinkedList<>();

        List<Boolean> vector = new Vector<>();

        List<Character> stack = new Stack<>();

        arraylist.add(10);
        linkedList.add("home");
        vector.add(true);
        stack.add('r');
    }

    // set
    public static void two() {

        Set<Integer> hashSet = new HashSet<>(Arrays.asList(10, 20, 30, 40, 50));
        hashSet.add(null);
        System.out.println(hashSet);

        Set<Integer> treeSet = new TreeSet<>(Arrays.asList(50, 90,90, 10, 60,60, 40));
        System.out.println("treeSet = " + treeSet);
    }

    //queue
    public static void three(){
        Queue<Integer> numbers = new PriorityQueue<>(Arrays.asList(50, 90,90, 10, 60,60, 40));
        System.out.println("numbers = " + numbers);

        Queue<Integer> dequeNumbers = new ArrayDeque<>(Arrays.asList(50, 90,90, 10, 60,60, 40));
        System.out.println("dequeNumbers = " + dequeNumbers);
    }

    // iterator
    public static void four(){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6));
        Iterator<Integer> it = list.iterator();


        while (it.hasNext()){
            if (it.next()<4){
                it.remove();
            }
        }
        System.out.println(list);
    }


}
