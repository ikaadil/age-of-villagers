package Shapes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComplexShape extends BaseShape {
    List<Shape> components = new ArrayList<>();

    public ComplexShape(int x, int y) {
        super(x, y);
        this.x = x;
        this.y = y;
    }

    public void addComponents(Shape[] components) {
        this.components.addAll(Arrays.asList(components));
    }

    @Override
    public void move(int x, int y) {
        for (Shape component : components)
            component.move(x, y);
    }

    @Override
    public void draw() {
        for (Shape component : components)
            component.draw();
    }
}