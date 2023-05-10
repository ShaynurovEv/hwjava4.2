public class BmiService {
    public float calculate(float heightM, float weightKg) {
        float bmi = weightKg / (heightM * heightM);
        return (int) bmi;
    }
}