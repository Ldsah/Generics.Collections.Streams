import java.math.BigInteger;
import java.util.Objects;
import java.util.Scanner;

public final class Pair<A, B> {

    private final A firstValue;
    private final B secondValue;

    public Pair(A firstValue, B secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public A getFirstValue() {
        return firstValue;
    }

    public B getSecondValue() {
        return secondValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(firstValue, pair.firstValue) && Objects.equals(secondValue, pair.secondValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstValue, secondValue);
    }

    public static void main(String[] args) {

//        Pair<Pair<Integer, String>, String> pair1 = Pair.of(Pair.of(1, "hell"), "hello");
//        Pair<Pair<Integer, String>, String> pair2 = Pair.of(Pair.of(1, "hell"), "hello");

//        Pair<BigInteger, String> pair1 = Pair.of(new BigInteger("300", 10), "hello");
//        Pair<BigInteger, String> pair2 = Pair.of(new BigInteger("300", 10), "hello");
        Pair<Integer, Integer> pair1 = Pair.of(null, Integer.valueOf(1000));
        Pair<Integer, Integer> pair2 = Pair.of(null, Integer.valueOf(1000));


        System.out.println("pair1.equals(pair2) = " + pair1.equals(pair2));
        System.out.println("pair1.hashCode() = " + pair1.hashCode());
        System.out.println("pair2.hashCode() = " + pair2.hashCode());
    }

}
