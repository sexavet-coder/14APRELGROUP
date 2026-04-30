package interfaceHomeWork;

import java.util.Objects;

class Toy {
    String name;
    int price;

    // Konstruktor: Oobyekt yradilarken deyerleri menimsetmek ucun
    public Toy(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // 3. toString metodununu overide edirik
    @Override
    public String toString() {
        return "[Oyuncaq: " + name + ", Qiymət: " + price + " AZN]";
    }

    // 6. equals metodunun deyerlere gore overide edirik
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // eyni unvandadirsa true
        if (o == null || getClass() != o.getClass()) return false; // Tipini yoxluyuruq
        Toy toy = (Toy) o;
        return price == toy.price && Objects.equals(name, toy.name); // Ad və qiymət eynidirse true qaytarir
    }
}
