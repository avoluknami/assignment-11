DESCRIPTION OF THE PROJECT
This project demonstrates the concept of polymorphism in Java by modeling 3D shapes with a shared interface, Shape3DInterface. 
The interface defines two methods, surfaceArea() and volume(), which are implemented differently by the specific 3D shapes: Sphere, Cylinder, and Cube.
Each class provides its unique implementation of these methods based on the mathematical formulas for its geometry.

The program creates 10 random objects of these 3D shapes, calculates their surface area and volume, and displays the results. 
This showcases how polymorphism allows different types of objects to be treated uniformly, while still behaving according to their specific implementations.


HOW POLYMORPHISM IS USED
Polymorphism is achieved through the Shape3DInterface, which acts as a contract for all 3D shape classes. Here’s how polymorphism is utilized:

Interface-Based Abstraction:
The Shape3DInterface defines two methods: surfaceArea() and volume(). All 3D shape classes implement these methods, providing their specific formulas.
Uniform Treatment of Different Classes:
Objects of Sphere, Cylinder, and Cube are stored in a single list of type List<Shape3DInterface>.
The program iterates through the list, calling surfaceArea() and volume() methods on the Shape3DInterface references. At runtime, the appropriate method for each specific object type is executed.
Dynamic Method Dispatch:
The JVM determines which method implementation to call based on the actual object type, even though the reference is of type Shape3DInterface.
Example:

A Shape3DInterface reference might point to a Sphere object. When surfaceArea() is called, the Sphere's implementation is executed.

<img width="926" alt="Screenshot 2024-12-08 at 13 30 00" src="https://github.com/user-attachments/assets/31a77ebe-5798-4c24-adae-2eaddaab7b1d">

<img width="926" alt="Screenshot 2024-12-08 at 13 30 11" src="https://github.com/user-attachments/assets/3372c02b-603a-4019-8b21-863b3c3c4a89">

