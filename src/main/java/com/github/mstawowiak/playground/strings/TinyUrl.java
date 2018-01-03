package com.github.mstawowiak.playground.strings;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TinyUrl {

    private static final String BASE_URL = "http://tinyurl.com/";

    private static final int MAX_SIZE = 6;
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz0123456789";

    private final Map<String, String> cache = new ConcurrentHashMap<>();

    public String encode(String url) {
        String key = randomKey();

        while (cache.get(key) != null) {
            key = randomKey();
        }
        cache.put(key, url);

        return BASE_URL + key;
    }

    public String decode(String tinyUrl) {
        return cache.get(tinyUrl.replace(BASE_URL, ""));
    }

    private static String randomKey() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < MAX_SIZE; i++) {
            int index = (int) (Math.random() * ALPHABET.length());
            sb.append(ALPHABET.charAt(index));
        }
        return sb.toString();
    }

}
