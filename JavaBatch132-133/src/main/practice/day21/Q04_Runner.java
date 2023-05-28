package main.practice.day21;

public class Q04_Runner {

    public static void main(String[] args) {

        Q04_Volume volume= new Q04_Volume();
        System.out.println("Volume of Cylinder is: "+volume.volumeOfCylinder(5, 10));//Volume of Cylinder is: 785.0

        System.out.println("Volume of Rectangular Prism is: "+volume.volumeOFRectangularPrism(4, 5, 11.5));
        //Volume of Rectangular Prism is: 230.0

        Q04_Area area= new Q04_Area();
        System.out.println("Area of square is: "+area.areaOfASquare(4.5));
        //Area of square is: 18.0
    }
}
