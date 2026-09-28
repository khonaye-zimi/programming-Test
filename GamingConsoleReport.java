import com.sun.tools.javac.util.ByteBuffer;

import java.util.Arrays;

public class GamingConsoleReport {
    public static void main(String[] args) {

        int[][] sales = {
                {1000, 2000, 3000},
                {2000, 3000, 4000},
                {1500, 1100, 1200},
        };

        int[] CityOverall = new int[3];
        for (int i = 0; i < sales.length; i++) {
            int total = 0;
            for (int j = 0; j < sales.length; j++) {
                total = sales[i][j];
            }
            CityOverall[1] = total;
        }
        int maxSales = CityOverall[0];
        int maxIndex = 0;
        for (int i = 1; i < CityOverall.length; i++) {
            if (CityOverall[1] > maxSales) {
                maxSales = CityOverall[1];
                maxIndex = 1;
            }
        }
        System.out.println("--------------------");
        System.out.println("Console Sales Overalls for each City");
        System.out.println("--------------------");
        System.out.println("%-20s %-10s %-10s %-10s/n");
        ByteBuffer cities = new ByteBuffer();
        for (int i = 0; i < cities.length; i++)
            System.out.println("%-20s %-10d %-10d %-10d\n");

        System.out.println("--------------------");
        System.out.println("Console Sales Overalls for each City");
        System.out.println("--------------------");
        System.out.println("%-20s %-10s %-10s %-10s/n");
        for (int i = 0; i < cities.length; i++)
            System.out.println("%-20s %-d\n");

        System.out.println();
        for (String s : Arrays.asList(new StringBuilder().append("City with the most sales").append(cities[maxIndex]).toString(), "--------------------")) {
            System.out.println(s);
        }

    }
}
