package Tugas_02;

public class margesort {
    // Fungsi publik untuk memanggil merge sort
	private static void MergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) return;
        int[] temp = new int[arr.length];
        mergeSortRecursive(arr, temp, 0, arr.length - 1);
    }

    private static void mergeSortRecursive(int[] arr, int[] temp, int left, int right) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;
        mergeSortRecursive(arr, temp, left, mid);
        mergeSortRecursive(arr, temp, mid + 1, right);
        mergeDescending(arr, temp, left, mid, right);
    }

    // Merge dua bagian sehingga hasilnya menurun (descending)
    private static void mergeDescending(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left;      // indeks bagian kiri
        int j = mid + 1;   // indeks bagian kanan
        int k = left;      // indeks di temp

        while (i <= mid && j <= right) {
            // Untuk urut menurun, pilih elemen yang lebih besar terlebih dahulu
            if (arr[i] >= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Salin sisa bagian kiri (jika ada)
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Salin sisa bagian kanan (jika ada)
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // Salin kembali ke Array
        for (int idx = left; idx <= right; idx++) {
            arr[idx] = temp[idx];
        }
    }

    // Berfungsi cetak array
    private static void printArray(int[] arr) {
        for (int v : arr) System.out.print(v + " ");
        System.out.println();
    }

    // Contoh pemakaian (minimal 8 elemen)
    public static void main(String[] args) {
        int[] data = {34, 1, 23, 32, 5, 62, 18, 49}; // 8 elemen contoh
        System.out.print("Sebelum diurutkan: "); // mencetak hasil 8 elemen yang belum diurutkan
        printArray(data);

        MergeSort(data);

        System.out.print("Setelah diurutkan  : "); // mencetak hasil 8 elemen yang sudah di urutkan dari besar ke kecil
        printArray(data);
    }

}
