public class Main {
    public static void main(String[] args) {
        String name1 = "Ali";
        String name2 = "Nancy";
        System.out.println(name1 + " -> " + vovelCounter(name1));
        System.out.println(name2 + " -> " + vovelCounter(name2));
    }
    private static int vovelCounter(String str) {
        return str.replaceAll("[^aeiouAEIOU]+", "").length();
    }
}
