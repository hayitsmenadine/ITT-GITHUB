package comm.itt.switchstatement;

public class SwitchExample {

	public static void main(String[] args) {
		char grade = 'a';
		switch(grade){
		case 'a':
		System.out.println("Excellent");
		break;
		case 'b':
			System.out.println("Almost Excellent");
			break;
		case 'c':
		System.out.println("ok");
		break;
		case 'd':
			System.out.println("Poor");
			break;
		default:
			System.out.println("Default");
			
			
		}

	}

}
