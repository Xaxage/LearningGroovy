class Method {

    static int a = 69;

    static def printSmt() {
        println("Hello my niggaz");
    }

//    static def addNumbers(int x, int y) {
//        return x + y;
//    }

    //When we call this method with 1 param,it will replace x and use y = 0, which we mentioned
    static def addNumbers(int x = 0, int y = 0) {
        return x + y;
    }

    static void main(String[] args) {
        printSmt();
        println(addNumbers(1, 2));
        println(addNumbers(10));

        println(a + " NOICE");
    }
}
