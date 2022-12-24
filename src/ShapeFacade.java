public class ShapeFacade {
    Rectangle rectangle;
    Square square;

    public ShapeFacade(){
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawSquare(){
        square.draw();
    }
}
