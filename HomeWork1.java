/**
* Java Basic. Home Work 1
*
* @autor Lukina Anastasiia
* @todo 5.9.2022
* @date 10.9.2022
*/
class HomeWork1 {
    public static void main(String[] args){
        // task 1
        int a = 15;
        int b = 5;
        int p = (a + b) * 2;
        int s = a * b;
        System.out.println(p);
        System.out.println(s);
        
        // task 2
        int x = 5;
        int y = 3;
        System.out.printf("%d + %d = %d\n", x, y, x + y);
        System.out.printf("%d - %d = %d\n", x, y, x - y);
        System.out.printf("%d * %d = %d\n", x, y, x * y);
        System.out.printf("%d / %d = %f\n", x, y, (float)x / y);
        
        //task 3
        int[] array = {4, 6, 9, 1, 2};
        System.out.printf ("[%d, %d, %d, %d, %d]\n", array[0], array[1], array[2], array[3], array[4]);
    }
}