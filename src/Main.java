public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float heightM = 1.87f;
        float weightKg = 98f;
        float index = service.calculate(heightM, weightKg);
        System.out.println(index);
    }
}