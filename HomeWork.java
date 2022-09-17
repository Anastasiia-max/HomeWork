/**
* Java Basic. Home Work 2
*
* @autor Lukina Anastasiia
* @todo 7.9.2022
* @date 17.9.2022
*/
class HomeWork {
    public static void main(String[] args){
        //task 1
        int t = 30;
        if (t < 0){
            System.out.println("It is frost");
        } else if (t >= 0 && t <=18) {
            System.out.println("It is cold");
        } else if (t >= 19 && t <= 28) {
            System.out.println("It is warm");
        } else if (t >= 29) {
            System.out.println("It is hot");
        }
        //task2
        boolean isWeekend = true;
        boolean isRain = true;
        if (isWeekend && !isRain) {
        System.out.println("It can walk");
        } else {
        System.out.println("It can not walk");
        }
        //task3
    int a = 4;
    int b = 8;
    System.out.printf("%d + &d =&d\n", a, b, add (a,b));
    System.out.printf("%d - &d =&d\n", a, b, sub (a,b));
    System.out.printf("%d * &d =&d\n", a, b, mul (a,b));
    System.out.printf("%d / &d =&f\n", a, b, div (a,b));
    static int add(int a, int b){
        return a + b;
    }
    static int sub(int a, int b){
        return a - b;
    }
    static int mul(int a, int b){
        return a * b;
    }
    static float div(float a, float b){
        return a / b;
    }
}