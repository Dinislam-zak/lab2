package lab2;

public class Main {
    public static void main(String[] args) {
        Map <Integer, String> map1 = new Map<>();

        map1.put(1, "Atlas");
        map1.put(2, "Ledo");
        map1.put(3, "Tofik");
        map1.put(3, "notTofik");
        map1.get(1);
        map1.remove(2);

        System.out.println(map1.keySet());
        System.out.println(map1.values());



        System.out.println(map1.containsKey(2));
    }
}
