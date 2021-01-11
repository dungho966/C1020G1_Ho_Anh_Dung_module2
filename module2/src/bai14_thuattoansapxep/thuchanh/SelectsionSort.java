package bai14_thuattoansapxep.thuchanh;

public class SelectsionSort {
    static double[] list = {1,9,4.5,6.6,5.7,-4.5};
    public static void selectionSort(double[] list){
        for (int i = 0 ; i < list.length-1 ; i++){
            double currentMin = list[i];
            int currentMinIndex = i;

            for(int j = i ; j < list.length ; j++){
                if (currentMin > list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        for(double element : list){
            System.out.println(element + " ");
        }
    }
}
