import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public class SymmetricDifference  {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(0);
        set2.add(1);
        set2.add(2);

        System.out.println(symmetricDifference(set1, set2));
    }
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> firstSet = new HashSet<>(set1);
        Set<T> secondSet = new HashSet<>(set2);
        Set<T> allSet = new HashSet<>(firstSet);
        allSet.addAll(secondSet);
        firstSet.retainAll(secondSet);
        allSet.removeAll(firstSet);


        return allSet;
    }
}
