public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double bmi1 = service.calculate(76, 1.75);
        System.out.println(bmi1);

        double bmi2 = service.calculate(98, 1.98);
        System.out.println(bmi2);

        double bmi3 = service.calculate(50, 1.82);
        System.out.println(bmi3);

        double bmi4 = service.calculate(65, 1.42);
        System.out.println(bmi4);
    }

}
