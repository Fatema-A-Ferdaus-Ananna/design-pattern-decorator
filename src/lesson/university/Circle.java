package lesson.university;

public class Circle implements  Shape{
    @Override
    public void draw() {

        System.out.println("Circle Shape ...........");
    }

    @Override
    public void resize() {
        System.out.println("Resize The Shape.......");
    }


}
