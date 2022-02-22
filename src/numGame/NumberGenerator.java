package numGame;

public class NumberGenerator {
	
	  public static void main( String args[] ) {
          int min = 1;
          int max = 100;


          System.out.println("Winning number is ");
          int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
          System.out.println(random_int);
        }



}
