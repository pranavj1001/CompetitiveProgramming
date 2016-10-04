//The Question for this solution can be found at https://www.hackerrank.com/challenges/java-singleton
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{
    private Singleton() {}
    public String str;
    private static Singleton instance = new Singleton();
    public static Singleton getSingleInstance() { 
        return instance; 
    }
}

