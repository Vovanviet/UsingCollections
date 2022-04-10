package com.collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListUsing {
    private static final String[] lyric={"you","say","it","best","when","you","say","nothing","at","all"};

    public static void main(String[] args) {
//        List words=new ArrayList<>();
        List words=new LinkedList();


        for (String w:lyric)
            words.add(w);
        for (Object o:words)
            System.out.print(o+" ");
        System.out.println("Contains [You]?:"+words.contains("you"));
        System.out.println("Where's the last [say]?:"+words.lastIndexOf("say"));
        Collections.sort(words);
//        words.forEach(t->{
//            System.out.println(t);
//        });
        for (Object o:words
             ) {
            System.out.print(o+" ");
        }
    }
}
