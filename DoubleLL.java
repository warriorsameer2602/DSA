public class DoubleLL {
    public class node{
        int data;
        node next;
        node prev;

        node(int data){
            this.data = data;
            this.next = null;
            this.next = null;
        }
    }

    public static node head;
    public static node tail;
    public static int size;

    public void  addFirst(int data){
        node newNode = new node(data);
        size++;
        if(head ==null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;


    }

    public int removeFirst(){
        if(head == null){
            System.out.println("DoubleLL is empty");
            return Integer.MIN_VALUE;
        }

        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    public void print(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        System.out.print(dll.size);
    }
}
