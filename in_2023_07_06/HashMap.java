package in_2023_07_06;

public class HashMap {

    public String[] hashMap;

    public HashMap(int size) {
        this.hashMap = new String[size];
    }

    public int hash(String key) {
        int hashCode = 0;
        for (int i = 0; i < key.length(); i++) {
            hashCode += key.codePointAt(i);
        }
        return hashCode;
    }

    public static void main(String[] args) {
        HashMap newHashMap = new HashMap(3);
        System.out.println(newHashMap.hash("c"));
        System.out.println(newHashMap.hash("ca"));
        System.out.println(newHashMap.hash("car"));
    }
}
