import java.util.Scanner;

public class AgeMassages{
    public static void main(String[] args){
	    Scanner input = new Scanner(System.in);
		int umur;
		
		System.out.print("berapa umur kamu?");
		umur = input.nextInt();
		
		if(umur >= 14){
		    System.out.println("kamu dapat membuat surat izin mengemudi (sim).");
		}
	}
}