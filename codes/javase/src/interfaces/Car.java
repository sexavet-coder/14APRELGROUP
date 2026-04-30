package interfaces;

class Car implements Transport {

    @Override
    public void move() {
        System.out.println("Maşın yolda sürür");
    }
}
