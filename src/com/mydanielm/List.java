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

    public void display()
    {
        if(count==0)
        {
            System.out.print("Список пуст!");
            return;
        }
        Node current = head;
        while (current != null)
        {
            System.out.print(current.getInfo()+ " ");
            current = current.getNext();
        }

    }

}
