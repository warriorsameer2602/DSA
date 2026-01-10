public class LinkedList{
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

    public void add(int index,int data){
        if(index==0){
            addFirst(data);
            return;
        }
        node newnode=new node(data);
        size++;
        node temp=head;
        int i=0;
        while(i<index-1){//Finding the previous location
            temp=temp.next;
            i++;
        }

        //i=index-1 i.e. we reached the previous index
        newnode.next=temp.next;// As earlier temp is pointing to next node of it because as of now no insertion is happening
        temp.next=newnode;
    }

    public int removeFirst(){
        if(size==0){// LL has no node delete.
            System.out.println("LL i empty");
        }
        else if(size==1){//LL has exactlty one one means head and tail is pointing to same node and when we delete that one node we get null
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }

        int val=head.data;//Saving the value of first node i.e.head node in "val" variable
        head=head.next;//Now head is pointing to next node i.e new head is the head poitning to next node in without deletion case
        size--;
        return val;// Returning the data of deleted node;
    }

    public int removeLast(){
if(size==0){
    System.out.println("LL is empty");
    return Integer.MIN_VALUE;
}
else if(size==1){
    int val=head.data;
    head=tail=null;
    size=0;
    return val;
}
node prev=head;
for(int i=0;i<size-2;i++){
    prev=prev.next;
}
int val=prev.next.data;//tail.data;
prev.next=null;
tail=prev;
size--;
return val;
}

  void findKey(int key){
 if(head == null){
    System.out.println("LL is empty");
 }
 node temp= head;
 int i=0;
 int s=0;
 while(temp!= null){
if(temp.data == key){
System.out.println("Key is found at index: " + i + "\n");
s++;

}
i++;
temp = temp.next;
 }
System.out.println(key + " occurs " + s + " times in the linked list" + "\n");

 if(s==0){
    System.out.println("Key element is not find in any index in the linked list. ");
    
 }

  }

  void recursion_findKey(node head, int key){
if(head == null){
    System.out.println("LL is empty");
    return;
}
int i=0;
int s=0;

if( head.data == key){
    System.out.println("Key element is found at index: " +i + "\n" );
    s++;
}
i++;
System.out.println(key + " element occurs " + s + " times." + "\n");
recursion_findKey(head.next, key);
//System.out.println(key + " element occurs " + s + " times." + "\n");
 


  }

    



    public static void main(String[] args) {
        LinkedList ll= new LinkedList();// creation of "ll" object using "linked list" class

        ll.addFirst(4);
        
        ll.addFirst(3);

        ll.addFirst(2);
        
        ll.addFirst(1);
        ll.addFirst(3);
        ll.print();
    //     System.out.println("After deleting first node: ");
    //    ll.removeLast();
    //    ll.print();
    //ll.findKey(3);
      ll.recursion_findKey(head, 3);  
        

        
    }
}