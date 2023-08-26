import java.util.Scanner;

public class JobVacancy{
    public static void main (String[] args){
	    // Deklarasi variabel yang diperlukan
		int umur, pengalaman;
		double penampilan;
		String lulusan, nama, jenisKelamin, posisi, hasil;
		boolean reqKoor1, reqKoor2, reqAdmin1, reqAdmin2, reqAdmin3, reqSpv1, reqSpv2;
		
		Scanner input = new Scanner (System.in);
		
		// Output Text Untuk kebutuhan Data input User 
		System.out.println("Selamat Datang di PT. Secret Semut 79");
		System.out.println("======================================\n");
		
		System.out.println("Silahkan Input Data Anda : \n");
		
		System.out.println("Nama :");
		nama = input.next();
		
		System.out.println("Umur :");
		umur = input.nextInt();
		
		System.out.println("Jenis Kelamin (Pria/Wanita) :");
		jenisKelamin = input.next();
		
		System.out.println("Lulusan (SMK/D3/S1 : ");
		lulusan = input.next();
		
		System.out.println("Pengalaman (Tahun) : ");
		pengalaman = input.nextInt();
		
		System.out.println("Penampilan (1 s.d 10) :");
		penampilan = input.nextInt();
		
		System.out.println("Posisi yang Dilamar (SPV, Admin, atau Koordinator) :");
		posisi = input.next();
		
		//Kondisi if untuk menentukan Posisi yang dipilih
		if (posisi.equalsIgnoreCase("Koordinator")){
			//membuat kondisi setiap kriteria koordinator
			reqKoor1= jenisKelamin.equalsIgnoreCase("Pria") && umur >= 21 && umur <= 30 && (lulusan.equalsIgnoreCase("SMK") || lulusan.equalsIgnoreCase("D3")) && pengalaman >= 2;
			reqKoor2= jenisKelamin.equalsIgnoreCase("Pria") && umur >= 30 && lulusan.equalsIgnoreCase("S1") && pengalaman>= 5;
			
			//kondisi if untuk Menentukan Hasil Kelulusan posisi Koordinator
			if(reqKoor1 || reqKoor2){
				hasil = "selamat, " + nama + ".\nAnda memenuhi syarat Sebagai " + posisi + ". Dan akan masuk ke tahap Selanjutnya.";
			}else {
				hasil = "maaf," + nama + "./nAnda Tidak memenuhi syarat sebagai " + posisi + ". Dan Tidak akan masuk ke Tahap Selanjutnya.";
			}
		}else if(posisi.equalsIgnoreCase("Admin")){
			// membuat kondisi setiap kriteria Admin 
			reqAdmin1 = jenisKelamin.equalsIgnoreCase("Wanita") && umur >= 20 && umur <= 25 && lulusan.equalsIgnoreCase("D3") && (penampilan>=8.5 || pengalaman >= 1);
			reqAdmin2 = jenisKelamin.equalsIgnoreCase("Wanita") && umur >= 25 && lulusan.equalsIgnoreCase("S1") && penampilan>=8.5 || pengalaman >= 1;
			reqAdmin3 = jenisKelamin.equalsIgnoreCase("Pria") && umur >= 20 && umur <= 30 && penampilan>= 8.5 && (lulusan.equalsIgnoreCase("D3") || lulusan.equalsIgnoreCase("S1")) && pengalaman >= 2;
			// Kondisi if untuk menentukan Hasil kelulusan Posisi Admin
			if(reqAdmin1 || reqAdmin2 || reqAdmin3) {
				hasil = "selamat, " + nama + ".\nAnda memenuhi syarat sebagai " + posisi + ". Dan akan masuk ke tahap selanjutnya.";
			}else{
				hasil = "maaf, " + nama + ".\nAnda tidak memenuhi syarat sebagai " + posisi + ". Dan tidak akan masuk ke tahap selanjutnya.";
			}
		}else if(posisi.equalsIgnoreCase("SPV")){
			//membuat kondisi setiap kriteria SPV 
			reqSpv1 = umur >= 23 && umur <= 30 && lulusan.equalsIgnoreCase("S1") && pengalaman > 1;
			reqSpv2 = umur >= 25 && umur <= 35 && lulusan.equalsIgnoreCase("D3") && pengalaman > 4;
			
			// kondisi if untuk menentukan Hasil kelulusan posisi SPV
			if(reqSpv1 || reqSpv2) {
				hasil = "selamat," + nama + ".\nAnda memenuhi syarat sebagai " + posisi + ". Dan akan masuk ke tahap selanjutnya.";
			}else{	
			    hasil = "maaf, " + nama + ".\nAnda tidak memenuhi syarat sebagai " + posisi + ". Dan tidak akan masuk ke tahap selanjutnya.";
			}	
		}else{
			// hasil ketika posisi yang dimasukan tidak sesuai atau tidak ada.
			hasil = "maaf posisi yang anda cari tidak tersedia.";
		}
		
		System.out.println();
		System.out.println(nama+",Terimakasih Sudah mengikuti lowangan kerja di PT. Secret semut 79.\n");
		System.out.println("berikut adalah Hasil dari Rekrutmen untuk Posisi" + posisi+ ":");
		System.out.println(hasil);
	}
}
		