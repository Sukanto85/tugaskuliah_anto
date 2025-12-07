package Tugas_01;

import java.util.Arrays;
import java.util.LinkedList;

public class deklarasivariabel {
    public static void main(String[] args) {
		System.out.println("055930374 / SUKANTO / System Informasi");
		
		// 1. Deklarasi variabel dengan tipe integer bernama StrukturBaris
			  int StrukrurBaris = 0;
			  System.out.println("StrukturBaris = " +StrukrurBaris);
			 
		// 2. Deklarasi variabel dengan tipe data string bernama KotaBaru
			  String KotaBaru = "Deklarasi tipe data string";
			  System.out.println("KotaBaru");
			 
			  
		// 3. Deklarasi array dengan satu dimensi bernama 'empatAngka' tipe data integer yang berisikan angka (07,10,20,23)
			  int[] empatAngka = {07,10,20,23};
			  System.out.println("empatAngka : ");
			  for (int angka : empatAngka) {
				  System.out.println(angka +"");
			  }
			  
			  
		// 4. Deklarasi array dengan dua dimensi dengan nama 'Angka' tipe data sting yang terdiri tiga baris dan tiga kolom berisikan angka (1,2,5,14,19,20,22,27,29 )
			 String[][] Angka = {
					 {"1","3","5"},
					 {"14","19","20"},
					 {"22","27","29"},
			 };
			 System.out.println("\nArrays Dua Dimensi : \n");
			 for (String [] y : Angka) {
				 System.out.println(Arrays.toString(y));
			 }
			  
		// 5. Deklarasi linked list dengan nama 'listAngka' yang memiliki list (22,19,44,60,72)
			 LinkedList<Integer> listAngka = new LinkedList<Integer>();
			 listAngka.add(22);
			 listAngka.add(19);
			 listAngka.add(44);
			 listAngka.add(60);
			 listAngka.add(73);
			 System.out.println("ListAngka" +listAngka);
			  
			  
		
	}
}
