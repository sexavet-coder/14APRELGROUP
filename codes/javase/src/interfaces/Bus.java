package interfaces;

class Bus implements Transport {

    @Override
    public void move() {
        System.out.println("Avtobus sərnişin daşıyır");
    }
}

