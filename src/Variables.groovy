class Variables {
    static void main(String[] args) {
        def x = 5;//Unlike concrete data types, this will receive ANY type
        int y = 5;
        def str = "sdasdas";


//        println(x * str); // At runtime str type getting known, and we get exception. DYNAMIC!

        println("value of x = " + x);
        println("value of y = " + y);
    }
}
