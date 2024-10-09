package com.xworkz.sortingandfiltering;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class ProductRunner {

    public static void main(String[] args) {
        Collection<ProductDTO> products = new ArrayList<>();

        ProductDTO prod1 = new ProductDTO(101, "Laptop", 75000, "Asus");
        ProductDTO prod2 = new ProductDTO(102, "Smartphone", 40000, "OnePlus");
        ProductDTO prod3 = new ProductDTO(103, "Earbuds", 3500, "Boat");
        ProductDTO prod4 = new ProductDTO(104, "TV", 60000, "Sony");
        ProductDTO prod5 = new ProductDTO(105, "Keyboard", 5000, "Razer");
        ProductDTO prod6 = new ProductDTO(106, "Mouse", 3000, "Logitech");
        ProductDTO prod7 = new ProductDTO(107, "Smartwatch", 15000, "Garmin");
        ProductDTO prod8 = new ProductDTO(108, "Tablet", 20000, "Microsoft");
        ProductDTO prod9 = new ProductDTO(109, "DSLR Camera", 85000, "Nikon");
        ProductDTO prod10 = new ProductDTO(110, "Bluetooth Speaker", 8000, "Sony");
        ProductDTO prod11 = new ProductDTO(111, "Printer", 18000, "Canon");

        products.add(prod1);
        products.add(prod2);
        products.add(prod3);
        products.add(prod4);
        products.add(prod5);
        products.add(prod6);
        products.add(prod7);
        products.add(prod8);
        products.add(prod9);
        products.add(prod10);
        products.add(prod11);

        products.forEach(product -> System.out.println(product));

        System.out.println("==================");

        products.stream().sorted().forEach(product -> System.out.println(product));

        System.out.println("==================");

        products.stream()
                .filter(product -> product.getCost() > 5000)
                .collect(Collectors.toList())
                .forEach(product -> System.out.println(product));

        System.out.println("==================");

        products.stream()
                .filter(product -> product.getCost() > 5000 && product.getCost() < 30000)
                .collect(Collectors.toList())
                .forEach(product -> System.out.println(product));

        System.out.println("==================");

        products.stream()
                .sorted((p1, p2) -> Double.compare(p2.getCost(), p1.getCost()))
                .collect(Collectors.toList())
                .forEach(product -> System.out.println(product));

        System.out.println("==================");

        products.stream()
                .filter(product -> product.getVendor().startsWith("S"))
                .sorted()
                .collect(Collectors.toList())
                .forEach(product -> System.out.println(product));

        System.out.println("==================");

        products.stream()
                .map(product -> product.getName())
                .collect(Collectors.toList())
                .forEach(product -> System.out.println(product));

        System.out.println("==================");

        products.stream()
                .map(product -> product.getId())
                .collect(Collectors.toList())
                .forEach(product -> System.out.println(product));

        System.out.println("==================");

        products.stream()
                .map(product -> product.getName().toUpperCase())
                .collect(Collectors.toList())
                .forEach(product -> System.out.println(product));
    }
}
