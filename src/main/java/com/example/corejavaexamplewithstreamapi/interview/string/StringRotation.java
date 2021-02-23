package com.example.corejavaexamplewithstreamapi.interview.string;

public class StringRotation {


    static String leftrotate(String str, int d) {
        System.out.println(str.substring(d)); //exclude from start(beginIndex) d letter and return rest string
        System.out.println(str.substring(0, d));//return range of (beginIndex,endingIndex) string -1 index.

        return str.substring(d) + str.substring(0, d);
    }

    // function that rotates s towards right by d
    static String rightrotate(String str, int d) {
        return str.substring(str.length()-d)+str.substring(0,str.length()-d);
    }

}
