package EcommercePlatformSearch;
public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shampoo", "Health"),
            new Product(103, "Keyboard", "Electronics"),
            new Product(104, "Shoes", "Fashion"),
            new Product(105, "Book", "Education")
        };
        String target = "Shoes";
        // Linear Search
        long start1 = System.nanoTime();
        Product result1 = LinearSearch.search(products, target);
        long end1 = System.nanoTime();
        System.out.println("Linear Search Result: " + result1);
        System.out.println("Linear Search Time: " + (end1 - start1) + " ns");
        // Binary Search
        long start2 = System.nanoTime();
        Product result2 = BinarySearch.search(products, target);
        long end2 = System.nanoTime();
        System.out.println("Binary Search Result: " + result2);
        System.out.println("Binary Search Time: " + (end2 - start2) + " ns");
    }
}

