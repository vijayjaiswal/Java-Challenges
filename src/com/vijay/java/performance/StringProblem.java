package com.vijay.java.performance;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class StringProblem
{
    public List<String> subString(String name)
    {
        List<String> list=new ArrayList<String>(); 
        for(int i=0;i<=name.length();i++)
        {
           for(int j=i+1;j<=name.length();j++)
           {
               String s=name.substring(i,j);
               list.add(s);
           }
        }
        return list;
    }
    public String commonString(List<String> list1,List<String> list2,List<String> list3)
    {
        list2.retainAll(list1);
        list3.retainAll(list2);

        Iterator it=list3.iterator();
        String s="";
        int length=0;
        System.out.println(list3);   // 1 1 2 3 1 2 1
        while(it.hasNext())    
        {
           if((s=it.next().toString()).length()>length)
           {
              length=s.length();
           }
        }
        return s;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String1:");
        String name1=sc.nextLine();
        System.out.println("Enter the String2:");
        String name2=sc.nextLine();
        System.out.println("Enter the String3:");
        String name3=sc.nextLine();
      //  String name1="salman";
      //  String name2="manmohan";
      //  String name3="rahman";

        StringProblem  sp=new StringProblem();

        List<String> list1=new ArrayList<String>();
        list1=sp.subString(name1);

        List<String> list2=new ArrayList<String>();
        list2=sp.subString(name2);


        List<String> list3=new ArrayList<String>();
        list3=sp.subString(name3);

        sp.commonString(list1,list2,list3);
        System.out.println(" "+sp.commonString(list1,list2,list3));
    }
}