import java.util.Scanner;

class Temperature {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        double celsius = r.nextDouble();
        System.out.println(convertTemp(celsius));
    }
    public static double[] convertTemp(double celsius)
    {
        double kelvin = celsius + 273.15;
        double fahrenheit = (celsius * 1.80) + 32.00;
        return new double[]{kelvin, fahrenheit};
    }
}
