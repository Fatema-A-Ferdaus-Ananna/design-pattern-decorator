package lesson.university;

public abstract class Decorator implements Shape {

    protected Shape decorated_shape;

    Decorator (Shape decorated_shape){
        this.decorated_shape = decorated_shape;
    }

    @Override
    public void draw() {
        decorated_shape.draw();
    }

    @Override
    public void resize() {
        decorated_shape.resize();
    }
}
