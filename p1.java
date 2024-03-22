public class p1 {
    public static void main(String[] args) {
        String[] cars = {"volvo", "bmw", "tata", "ford"};
        cars[0] = "mazda";
        for (String i : cars) {
            System.out.println(i);
        }
    }
}