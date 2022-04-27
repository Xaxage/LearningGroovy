class Lists {
    static void main(String[] args) {
        List list = [1, 1, 2, 3, 4, 5, 10, 6, 7];
        list.add(20);
        list.sort();
        list.pop();
        list.remove(0);
        println("List contains value 20? " + list.contains(20));

        println(list);
    }
}
