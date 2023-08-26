import java.util.Scanner;

public class OrderFood{
    public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	String cuaca;
	
	    System.out.print("Cuaca sore ini: ");
	    cuaca = input.nextLine();
	
	    if(cuaca.equals("hujan")){
	    System.out.println("saya membeli makanan menggunakan Aplikasi GoFood.");
	    }else{
	        System.out.println("Saya akan pergi ke restoran untuk membeli makanan.");
	    }
	}
}	