import java.math.BigInteger;

class Solution{
    public static String multiplySolution(String n1, String n2){
        BigInteger b1 = new BigInteger(n1);
        BigInteger b2 = new BigInteger(n2);

        BigInteger ans = b1.multiply(b2);

        return ans.toString();
    }
}