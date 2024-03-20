import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arrayCities = {"paris", "london", "madrid"};
        for (int i = 0; i < arrayCities.length; i++) {
            arrayCities[i] = arrayCities[i].replace(arrayCities[i].charAt(0), (char) (arrayCities[i].charAt(0) - 32));
        }
        System.out.println(Arrays.toString(arrayCities));
    }
}
