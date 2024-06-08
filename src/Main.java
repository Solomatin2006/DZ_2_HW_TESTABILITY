public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bmi = service.calculate(98, 187); // вес в кг, рост в см
        System.out.println(("Body mass index = ") + bmi); // выводим результат
    }
}
