package task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. 5 ədəd Product obyekti yaradırıq və siyahıya əlavə edirik
        List<Product> products = new ArrayList<>();
        products.add(new Product("Telefon", 800));
        products.add(new Product("Mişka", 25));
        products.add(new Product("Noutbuk", 1500));
        products.add(new Product("Monitor", 300));
        products.add(new Product("Klaviatura", 45));

        // 2. Stream API ilə əməliyyatları ardıcıl yerinə yetiririk
        String result = products.stream()
                .filter(p -> p.price > 60)              // Qiyməti 60-dan böyük olanları seçirik
                .map(p -> p.name)                       // Obyektdən yalnız adları götürürük
                .sorted()                               // Adları əlifba sırası ilə düzürük
                .reduce("", (acc, name) -> {            // Adları birləşdiririk (Reduce)
                    return acc.isEmpty() ? name : acc + " " + name;
                });

        // 3. Nəticəni çap edirik
        System.out.println("Nəticə:");
        System.out.println(result);
    }
}