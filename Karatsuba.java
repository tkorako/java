import java.math.BigInteger;

public class Karatsuba{

    public BigInteger multiply(BigInteger x, BigInteger y) {

        long size1 = getSize(x);
        long size2 = getSize(y);

        long N = Math.max(size1, size2);

        if (N < 3)
            return x.multiply(y);

        N = (N / 2) + (N % 2);

        BigInteger m = BigInteger.valueOf((long)(Math.pow(10, N)));

        BigInteger b = x.divide(m);
        BigInteger a = x.subtract(b.multiply(m));
        BigInteger d = y.divide(m);
        BigInteger c = y.subtract(d.multiply(m));


        BigInteger z0 = multiply(a, c);
        BigInteger z1 = multiply(a.add(b), c.add(d));
        BigInteger z2 = multiply(b, d);

        return z0.add((z1.subtract(z0).subtract(z2)).multiply(m).add(z2.multiply(BigInteger.valueOf((long)(Math.pow(10, 2 * N))))));
    }

    public long getSize(BigInteger num) {

        return num.toString().length();
    }
}
