package com.compan;

public class Main {

    public static void main(String[] args) {
        Class clas=new Class(13,"datka  ",new int[]{12,56});
        System.out.print(clas.getNumber()+ " "+clas.getName());
        for (int i = 0; i <clas.getArray().length; i++) {
            System.out.print(clas.getArray()[i]+ " ");

        }






    }
}
