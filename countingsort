package Tugas_02;

//Counting sort yang mengurutkan dari terbesar ke terkecil.
public class countingsort {
    public static void countingSort(int[] arr) {
     if (arr == null || arr.length <= 1) return;

     // berfungsi untuk cari nilai minimum dan maksimum
     int min = arr[0], max = arr[0];
     for (int v : arr) {
         if (v < min) min = v;
         if (v > max) max = v;
     }

     int range = max - min + 1;  // Ukuran array counter
     int[] count = new int[range];

     // menghitung frekuensi
     for (int v : arr) {
         count[v - min]++;
     }

     // buat posisi awal untuk setiap nilai agar hasilnya menurun dan stabil.
     // pos[i] = jumlah elemen yang lebih besar dari nilai (min + i).
     int[] pos = new int[range];
     int suffixSum = 0;
     // iterasi dari index terbesar ke terkecil untuk menghitung jumlah elemen > current
     for (int i = range - 1; i >= 0; i--) {
         pos[i] = suffixSum;
         suffixSum += count[i];
     }

     // tempatkan elemen ke output menggunakan pos; iterasi input dari kiri ke kanan
     // sehingga stabilitas elemen yang sama dipertahankan
     int[] output = new int[arr.length];
     for (int v : arr) {
         int idx = v - min;
         int outIndex = pos[idx]++;
         output[outIndex] = v;
     }

     // Menyalin kembali ke Array
     System.arraycopy(output, 0, arr, 0, arr.length);
 }

 // Berfungsi untuk cetak array
 private static void printArray(int[] arr) {
     for (int v : arr) System.out.print(v + " ");
     System.out.println();
 }


 public static void main(String[] args) {
     int[] data = {34, 2, 23, 30, 5, 62, 18, 15}; // 8 elemen yang akan di urutkan 
     System.out.print("Sebelum diurutkan: ");   // berfungsi cetak 8 elemen yang belum di urutkan
     printArray(data);

     countingSort(data);
     
     System.out.print("Setelah diurutkan  : "); // berfungsi cetak 8 elemen yang sudah diututkan dari besar ke kecil
     printArray(data);
 }
}
