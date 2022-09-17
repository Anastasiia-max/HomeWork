/**
* Java Basic. Home Work 1
*
* @autor Lukina Anastasiia
* @todo 12.9.2022
* @date 17.9.2022
*/
class HomeWork3 {
    public static void main(String[] args){
        //task1
        int[] array = {10, 34, 22, 1,2};
        printArray(array);

        //task2
        int max =getMax(array);
        System.out.println("Max = " + max);

        //task3
    int[] inArray = {1, 0, 0, 1, 1, 0, 1, 0, 0};
        printArray(inArray);
        printArray(invertArray(inArray));
    }

        static void printArray(int[] array){
            System.out.print("[");
            for (int i = 0; i < array.length; i++){
                System.out.print(array[i]);
                if (i < array.length - 1){
                    System.out.print(", ");
                }
            }
            System.out.print("]");
        }

    static int getMax(int[] array){
        int max = array[0];
        for(int i = 0; i < array.length; i++){
            if (array[i] > max){
                max= array[i];
            }
        }
        return max;
    }


    static int[] invertArray(int[] array) {
        int[] result = new int[array.length];
        for (int i = 1; i < array.length; i++){
            result[i] = i - array[i];
        }
        return result;
    }
}