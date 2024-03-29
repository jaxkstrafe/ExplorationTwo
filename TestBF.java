import java.time.Duration;
import java.time.Instant;

public class TestBF{
    public static void main(String[] args){

        //Dr.Becnel said to automate the input size somehow
        int[] test1 = {8,4,3,3,6,3,4};
        BruteForce bfTest = new BruteForce();

        Instant start = Instant.now();

        System.out.println(bfTest.BruteForceNearlyIdentical(test1));

        Instant finish = Instant.now();

        long timeElapsed = Duration.between(start, finish).toNanos();

        System.out.println(timeElapsed);

    }
}