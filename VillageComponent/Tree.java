package VillageComponent;

import Shapes.*;

public class Tree extends ComplexShape {
    public Tree(int x, int y) {
        super(x, y);
        this.x = x;
        this.y = y;

        Shape trunk = new Cylinder(x, y, 5, 15);
        Shape circle = new Circle(x, y, 5);

        Shape[] components = new Shape[] {trunk, circle};
        this.addComponents(components);
    }
}