package fr;
class stack{
     class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
Node top;
int size;
stack(){
     top=null;
     size=0;

}
public void push(int data){
    Node newnode=new Node(data);
    newnode.next=top;
    top = newnode;
    size++;
}
public int pop(){
    Node temp=top;
    top=top.next;
    return temp.data;
}
public void display(){
    Node temp=top;
    while(temp!=null){
        System.out.print(temp.data+"-> ");
        temp=temp.next;
    }
}

}

public class test{
    public static void main(String args[]){
        stack stk=new stack();
        stk.push(10);        
        stk.push(20);
        stk.push(30);
        stk.pop(); 
        stk.display();       


    }
}