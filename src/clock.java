import java.util.Scanner;
public class clock {
	public static void main(String args[]) {
		int minutes = 0;
		int hours = 0;
		int seconds = 0;
		boolean on = true;
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter hour: ");
		hours = in.nextInt();
		System.out.println("Please enter minutes: ");
		minutes = in.nextInt();
		System.out.println("Please enter seconds: ");
		seconds = in.nextInt();
		
		while(on == true) {
			seconds++;
			if(seconds > 59) {
				seconds = 0;
				if(seconds == 0) {
					minutes++;
					if(minutes > 59) {
						minutes = 0;
						if(minutes == 0) {
							hours++;
							if(hours > 12) {
								hours = 1;
							}
						}
					}
				}
			}
			System.out.println(hours + ":" + minutes + ":" + seconds);
		}
	}

}
