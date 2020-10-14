package com.queue;
/**
 * 描述： 简单队列的基本实现
 *  front 代表队列的第一个元素 初始化为-1
 *  rear 代表队列的最后一个元素 初始化为-1
 *
 *
 * */
public class ArrayQueueDemo {



}
class ArrayQueue{
   private int maxSize;
   private int front;
   private int rear;
   private int[] arr;

  public ArrayQueue(int size) {
    this.maxSize = size;
    this.arr=new int[this.maxSize];
    this.front=-1;
    this.rear=-1;
  }
}