import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner (System.in);
    public static void main(String[] args) {
        ArrayList<Circle> circles= new ArrayList<>();
        circles.add(new Circle(10));
        circles.add(new Circle(3));
        circles.add(new Circle(1));
        circles.get(2).setRadius(5);

        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(7,4));
        rectangles.add(new Rectangle(3,2));
        rectangles.add(new Rectangle(11,7));
        rectangles.get(1).setWidth(rectangles.get(2).getHeight());

        ArrayList<Triangle> triangles = new ArrayList<>();
        triangles.add(new Triangle(10,6));
        triangles.add(new Triangle(7,4));
        triangles.add(new Triangle(70,15));
        triangles.get(2).setHeight(triangles.get(2).getBase());

        displayCircles(circles);
        displayRectangles(rectangles);
        displayTriangles(triangles);
        System.out.println("^^^The prepared data^^^");
        System.out.println("======================================");

        while(true){
            try {
                System.out.print("What do you want to change?" +
                        "\n1-  Display circles" +
                        "\n2-  Display rectangles" +
                        "\n3-  Display triangles" +
                        "\n4-  Display all shapes" +
                        "\n5-  Add a circle object" +
                        "\n6-  Add a rectangle object" +
                        "\n7-  Add a triangle object" +
                        "\n8-  Remove a Circle" +
                        "\n9-  Remove a Rectangle" +
                        "\n10- Remove a Triangle" +
                        "\n11- change a circle radius" +
                        "\n12- change a rectangle" +
                        "\n13- change a triangle" +
                        "\n14- Exit" +
                        "\nChoose from the menu please: ");
                int choice = in.nextInt();
                switch (choice){
                    case 1 -> displayCircles(circles);
                    case 2 -> displayRectangles(rectangles);
                    case 3 -> displayTriangles(triangles);
                    case 4 -> {
                        displayCircles(circles);
                        displayRectangles(rectangles);
                        displayTriangles(triangles);
                    }
                    case 5 -> {
                        addCircle(circles);
                        System.out.println("Circle added successfully");
                        displayCircles(circles);
                    }
                    case 6 -> {
                        addRectangle(rectangles);
                        System.out.println("Rectangle added successfully");
                        displayRectangles(rectangles);
                    }
                    case 7 -> {
                        addTriangle(triangles);
                        System.out.println("Triangle added successfully");
                        displayTriangles(triangles);
                    }
                    case 8 -> {
                        removeCircle(circles);
                        System.out.println("Circle removed successfully");
                        displayCircles(circles);
                    }
                    case 9 -> {
                        removeRectangle(rectangles);
                        System.out.println("Rectangle removed successfully");
                        displayRectangles(rectangles);
                    }
                    case 10 -> {
                        removeTriangle(triangles);
                        System.out.println("Triangle removed successfully");
                        displayTriangles(triangles);
                    }
                    case 11 -> {
                        changeCircleRadius(circles);
                        System.out.println("Circle changed successfully");
                        displayCircles(circles);
                    }
                    case 12 -> {
                        changeRectangleDimensions(rectangles);
                        System.out.println("Rectangle changed successfully");
                        displayRectangles(rectangles);
                    }
                    case 13 -> {
                        changeTriangleDimensions(triangles);
                        System.out.println("Triangle changed successfully");
                        displayTriangles(triangles);
                    }
                    case 14 -> {
                        System.exit(0);
                    }
                    default -> throw new Exception("You should choose by a number from the menu!");

                }
            }catch(InputMismatchException e){
                System.out.println("your input should be a number!");
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println("==================================================");
        }

    }

    public static void displayCircles(ArrayList<Circle> circles){
        System.out.println("====================Circles====================");
        for (int i = 0; i<circles.size(); i++){
            Circle c = circles.get(i);
            System.out.print(i+1 + "-");
            System.out.println(c);
        }

    }

    public static void displayRectangles(ArrayList<Rectangle> rectangles){
        System.out.println("====================Rectangles====================");
        for (int i = 0; i<rectangles.size(); i++){
            Rectangle r = rectangles.get(i);
            System.out.print(i+1 + "-");
            System.out.println(r);
        }
    }

    public static void displayTriangles(ArrayList<Triangle> triangles){
        System.out.println("====================Triangles====================");
        for(int i = 0; i<triangles.size(); i++){
            Triangle t = triangles.get(i);
            System.out.print(i+1 + "-");
            System.out.println(t);
        }
    }

    public static void addCircle(ArrayList<Circle> circles){
        System.out.print("Enter the radius of the circle: ");
        circles.add(new Circle(in.nextDouble()));
    }

    public static void addRectangle(ArrayList<Rectangle> rectangles){
        System.out.print("Enter the height of the rectangle:");
        double height = in.nextDouble();
        System.out.print("Enter the width of the rectangle:");
        rectangles.add(new Rectangle(height,in.nextDouble()));
    }

    public static void addTriangle(ArrayList<Triangle> triangles){
        System.out.print("Enter the height of the triangle:");
        double height = in.nextDouble();
        System.out.print("Enter the base of the rectangle:");
        triangles.add(new Triangle(height,in.nextDouble()));
    }

    public static void removeCircle(ArrayList<Circle> circles) throws Exception{
        displayCircles(circles);
        System.out.println("Which one you want to remove?");
        int choice = in.nextInt();
        if(choice < 1 || choice > circles.size())
            throw new Exception("You should choose by a number from the menu!");
        else
            circles.remove(choice-1);
    }

    public static void removeRectangle(ArrayList<Rectangle> rectangles) throws Exception{
        displayRectangles(rectangles);
        System.out.println("Which one you want to remove?");
        int choice = in.nextInt();
        if(choice < 1 || choice > rectangles.size())
            throw new Exception("You should choose by a number from the menu!");
        else
            rectangles.remove(choice-1);
    }

    public static void removeTriangle(ArrayList<Triangle> triangles) throws Exception{
        displayTriangles(triangles);
        System.out.println("Which one you want to remove?");
        int choice = in.nextInt();
        if(choice < 1 || choice > triangles.size())
            throw new Exception("You should choose by a number from the menu!");
        else
            triangles.remove(choice-1);
    }

    public static void changeCircleRadius(ArrayList<Circle> circles) throws Exception{
        displayCircles(circles);
        System.out.println("Which one you want to change its radius");
        int choice = in.nextInt();
        if(choice < 1 || choice > circles.size())
            throw new Exception("You should choose by a number from the menu!");
        else {
            System.out.println("Enter the new radius:");
            circles.get(choice-1).setRadius(in.nextDouble());
        }
    }

    public static void changeRectangleDimensions(ArrayList<Rectangle> rectangles) throws Exception{
        displayRectangles(rectangles);
        System.out.println("Which one you want to change its dimensions");
        int choice = in.nextInt();
        if(choice < 1 || choice > rectangles.size())
            throw new Exception("You should choose by a number from the menu!");
        else {
            System.out.print("What to change?" +
                    "\n1- change height" +
                    "\n2- change width" +
                    "\nChoose: ");
            switch (in.nextInt()){
                case 1 -> {
                    System.out.print("Enter the new height: ");
                    rectangles.get(choice-1).setHeight(in.nextDouble());
                }
                case 2 -> {
                    System.out.print("Enter the new width: ");
                    rectangles.get(choice-1).setWidth(in.nextDouble());
                }
                default -> throw new Exception("You should choose by a number from the menu!");
            }
        }
    }

    public static void changeTriangleDimensions(ArrayList<Triangle> triangles) throws Exception{
        displayTriangles(triangles);
        System.out.println("Which one you want to remove?");
        int choice = in.nextInt();
        if(choice < 1 || choice > triangles.size())
            throw new Exception("You should choose by a number from the menu!");
        else {
            System.out.print("What to change?" +
                    "\n1- change height" +
                    "\n2- change base" +
                    "\nChoose: ");
            switch (in.nextInt()){
                case 1 -> {
                    System.out.print("Enter the new height: ");
                    triangles.get(choice-1).setHeight(in.nextDouble());
                }
                case 2 -> {
                    System.out.print("Enter the new base: ");
                    triangles.get(choice-1).setBase(in.nextDouble());
                }
                default -> throw new Exception("You should choose by a number from the menu!");
            }
        }
    }


}
