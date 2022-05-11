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

    public void setWord(String word) {
        this.word = word;
    }

    public void setArray(int[] array) {
        this.array = array;
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
