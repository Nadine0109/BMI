public class BmiService {
    public double calculate (double weight, double height) {
        double bMI = weight / (height*height);
        return bMI;
    }
}
