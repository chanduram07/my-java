package dsa.maths;

public class PrimeNumber {

    public static void main(String[] args) {
        //System.out.println(solve(10 * 10 * 10 * 10 * 10 * 10 * 10 * 10 * 10 * 10 * 10 * 10));
        //System.out.println(solve(999983));
        long l = 67010446482l;
        System.out.println(solve(l));

    }

    public static int solve(long A) {


        return factorsCount(A);

    }

    public static int factorsCount(long N) {

        if (N == 1)
            return 0;

        //long sqrtOfN = squareRoot(N);

        boolean flag = true;
        //for(int i=1;i<=N/i;i++)
        //for (long i = 2; i <= sqrtOfN; i++) {
        for (long i = 2; i * i <= N; i++) {

            if (N % i == 0) {
                flag = false;
                break;
            }
        }

        if (flag) {
            return 1;
        } else {
            return 0;
        }
    }

    //TODO need to find way for optimized squareRoot.
    public static long squareRoot(long N) {
        System.out.println("squareRoot start");
        long start = System.currentTimeMillis();
        long sqrt = 0;

        for (int i = 1; i <= N; i++) {
            if (i * i <= N) {
                sqrt = i;
            } else {
                break;
            }
        }

        long timeTaken = System.currentTimeMillis() - start;
        System.out.println("timeTaken:" + timeTaken);
        return sqrt;
    }
}
