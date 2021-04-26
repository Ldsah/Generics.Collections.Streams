import java.util.Objects;
import java.util.Scanner;

public final class Pair<A, B> {

    private final A firstValue;
    private final B secondValue;

    private Pair(A a, B b) {
        this.firstValue = a;
        this.secondValue = b;
    }


    public static <A, B> Pair<A, B> of(A a, B b) {
        return new Pair<>(a, b);
    }

    public A getFirst() {
        return firstValue;
    }

    public B getSecond() {
        return secondValue;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(this.getClass() != obj.getClass())
            return false;
        if(this.getFirst() == ((Pair)obj).getFirst() && this.getSecond() == ((Pair)obj).getSecond()) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstValue, secondValue);
    }

    public static void main(String[] args) {

        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"

        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
        System.out.println(mustBeTrue + " "+ mustAlsoBeTrue );
    }

}
