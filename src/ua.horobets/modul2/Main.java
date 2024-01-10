package ua.horobets.modul2;

import java.io.*;
import java.util.*;
import java.util.stream.*;
/*

1.Отфильтровать продукты с количеством больше заданного значения
2.Подсчитать общее количество продуктов в холодильнике.
3.Найти среднюю цену продуктов.
4.Отсортировать продукты по цене в порядке убывания.
5.Подсчитать общую стоимость продуктов (цена * количество).
 */

public class Main {
    public static void main(String[] args) throws IOException {
        List<Product> products = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Володимир\\Videos\\I-Level\\I-level\\src\\ua.horobets\\modul2\\input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\|");
                String name = parts[0];
                int quantity = Integer.parseInt(parts[1]);
                double price = Double.parseDouble(parts[2]);
                products.add(new Product(name, quantity, price));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 1
        List<Product> filteredProducts = filterProducts(products);
        // 2
        int totalQuantity = getTotalQuantity(products);
        // 3
        double averagePrice = getAveragePrice(products);
        // 4
        List<Product> sortedProducts = sortProducts(products);
        // 5
        double totalCost = getTotalCost(products);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Володимир\\Videos\\I-Level\\I-level\\src\\ua.horobets\\modul2\\output.txt"))) {
            bw.write("Filtered products: " + filteredProducts);
            bw.newLine();
            bw.write("Total quantity: " + totalQuantity);
            bw.newLine();
            bw.write("Average price: " + Math.round( averagePrice* 100.0) / 100.0);
            bw.newLine();
            bw.write("Sorted products: " + sortedProducts);
            bw.newLine();
            bw.write("Total cost: " + totalCost);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Product> filterProducts(List<Product> products) {
        return products.stream()
                .filter(product -> product.quantity <= 5)
                .collect(Collectors.toList());
    }

    private static int getTotalQuantity(List<Product> products) {
        return products.stream()
                .mapToInt(product -> product.quantity)
                .sum();
    }

    private static double getAveragePrice(List<Product> products) {
        return products.stream()
                .mapToDouble(product -> product.price)
                .average()
                .orElse(0);
    }

    private static List<Product> sortProducts(List<Product> products) {
        return products.stream()
                .sorted(Comparator.comparingDouble(Product::getPrice).reversed())
                .collect(Collectors.toList());
    }

    private static double getTotalCost(List<Product> products) {
        return products.stream()
                .mapToDouble(product -> product.price * product.quantity)
                .sum();
    }


}


