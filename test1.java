public class test1 {
    public static class node{
        int data;
        node next;
    
    public node(int data){
        this.data=data;
        this.next=null;
    }
    
    }


    public static node head;
    public static node tail;

    public void addFirst(int data){
        node newnode=new node( data);
if(head==null){
    head=tail=newnode;
    return;
}
newnode.next=head;
head=newnode;
    }

    public void printLL(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
          temp= temp.next;

        }
    System.out.print("null");


    }

    public void addLast(int data){
        node newnode=new node( data);
if(head==null){
    head=tail=null;
    return;
}
tail.next=newnode;
tail=newnode;
    }




    public static void main(String[] args) {
        test1 ll= new test1();
        ll.addFirst(9);
ll.addFirst(11);
ll.addFirst(12);
ll.printLL();
System.out.println();
System.out.println(head);



    }
    
    
}
