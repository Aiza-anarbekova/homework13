package com.compan;

public class Class {
  private  int number;
  private  String word;
  private  int[] array;

       Class(int number, String name, int[] array){
           this.number=number;
           this.word=name;
           this.array=array;
       }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
    String getName(){
           return word;
    }
    int[] getArray(){
           return array;
    }


}
