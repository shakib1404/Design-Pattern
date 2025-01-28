
public class calculator {
	
	 public int add(int a, int b) {
	        // Check if the input is within valid range
	        if (a < 0 || b < 0) {
	            throw new IllegalArgumentException("Inputs must be non-negative");
	        }
	        // Perform addition
	        return a + b;
	    }

	    public static void main(String[] args) {
	        calculator calculator = new calculator();

	        // Test if the result is correct
	        int result = calculator.add(2, 3);
	        if (result != 5) {
	            System.out.println("Test failed!");
	        } else {
	            System.out.println("Test passed!");
	        }
	    }

}

public class calculator{
	

	 public int add(int a, int b) {
		 
		 ValidateNumber( a, b);
	        
	     
	        return a + b;
	    }
	 
	 void ValidateNumber(int a,int b)
	 {
		 
		 if (a < 0 || b < 0) {
	            throw new IllegalArgumentException("Inputs must be non-negative");
	        }
		 
	 }
	 
	 public static void main(String[] args) {
	        calculator calculator = new calculator();

	        
	        assert calculator.add(2, 3)==5:"test failed";
	        
	        System.out.println("All tests passed!");
	        
	        
	    }

	
}
