package main;

import main.products.Book;
import main.products.VideoGame;

public class App {
    public static void main(String[] args) throws Exception {
        DelivetyService delivetyService = new DelivetyService();

        delivetyService.setupOrder(
            new CompositeBox(
                new VideoGame("The Legend of Zelda: Breath of the Wild", 59.99)
            ),
            new CompositeBox(
                new CompositeBox(
                    new Book("The Hobbit", 9.99),
                    new Book("The Lord of the Rings", 19.99)
                ),
                new VideoGame("The Legend of Zelda: Ocarina of Time", 39.99),
                new VideoGame("The Legend of Zelda: Majora's Mask", 39.99)
            )
        );

        System.out.println("Total price: " + delivetyService.calculateTotalPrice());
    }
}
