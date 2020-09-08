package com.mydanielm;

public class List {

    private int count;
    private Node head;

    List()
    {
        count = 0;
        head = null;
    }

    public void addItem(int info)
    {
        count++;
        if(head == null)
        {
            head = new Node(info);
        }
        else {
            Node current = head;
            while (current.getNext()!=null)
                current = current.getNext();
            current.setNext(new Node(info));
        }

    }
    //Метод удаления элемента по значению
    public void deleteItem(int info)
    {
        if(count == 0) return;
        count--;
        Node current = head;
        while (current.getNext()!=null && current.getNext().getInfo() != info)
            current=current.getNext();
        if(current.getNext() == null) System.out.println("В списке нет такого элемента!");
        else current.setNext(current.getNext().getNext());
    }
    public void display()
    {
        if(count==0)
        {
            System.out.println("Список пуст!");
            return;
        }
        Node current = head;
        while (current != null)
        {
            System.out.print(current.getInfo()+ " ");
            current = current.getNext();
        }
        System.out.println();
    }

}
