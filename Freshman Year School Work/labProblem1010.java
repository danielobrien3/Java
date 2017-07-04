/**
   * file: labProblem1010.java
   * author: Daniel O'Brien
   * course: CMPT 220
   * assignment: Lab 7
   * due date: April 19th, 2017
   * version: 1.3
   * 
   * This file contains the declaration of the 
   * labProblem1010 abstract data type.
   */


class Queue{
  public int[] elements;
  public int size = 8;

  public Queue(){
    size = 8;
    elements = new int[size]; 
  }

  public void enqueue(int v){
    if(size>= elements.length){
      int[] array = new int[size*2];
      System.arraycopy(elements, 0, array, 0, size);
      elements = array;
    }
    size= size*2;
    elements[v] = v;
  }

  public int dequeue(){
    int result = elements[0];
    size--;
    for(int i= 0; i<size; i++){
      elements[i] = elements[i+1];
    }
    return result;
  }

  public boolean empty(){
    if(size == 0){
      return true;
    }
    else
      return false;
  }

  public int getSize(){
    return size;
  }
}



public class labProblem1010 {
  
  public static void main(String[] args) {
    int result = 0;

    Queue queueOne = new Queue();

    for(int i = 0; i<20; i++){
      queueOne.enqueue(i);
    }

    for(int k = 0; k<20; k++){
      result = queueOne.dequeue();
      System.out.print(result+ " ");
    }

    
  }

}