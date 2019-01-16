import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		Scanner scnr1 = new Scanner(System.in);
		
		int num;
		String cont;
		
		System.out.println("Learn your squares and cubes!");
		 do {
			System.out.print("Enter an integer: ");
			num = scnr.nextInt();
			
			System.out.printf("%-10s\t %-10s\t %-10s\t\n","Number", "Squared", "Cubed");
			
			String pads = String.format("%10s", "").replace(' ', '=');
			
			System.out.printf("%-7s\t %-7s\t %-7s\n", pads, pads, pads);		
			
			for(int i = 1; i <= num; i++) {
				System.out.printf("%-10d\t %-10d\t %-10d\n", i, i*i, i*i*i);
			}
			
			System.out.printf("%-10s\n", "Multiplication Table");
			
			
			String multiplicationTable = "";
			
			for(int i = 1; i <= num; i++) {
				multiplicationTable += "  " + i;
			}
			
			System.out.printf("%-7s\n", multiplicationTable);
			for(int i = 1; i <= num; i++) {
				System.out.printf("%-2d", i);
				for(int j = 1; j <= num; j++) {
					System.out.printf("%-3d", i*j);
				}
				System.out.println();
			}
			
			System.out.print("Continue? (y/n): ");
			cont = scnr1.nextLine();
			}while(!cont.equalsIgnoreCase("n"));
		 System.out.println("Goodbye");
		 scnr.close();
		 scnr1.close();
	}

}
