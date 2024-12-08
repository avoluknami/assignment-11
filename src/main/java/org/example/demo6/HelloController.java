package org.example.demo6;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HelloController {
    public static void main(String[] args) {
        Random random = new Random();
        List<Shape3DInterface> shapes = new ArrayList<>();

        // Generate 10 random 3D shapes
        for (int i = 0; i < 10; i++) {
            int shapeType = random.nextInt(3); // 0 = Sphere, 1 = Cylinder, 2 = Cube
            Shape3DInterface shape;

            switch (shapeType) {
                case 0:
                    double sphereRadius = 1 + random.nextDouble() * 9; // Radius between 1 and 10
                    shape = new Sphere(sphereRadius);
                    break;
                case 1:
                    double cylinderRadius = 1 + random.nextDouble() * 9; // Radius between 1 and 10
                    double cylinderHeight = 5 + random.nextDouble() * 15; // Height between 5 and 20
                    shape = new Cylinder(cylinderRadius, cylinderHeight);
                    break;
                default:
                    double cubeSide = 1 + random.nextDouble() * 9; // Side length between 1 and 10
                    shape = new Cube(cubeSide);
                    break;
            }

            shapes.add(shape);
        }

        // Output shape information
        for (Shape3DInterface shape : shapes) {
            System.out.println(shape);
            System.out.printf("Surface Area: %.2f%n", shape.surfaceArea());
            System.out.printf("Volume: %.2f%n", shape.volume());
            System.out.println("--------------------------");
        }
    }
}
