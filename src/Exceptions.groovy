class Exceptions {
    static void main(String[] args) {
        try {
            File file = new File("./nonExistent.txt");
            println(file.readLines());
        } catch (FileNotFoundException ex) {
            println("File hasn't been found! :c");
        } finally {
            println("Finally block will execute NO MATTER WHAT!!!");
        }

        println("Continue execution.");

    }
}
