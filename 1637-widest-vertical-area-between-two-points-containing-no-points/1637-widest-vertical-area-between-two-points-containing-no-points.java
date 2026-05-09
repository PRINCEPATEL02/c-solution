class Solution {

    // Merge Sort
    public void mergeSort(int[] arr, int left, int right) {

        if (left >= right) {
            return;
        }

        int mid = (left + right) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        merge(arr, left, mid, right);
    }

    public void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {

            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }

            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public int maxWidthOfVerticalArea(int[][] points) {

        int n = points.length;

        // Store x-coordinates only
        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = points[i][0];
        }

        // Sort using Merge Sort
        mergeSort(x, 0, n - 1);

        int max = 0;

        // Find maximum gap
        for (int i = 1; i < n; i++) {

            int diff = x[i] - x[i - 1];

            if (diff > max) {
                max = diff;
            }
        }

        return max;
    }
}