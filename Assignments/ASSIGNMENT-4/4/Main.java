
interface Movable {

    void moveUp();

    void moveDown();

    void moveLeft();

    void moveRight();
}

interface Resizable extends Movable {

    void resizeWidth();

    void resizeHeight();
}

class Rectangle implements Resizable {

    @Override
    public void moveUp() {
        System.out.println("Moved Up");
    }

    @Override
    public void moveDown() {
        System.out.println("Moved Down");
    }

    @Override
    public void moveLeft() {
        System.out.println("Moved Left");
    }

    @Override
    public void moveRight() {
        System.out.println("Moved Right");
    }

    @Override
    public void resizeWidth() {
        System.out.println("Resized Width");
    }

    @Override
    public void resizeHeight() {
        System.out.println("Resized Height");
    }
}

public class Main {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();

        rect.moveDown();
        rect.moveRight();
        rect.resizeWidth();
        rect.resizeHeight();
    }
}
