public class Main {
    public static void main(String[] args) {

        int x = 6;
        int y = 8;

        swap(x,y);

        System.out.println(x + " "+ y);

    }

     static void swap(int a , int b) {

        int tmp = a;
        a =b;
        b = tmp;

    }
}
