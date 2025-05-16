package org.example;

import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        String str = "aaaba";
        String pattrn = "aaaab";
        String con = str + str;
        boolean ans = pattrn.length()==str.length() ? con.contains(pattrn) : false;
        int index;
    }


}
