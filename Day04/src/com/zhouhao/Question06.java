package com.zhouhao;

public class Question06 {
    public static void main(String[] args) {
        System.out.println(test("thequickbrownfoxjumpsoverthelazydog"));
    }
    public static boolean test(String s){
        String regex  = ".*\\d.*[a-z]|.*[a-z].*\\d";
        return s.matches(regex);
    }
}
