interface Drawable {
    void draw();
}

class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Square implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }
}

class Main {
    public static void main(String[] args) {
        Drawable d1 = new Circle();
        d1.draw();

        Drawable d2 = new Square();
        d2.draw();
    }
}
