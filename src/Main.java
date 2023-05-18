public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double h;
        h = 1.87;
        int i = (int) h;
        double index;
        index = service.calculate(int w, double h);
        int z = (int) index;

        System.out.println(index);
    }
}