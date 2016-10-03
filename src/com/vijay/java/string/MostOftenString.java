package com.vijay.java.string;

import java.util.HashMap;
import java.util.Scanner;


public class MostOftenString {
	String charSize[]=new String[3];
	HashMap result=new HashMap<String, Integer>();
	 public static void main(String args[])
	    {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the String of Length (N):");
	        String stringN=sc.nextLine();
	        System.out.println("Enter three Space Seprated integer (K L M):");
	        String stringKLM=sc.nextLine();
	        System.out.println("Enter the String:");
	        String stringEntered=sc.nextLine();
	        
	        System.out.println("You have enetred following: \nstringN="+stringN);
	        System.out.println("stringKLM="+stringKLM);
	        System.out.println("stringEntered="+stringEntered);
	        
	        MostOftenString mos=new MostOftenString();
	        mos.intiCharSize(stringKLM);
	        mos.showResult();
	    }
	 
	 private void compute(){
		 //TODO
	 }
	 private void showResult(){
		 for (int i = 0; i < charSize.length; i++) {
			System.out.println(charSize[i]);
		}
	 }
	 private void intiCharSize(String stringKLM){
		 if(stringKLM!=null){
			 this.charSize=stringKLM.split(" ");
		 }
		 else{
			 System.out.println("Invalid input (KLM)!");
		 }
	 }
	 
}
