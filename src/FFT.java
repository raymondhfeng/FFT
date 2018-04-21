import java.util.List;

/**
 * Created by Raymond on 8/30/2017.
 */
public class FFT {
    int[] coefficientsA; //Coefficient representation of our first polynomial
    int[] coefficientsB; //Coefficient representation of our second polynomial
    public FFT(int[] coefficientsA, int[] coefficientsB) {
        System.arraycopy(coefficientsA, 0, this.coefficientsA, 0, coefficientsA.length);
        System.arraycopy(coefficientsB, 0, this.coefficientsB, 0, coefficientsB.length);
    }

    /*
    Takes in a coefficient representation of polynomial as well as a proper nth root of unity, and transforms
    the coefficients into the Fourier basis, allowing for quick multiplication.
     */
    private int[] fastFourierTransform(int[] coefficients, int nthRootsOfUnity) {
        if (nthRootsOfUnity == 1) {
            return coefficients;
        }
        int[][] evenAndOddPowers = evenAndOddPowerTerms(coefficients);
        int[] evenPowerTerms = evenAndOddPowers[0];
        int[] oddPowerTerms = evenAndOddPowers[1];
        return null;
    }

    private int[][] evenAndOddPowerTerms(int[] coefficients) {
        int[] evenTerms = new int[coefficients.length / 2];
        int[] oddTerms = new int[(coefficients.length / 2) + (coefficients.length % 2)];
        int[][] both = new int[2][];
        for (int i = 0; i < coefficients.length; i++) {
            if (i % 2 == 0) {
                evenTerms[i / 2] = coefficients[i];
            } else {
                oddTerms[i / 2] = coefficients[i];
            }
        }
        both[0] = evenTerms;
        both[1] = oddTerms;
        return both;
    }

    public static void main(String args[]) {
        int[] test = {-1, 0, 1, 2, -1, 4};
        List<List<Integer>> result = kSUM.threeSum(test);
        System.out.println(result);
    }
}
