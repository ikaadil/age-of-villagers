package VillageComponent;

import Shapes.*;

public class House  extends ComplexShape {
    public House(int x, int y, int width, int height) {
        super(x, y);
        Shape wall = new Rectangle(x, y, height, height);
        Shape roof = new Rectangle(x, y, width, width);

        Shape[] components = new Shape[] {wall, roof};
        this.addComponents(components);
    }
}