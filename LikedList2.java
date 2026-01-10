public class LikedList2 {
    public static class node{// "node" class which is used to create nodes
        int data;
        node next;

public node(int data){// This is the constructor of node class and it's public
this.data = data;
this.next= null;
}



    }
    public static node head;//creation of "head" object using "node" class
    public static node tail;//cretaion of "tail" object using "node" class
    public static int size;// Java itself initialize it with 0;

    public void addFirst(int data){//Method of "Linked List" class which is used to add first element in linked list
        node newnode= new node(data);// cretion of "newnode" object with the help of "node" class
        size++;
        if(head==null){
            head=tail=newnode;
            return;
                }
                newnode.next=head;
                head= newnode;

    }

    public void addLast(int data){
        node newnode=new node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return; 
        }
        tail.next=newnode;
        tail=newnode;

    }
    public void print(){//O(N)
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("null");

    }

    public void addIndex(int index,int data){
        node newnode=new node(data);
        if(index==0){
            addFirst(data);
            size++;
            return;
        }
        node temp=head;
        int i=0;
        while(i < (index-1)){
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
        size++;

    }

    public static void main(String[] args) {
        LikedList2 ll=new LikedList2();// creation of "ll" object using "linked list" class

        ll.addFirst(4);
        
        ll.addFirst(3);

        ll.addFirst(2);
        
        ll.addFirst(1);
        ll.addFirst(3);
        ll.print();
        System.out.println(size);
        ll.addIndex(2,25);
        ll.print();
        System.out.println(size);
    //     System.out.println("After deleting first node: ");
    //    ll.removeLast();
    //    ll.print();
    //ll.findKey(3);
      
        

        
    }
}
