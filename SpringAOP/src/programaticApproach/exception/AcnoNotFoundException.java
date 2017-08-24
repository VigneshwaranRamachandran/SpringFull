package programaticApproach.exception;

public class AcnoNotFoundException extends RuntimeException {

	
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
	
		return "Acno Invalid";
	}
}
