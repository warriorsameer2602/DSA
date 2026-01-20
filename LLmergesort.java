public class LLmergesort {
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



    public node getMId(node head){
        node slow= head;
        node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public node merge(node head1,node head2){
        node mergedLL = new node(-1);
        node temp = mergedLL;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp =temp.next;
        }

        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }
    public node mergeSort(node head){
        if(head == null || head.next == null){
            return head;
        }

        //find mid
        node mid = getMId(head);

        //left and righ MS

        node rightHead = mid.next;
        mid.next = null; // LL break into two half
        node newLeft =mergeSort(head);
        node newRight = mergeSort(rightHead);

        //merge
         return merge(newLeft, newRight);




    }
    public static void main(String[] args) {
        LLmergesort ll = new LLmergesort();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);

        ll.print();
        ll.head = ll.mergeSort(ll.head);
        ll.print();
    }
}
