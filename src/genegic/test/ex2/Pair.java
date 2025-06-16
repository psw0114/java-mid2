package genegic.test.ex2;

public class Pair <T,Z>{

    private T first;
    private Z second;

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public Z getSecond() {
        return second;
    }

    public void setSecond(Z second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
