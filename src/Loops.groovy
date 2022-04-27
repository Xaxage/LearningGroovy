class Loops {
    static void main(String[] args) {
        int x = 1;

        while (x < 10) {
            println(x);
            x++;
        }

        for (i in 1..<10) {
            println(i);
        }

//        int[] arr = [1,2,3,4,5,6,7,8,9];
        def arr = [1, 2, 3, 4, 'x', 'y', 7, 8, 9];


        for (i in arr) {
            println(i);
        }
    }
}
