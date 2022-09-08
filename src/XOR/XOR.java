package XOR;

public class XOR {
    public static void main (String[] args){
        int m = 'G';
        int k = '|';
        int c = m^k;
        System.out.println(Integer.toBinaryString(c));
        System.out.println(Integer.parseInt(String.valueOf(c)));
    }
}
