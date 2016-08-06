package bubblesort;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tC=sc.nextInt();
        String a=sc.next();
        String b=sc.next();
            Set <Character> set=new HashSet<Character>();            
            for(Character g:a.toCharArray()){
                set.add(g);
            }
            int count=0;
            for(Character h:b.toCharArray()){
                if(set.contains(h)){
                    count=count+2;
                }               
            }           
               System.out.println(count);
    }}