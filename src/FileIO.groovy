class FileIO {

    static void createFile(String path = './', String fileName = 'cratedFile.txt', String content) {
        try {
            File file = new File(path, fileName);
            file.write(content);
        } catch (e) {
            assert e;
        }
    }

    static String readFile(String path) {
        try {
            File file = new File(path);
            return file.text;
        } catch (e) {
            assert e;
        }
    }

    static void writeContent(String path, String content) {
        File file = new File(path);
        file.withWriter {
            BufferedWriter writer -> writer.writeLine(content);
        }

    }

    static void main(String[] args) {
//        createFile('./', 'hello.txt', 'HELLO NIGGAZ')
//        def readContent = readFile('./hello.txt');
//        println(readContent);

//        writeContent('./hello.txt', 'Shut the FUCK UP');

        File file = new File('./hello.txt');
        if (file.isFile()) {
            println("The file size is ${file.length()} bytes");
        } else {
            println("This is not a file!");
        }
    }
}
