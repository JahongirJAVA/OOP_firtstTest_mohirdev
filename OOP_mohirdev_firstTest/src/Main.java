import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        details car = new details();

        System.out.println("Mashinaning rangini kiriting: ");
        car.color = scanner.nextLine();
        System.out.println("Mashinaning markasini kiriting: ");
        car.model = scanner.nextLine();
        System.out.println("Mashina necha pul atrofida bolishi kerarakligini kiritng: ");
        car.price = scanner.nextDouble();
        System.out.println("Mashina avtomat bolsinmi yoki mexanik?");
        car.type = scanner.next();

        car.print();
    }
}
