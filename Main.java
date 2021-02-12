public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double bMI1 = service.calculate (76, 1.75);
        System.out.println(bMI1);

        double bMI2 = service.calculate (98, 1.98);
        System.out.println(bMI2);

        double bMI3 = service.calculate (50, 1.82);
        System.out.println(bMI3);

        double bMI4 = service.calculate (65, 1.42);
        System.out.println(bMI4);
    }

}
