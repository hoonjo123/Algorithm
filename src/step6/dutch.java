package step6;

import java.util.Scanner;

public class dutch {
    public static void main(String[] args) {

        String[] names = {"호포", "짐", "킹", "퍼블릭", "달래"};
        double[] costs = {60000, 30000, 24000, 0, 39000};

        Scanner scanner = new Scanner(System.in);

        System.out.print("인원수를 입력하세요: ");
        int numPeople = scanner.nextInt();

        double totalCost = 0.0;

        for (double cost : costs) {
            totalCost += cost;
        }

        double perPersonCost = totalCost / numPeople;

        System.out.printf("총 비용: %.2f\n", totalCost);
        System.out.printf("1인당 비용: %.2f\n", perPersonCost);

    }
}
