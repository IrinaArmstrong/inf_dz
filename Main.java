package inf_dz;


public class Main {

	public static void main(String[] args) {
    Keys myKeys = new Keys(3000,2000,5000);
    
    long message = 111111;
    System.out.format("message = %d ", message);
    message = features.FieldPow(message, (long)myKeys.GetPublicKey()[0], (long)myKeys.GetPublicKey()[1]);
    System.out.format("message = %d ", message);
    message = features.FieldPow(message, (long)myKeys.GetPrivateKey()[0], (long)myKeys.GetPrivateKey()[1]);
    System.out.format("message = %d ", message);
	}

}
