import java.util.Scanner;

public class GunboatPt1{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter distance to target:\n");
        double distance = reader.nextDouble();
        System.out.println("Enter the height of battery from the water line:\n");
        double height = reader.nextDouble();
        System.out.println("Enter the initial velocity of the cannonball\n");
        double velocity = reader.nextDouble();

        double a = -4.9*(distance/velocity)*(distance/velocity);
        double b = distance;
        double c = a + height;
        
        double tanTheta = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);

        double Theta = Math.atan(tanTheta) * 180 / Math.PI;
        System.out.println("The angle needed is " + Theta + " degrees");
    }
    
}