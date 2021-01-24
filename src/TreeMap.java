import java.util.Locale;
import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {
        String abc = "Tôi là Vũ Anh Tú";
        Map map = new java.util.TreeMap();
        int value = 1;
        for (int i = 0; i < abc.length(); i++) {
            String a = String.valueOf(abc.charAt(i));
            map.put(a.toUpperCase(Locale.ROOT),value);
        }
        System.out.println(map.toString());
    }
}
