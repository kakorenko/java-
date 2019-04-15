package com.company;



public class MyArrayList {

    private Node head;

    public  void add(int value){
        if (head==null) {
            head = new Node();
            head.value = value;
        }
        else {
            Node p = head;
            while (p.next != null) {
                p = p.next;
            }
            p.next=new Node();
            p.next.value=value;
        }
    }

    public void print(){
       Node t=head;
        while (t!=null){
            System.out.println(t.value);
            t=t.next;
        }
    }

    public int get(int index){
        Node t=head;
        while (index>0){
            t=t.next;
            index--;
        }
        return t.value;
    }
    public void remove(int index){
        if (index==0){
            head=head.next;
        }
        else {Node t=head;
        while (index>1){
            t=t.next;
            index--;
        }
        t.next=t.next.next;
    }
    }


    }




