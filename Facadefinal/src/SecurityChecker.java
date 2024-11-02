
public class SecurityChecker {
    public boolean checkSecurityPIN(String pin) {
        
        System.out.println("Checking security PIN...");
        return pin.equals("1234"); 
    }
}
