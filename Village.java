import Shapes.Shape;
import VillageComponent.House;
import VillageComponent.Tree;
import VillageComponent.WaterSource;

import java.util.ArrayList;
import java.util.List;

public class Village {
    String name;
    List<Shape> components;

    public Village(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    public void addHouse(int x, int y) {
        House house = new House(x, y, 20, 30);
        this.components.add(house);
    }

    public void addTree(int x, int y) {
        Tree tree = new Tree(x, y);
        this.components.add(tree);
    }

    public void addWaterSource(int x, int y) {
        WaterSource waterSource = new WaterSource(x, y);
        this.components.add(waterSource);
    }

    public void renderOnScreen() {
        System.out.println("Create the village");
        for (Shape component : this.components) {
            component.draw();
        }
        System.out.println("The village complete");
    }

    public static void main(String[] args) {
        Village village = new Village("IUT CSE");
        village.addHouse(10, 10);
        village.addHouse(20, 15);
        village.addHouse(55, 55);
        village.addTree(10, 30);
        village.addWaterSource(0, 5);

        village.renderOnScreen();
    }
}