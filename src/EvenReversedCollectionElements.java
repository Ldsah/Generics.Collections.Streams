import java.util.*;

public class EvenReversedCollectionElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        for (boolean oddIndex = false; in.hasNextInt(); oddIndex = !oddIndex) {
            int elem = in.nextInt();
            if (oddIndex) {
                list.add(String.valueOf(elem));
            }
        }
        Collections.reverse(list);
        System.out.println(String.join(" ", list));
    }

//    public static List<Integer> removeEvenIndexedElements(List<Integer> list) {
//        for (int i = 0; i < list.size(); ) {
//            list.remove(i);
//            i = i + 1;
//        }
//        return list;
//    }
}

