public class BmiService {

    public int calculate(int w, double h) {
        double index = w / (h * h);
        return index;
    }

}