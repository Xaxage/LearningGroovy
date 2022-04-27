class Maps {
    static void main(String[] args) {
        Map map = [key1: 'value1', key2: 'value2']
        println(map);

        println(map.get('key2'));
        println(map.containsKey("key1"));

        map.put("key3", "value4");
        map.put("key3", "value3");

        println(map);
    }
}
