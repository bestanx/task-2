import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите объем (л), начальную температуру (°C) и энергию (Дж): ");
        double m = sc.nextDouble();
        double t = sc.nextDouble();
        double k = sc.nextDouble();
        double c = 4200;
        double L = 2.3e6;
        double qHeat = m * c * (100 - t);
        if (k < qHeat) {
            double tFinal = t + k / (m * c);
            System.out.printf("Вода нагрелась до %.2f°C. Осталось: %.2f л\n", tFinal, m);
        } else {
            double mEvap = (k - qHeat) / L;
            if (mEvap < m) {
                System.out.printf("Вода кипит. Осталось: %.2f л. Температура: 100°C\n", m - mEvap);
            } else {
                System.out.println("Вся вода испарилась. Осталось: 0 л.");
            }
        }
        sc.close();
    }
}