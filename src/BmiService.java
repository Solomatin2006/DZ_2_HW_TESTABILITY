public class BmiService {
    public int calculate(double weight, double height){
        double result = (weight / ((height * height) / 10_000)); // формула расчета
        return (int) (result); // преобразуем в целое значение и возврат
    }
}
