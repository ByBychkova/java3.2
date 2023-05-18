public class BmiService {

    public int calculate(double height , int weight ) {
        int result;
        double index = weight / (height * height);
        result = (int) index;

        return result;
    }

}