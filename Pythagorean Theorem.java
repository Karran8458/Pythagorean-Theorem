import java.lang.Math;

public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        double hypotenuse;
		hypotenuse = Math.sqrt(Math.pow(legA, 2) + Math.pow(legB, 2));
		return hypotenuse;
    }
	public static void main(String []args){
        Pythagorean triangle = new Pythagorean();
        double hypotenuse;
		int legA = 3;
		int legB = 4;
		hypotenuse = triangle.calculateHypotenuse(legA, legB);
        System.out.println(hypotenuse);
     }
}
