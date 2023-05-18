public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double index = service.calculate(1.77,62);
        System.out.println(index);
    }
}