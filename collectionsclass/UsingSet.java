package com.collectionsclass;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class UsingSet {
    private static final String[] lyric={"you","say","it","best","when","you","say","nothing","at","all"};

    public static void main(String[] args) {
//        Set words=new HashSet();
//        Set words=new LinkedHashSet();
        Set words=new TreeSet();
        for (String w:lyric
             ) {
            words.add(w);
        }
//        words.forEach(t->{
//            System.out.print(t+" ");
//        });
        for (Object o:words
             )
            System.out.print(o+" ");
        System.out.println("\n-------------------------");
        System.out.println("Contains [You]?:"+words.contains("you"));
        System.out.println("Contains [me]?:"+words.contains("me"));

    }
}
