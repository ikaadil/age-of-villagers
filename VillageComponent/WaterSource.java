package VillageComponent;

import Shapes.*;

public class WaterSource extends ComplexShape {
    public WaterSource(int x, int y) {
        super(x, y);
        this.x = x;
        this.y = y;

        Shape[] components = new Shape[] { new Circle(x, y, 30) };
        this.addComponents(components);
    }
}