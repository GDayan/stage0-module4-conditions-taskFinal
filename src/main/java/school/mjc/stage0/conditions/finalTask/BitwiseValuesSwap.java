package school.mjc.stage0.conditions.finalTask;

public class BitwiseValuesSwap {
    public void swap(int first, int second) {
        System.out.println("Before swapping: first=" + first + ", second=" + second);
        first ^= second;
        second ^= first;
        first ^= second;
        System.out.println("After swapping: first=" + first + ", second=" + second);
    }
}

