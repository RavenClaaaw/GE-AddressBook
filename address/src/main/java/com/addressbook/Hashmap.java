package com.addressbook;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> hmap = new HashMap<>();
        hmap.put("Roop", 22);
        hmap.put("Dhvani", 21);
        System.out.println(hmap.values());
    }
}
