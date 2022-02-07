import java.util.InputMismatchException;
import java.util.Scanner;

public class MainShape {
    public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
		try {
            while (true) {

                System.out.println("Selete shape as your choice: ");
                System.out.println("1. Circle");
                System.out.println("2. Rectangle");
                System.out.println("3. Square");
                System.out.println("4. Triangle");
                System.out.println("5. Sphere");
                System.out.println("6. Cylinder");
                System.out.println("7. Exit");
                System.out.println("******************");

                int number = scanner.nextInt();

                    switch (number) {
                        //For circle
                    
                        case 1:
                            System.out.println("Enter the Radius: ");
                            try {
                                double radiusOfCircle = scanner.nextInt();
                                if (radiusOfCircle < 0) {
                                    throw new Exception("Radius should be greater than 0 ");
                                }
                                Circle circle = new Circle();
                                System.out.println("Area of the Circle is " + circle.area(radiusOfCircle));
                                System.out.println("Circumference of the Circle is " + circle.circumference(radiusOfCircle));
                                
                            } catch (InputMismatchException inputMismatchException) {
                                System.out.println("Invalid Input");

                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        
                        //For Rectangle
                        case 2:
                            try {
                                System.out.println("Enter the length: ");
                                double length = scanner.nextInt();
                                if (length < 0) {
                                    throw new Exception("Length should be greater than 0 ");
                                }

                                System.out.println("Enter the breadth: ");
                                double breadth = scanner.nextInt();
                                if (breadth < 0) {
                                    throw new Exception("Breadth should be greater than 0 ");
                                }

                                Rectangle rectangle = new Rectangle();
                                System.out.println("Area of Rectangle is " + rectangle.area(length, breadth));
                                System.out.println("Perimeter fo Rectangle is " + rectangle.perimeter(length, breadth));
                                
                            } catch (InputMismatchException inputMismatchException) {
                                System.out.println("Invalid Input");
                                
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        
                        //For Square
                        case 3:
                            try {
                                System.out.println("Enter the Length of the Square");
                                double lengthOfSquare = scanner.nextInt();
                                if (lengthOfSquare < 0) {
                                    throw new Exception("Length cannot be less than 0");
                                }
                                Square square = new Square();
                                System.out.println("Area of Square is " + square.area(lengthOfSquare));
                                System.out.println("Perimeter of Square is " + square.perimeter(lengthOfSquare));
                                
                            } catch (InputMismatchException inputMismatchException) {
                                System.out.println("Invalid Input");
                                
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        
                            
                        // For Triangle
                        case 4:
                            try {
                                System.out.println("Enter the height of the Triangle");
                                double height = scanner.nextInt();
                                if (height < 0) {
                                    throw new Exception("Height cannot be less than 0");
                                }

                                System.out.println("Enter the Base of the Triangle");
                                double base = scanner.nextInt();

                                if (base < 0) {
                                    throw new Exception("Base cannot be less than 0");
                                }

                                System.out.println("Enter the side of the Triangle");
                                double side = scanner.nextInt();
                                if (side < 0) {
                                    throw new Exception("Side cannot be less than 0");
                                }

                                Triangle triangle = new Triangle();
                                System.out.println("Area of Triangle is " + triangle.area(height, base));
                                System.out.println("Perimeter of Triangle is " + triangle.perimeter(height, base, side));
                                
                            } catch (InputMismatchException inputMismatchException) {
                                System.out.println("Invalid Input");
                                
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;

                        //For Sphere
                        case 5:
                            System.out.println("Enter the Radius of the Sphere");
                            try {
                                double radiusOfSphere = scanner.nextInt();
                                Sphere sphere = new Sphere();

                                if (radiusOfSphere < 0) {
                                    throw new Exception("Radius Cannot be a Negative Number.");
                                }
                                System.out.println("Area of Sphere is " + sphere.area(radiusOfSphere));
                                System.out.println("Perimeter of Square is " + sphere.volume(radiusOfSphere));
                            } catch (InputMismatchException inputMismatchException) {
                                System.out.println("Invalid Input");
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;

                        //For Cylinder
                        case 6:
                            try {
                                System.out.println("Enter the Radius of the Cylinder");
                                double radiusOfCylinder = scanner.nextInt();

                                if (radiusOfCylinder < 0) {
                                    throw new Exception("Radius cannot be less than 0");
                                }
                                System.out.println("Enter the Height of the Cylinder");
                                double heightOfCylinder = scanner.nextInt();
                                Cylinder cylinder = new Cylinder();

                                if (heightOfCylinder < 0) {
                                    throw new Exception("Height cannot be less than 0");
                                }

                                cylinder.area(radiusOfCylinder, heightOfCylinder);
                                cylinder.volume(radiusOfCylinder, heightOfCylinder);
                                
                            } catch (InputMismatchException inputMismatchException) {
                                System.out.println("Not correct input");
                                
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;

                        case 7:
                            System.out.println("All done!!");
                            System.exit(0);

                        default:
                            System.out.println("Invalid Choice");
                    }
            }
        }
        catch (InputMismatchException inputMismatchException){
            System.out.println("Please Enter no. in given range");
        }
	}
    }
}
