/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nacht
 */
public class StringUtils {
    public static boolean included(String word, String searched) {
        boolean c = false;
        if (word.toUpperCase().contains(searched.trim().toUpperCase())) {
            c = true;
        }
        return c;
    }
}
