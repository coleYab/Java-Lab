import java.util.*;

public class House {
    public double length;
    public double width;

    public double area;

    public House(double length, double width){
        this.length = length;
        this.width = width;
        this.area = length * width;
    }

    public void showData(){
        System.out.printf("I am a house, My area is %dm2", area);
    }

    public static void main(String []args){
        House myHouse;
        Scanner cin = new Scanner(System.in);
        double length, width;

        System.out.print("Enter height of your house: ");
        length = cin.nextDouble();
        System.out.print("Enter the width of your house: ");
        width = cin.nextDouble();

        System.out.print("Creating a new home\n");
        myHouse = new House(length, width);
        myHouse.showData();
    }

}