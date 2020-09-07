package com.mydanielm;

public class Node {
    //Инфо поле
    private int info;
    public int getInfo()
    {
        return this.info;
    }
    public void setInfo(int info) {this.info = info; }
    //Ссылка на следующий элемент
    private Node next;
    public Node getNext()
    {
        return this.next;
    }
    public void setNext(Node next)
    {
        this.next = next;
    }
    //Конструкторы
    Node(){}
    Node(int val)
    {
        this.info = val;
        this.next = null;
    }
    Node(int val, Node next)
    {
        this.info = val;
        this.next = next;
    }

    //Метод вывода инфополя
    public void display()
    {
        System.out.println("info: " + this.info);
    }


}
