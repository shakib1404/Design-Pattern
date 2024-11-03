
public class Main {
	public static void main(String[] args) {
        
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);

      
        System.out.println("Round peg fits: " + hole.fits(roundPeg)); 

        
        SquarePeg squarePeg = new SquarePeg(10);

        
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);

        
        System.out.println("Square peg fits: " + hole.fits(squarePegAdapter)); 
    }

}
