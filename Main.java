import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner in = new Scanner(System.in);
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

        displayShapes(circles,rectangles,triangles);

    }

    public static void displayShapes(ArrayList<Circle> circles, ArrayList<Rectangle> rectangles, ArrayList<Triangle> triangles){
        System.out.println("====================Circles part====================");
        for (int i = 0; i<circles.size(); i++){
            Circle c = circles.get(i);
            System.out.print(i+1 + "-");
            System.out.println(c);
        }
        System.out.println("====================Rectangles part====================");
        for (int i = 0; i<rectangles.size(); i++){
            Rectangle r = rectangles.get(i);
            System.out.print(i+1 + "-");
            System.out.println(r);
        }
        System.out.println("====================Triangles part====================");
        for(int i = 0; i<triangles.size(); i++){
            Triangle t = triangles.get(i);
            System.out.print(i+1 + "-");
            System.out.println(t);
        }
    }
}