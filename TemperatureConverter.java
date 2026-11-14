
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Температурный конвертер");
        System.out.println("1. Цельсий в Фаренгейт");
        System.out.println("2. Фаренгейт в Цельсий");
        System.out.println("3. Цельсий в Кельвин");

        System.out.print("Выберите операцию: ");
        int choice = scanner.nextInt();

        System.out.print("Введите температуру: ");
        double temperature = scanner.nextDouble();

        switch (choice) {
            case 1:
                double fahrenheit = (temperature * 9 / 5) + 32;
                System.out.println("Результат: " + fahrenheit + " °F");
                break;

            case 2:
                double celsius = (temperature - 32) * 5 / 9;
                System.out.println("Результат: " + celsius + " °C");
                break;

            case 3:
                double kelvin = temperature + 273.15;
                System.out.println("Результат: " + kelvin + " K");
                break;

            default:
                System.out.println("Неверный выбор!");
        }

        scanner.close();
    }
}
