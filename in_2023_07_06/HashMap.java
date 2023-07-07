package in_2023_07_06;

import java.util.Arrays;

public class HashMap {

    public String[] hashmap;

    public HashMap(int size) {
        this.hashmap = new String[size];
    }

    public int hash(String key) {
        int hashCode = 0;
        for (int i = 0; i < key.length(); i++) {
            hashCode += key.codePointAt(i); // alternatively: hashCode = hashCode + Character.codePointAt(key, i);
        }
        hashCode %= this.hashmap.length;
        return hashCode;
    }

    public void assign(String key, String value) {
        int arrayIndex = this.hash(key);
        this.hashmap[arrayIndex] = value;
    }

    public String retrieve(String key) {
        int arrayIndex = this.hash(key);
        return this.hashmap[arrayIndex];
    }

    public static void main(String[] args) {
        HashMap newHashMap = new HashMap(3);
        System.out.println(newHashMap.hash("c"));
        System.out.println(newHashMap.hash("ca"));
        System.out.println(newHashMap.hash("car"));

        HashMap employees = new HashMap(3);
        employees.assign("34-567", "Mara");
        System.out.println(Arrays.toString(employees.hashmap));

        HashMap aboutMe = new HashMap(3);
        aboutMe.assign("myFavoriteColor", "brown");
        System.out.println(aboutMe.retrieve("myFavoriteColor"));
    }
}
