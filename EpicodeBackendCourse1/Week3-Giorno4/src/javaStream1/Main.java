package javaStream1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
    	   List<Product> products = new ArrayList<>();
           products.add(new Product("Baby Toy 1", "baby", 20));
           products.add(new Product("Baby Toy 2", "baby", 15));
           products.add(new Product("Baby Toy 3", "baby", 25));
           products.add(new Product("Book 1", "books", 10));
           products.add(new Product("Book 2", "books", 5));
           products.add(new Product("Boys Toy 1", "boys", 20));
           products.add(new Product("Boys Toy 2", "boys", 15));
           products.add(new Product("Boys Toy 3", "boys", 25));
           products.add(new Product("Girls Toy 1", "girls", 10));
           products.add(new Product("Girls Toy 2", "girls", 5));

           List<Order> orders = new ArrayList<>();
           orders.add(new Order(products.subList(0, 2)));
           orders.add(new Order(products.subList(2, 4)));
           orders.add(new Order(products.subList(4, 5)));

           List<Order> filteredOrders = orders.stream()
                   .filter(o -> o.getProducts().stream()
                           .anyMatch(p -> p.getCategory().equals("baby")))
                   .collect(Collectors.toList());

    	
    	
           
        List<Product> boysProducts = products.stream()
                .filter(p -> p.getCategory().equals("boys"))
                .map(p -> new Product(p.getName(), p.getCategory(), p.getPrice() * 0.9))
                .collect(Collectors.toList());
        
        System.out.println("Filtered Orders:");
        filteredOrders.forEach(o -> System.out.println(o.getProducts()));

        System.out.println("Boys Products with 10% discount:");
        boysProducts.forEach(p -> System.out.println(p.getName() + ": " + p.getPrice()));
    }
}

