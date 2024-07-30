package TestNg4;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 11;
        boolean flag = false;
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                flag = false;
                break;
            }
        }


        if (!flag) {
            System.out.println(" not prime number");
        } else {
            System.out.println(" prime numb er");
        }

	}

}
