package fr.wildcodeschool.unittesting;

import java.util.LinkedHashSet;

public class StringUtils {
    private static final String ALL_VOWELS = "aeiouyAEIOUY";

    /**
     * Renvoie la chaine formée par les voyelles d'une chaine de caractères
     * @return Chaine avec uniquement des voyelles
     */
    public static String vowels(String candidate) {
        String vowels = "";
        char[] letters = candidate.toCharArray();
        for (int i = 1; i < candidate.length(); i++) {
            if (ALL_VOWELS.indexOf(letters[i]) >= 0) {
                vowels += letters[i];
            }
        }
        return vowels;
    }


    public static String UniqueWowels(String candidate) {
        LinkedHashSet<Character> uniqueWowels = new LinkedHashSet<>();
        char[] letters = candidate.toCharArray();
        String rep = "";

        for (int i = 1; i < candidate.length(); i++) {
            if (ALL_VOWELS.indexOf(letters[i]) >= 0) {
                uniqueWowels.add(letters[i]);
            }
        }

        for (Character wowel : uniqueWowels) {

             rep+= wowel.charValue();

        }
        return rep;
    }

}


