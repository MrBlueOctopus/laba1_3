package com.company;

public class Main {

    public static void main(String[] args) {
	System.out.println("Гармонический ряд:");
	double sum=0;
	for (int i=1; i<=10; ++i){
	    System.out.print((float) 1/i + " ");
	    sum+=(float)1/i;
    }
        System.out.println();
        System.out.println("Сумма гармонического ряда:");
        System.out.print((float)sum);
    }
}
