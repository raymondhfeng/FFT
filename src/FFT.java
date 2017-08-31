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
    private void fastFourierTransform(int[] coefficients) {

    }

    public static void main(String args[]) {

    }
}
