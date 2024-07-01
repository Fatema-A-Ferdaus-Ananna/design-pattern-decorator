package lesson.university;

public class ConcreteDecorate extends Decorator{

    ConcreteDecorate(Shape decorated_shape) {
        super(decorated_shape);
    }

    @Override
    public void draw() {
        super.draw();
        set_border(decorated_shape);
    }

    @Override
    public void resize() {
        super.resize();
    }

    private void set_border(Shape decorated_shape){
        System.out.println("Border color :  RED  ");
    }
}
