package src.Project2;

public interface Shape {


    /*Create an Interface 'Shape' with undefined
    methods as calculateArea and
    calculatePerimeter. Create 2 classes Circle &
    Square that implements functionality defined in
    the Shape Interface. Test your code.
*/

    void calculateArea();
    void  calculatePerimiter();


}
class Circle implements Shape{
    double R=6;

    @Override
    public void calculateArea() {
        System.out.println(" The Are of circle is "+(3.14*R*R));
    }

    @Override
    public void calculatePerimiter() {
        int w=6;
        System.out.println("The perimeter of circle is "+(2*3.14*6));
    }
}

class Square implements Shape{
    int si=6;



    @Override
    public void calculateArea() {
        System.out.println("The are of Square is "+(2*6));
    }

    @Override
    public void calculatePerimiter() {
        System.out.println("the perimeter of Square is "+(4*si));
    }

    public static void main(String[] args) {
        Shape[] ship={new Circle(),new Square()};
        for(int i=0;i<ship.length;i++){
            ship[i].calculateArea();
            ship[i].calculatePerimiter();
        }
    }
}

//formula for finding are of a circle
// A= pi x r2
// formula for square to find the area and primate

// length.width



