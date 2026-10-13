class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}

class Linkedlist{
    Node head;
    Node tail;

    public void insertAtTail(int val){
        Node n = new Node(val);

        if(head == null){
            head = n;
            tail = n;
        }else{
            tail.next = n;
            tail = tail.next;
        }
    }
}

class Solution {
    public int findTheWinner(int n, int k) {

        Linkedlist l = new Linkedlist();

        for(int i=1; i<=n; i++){
            l.insertAtTail(i);
        }

        if(k==1){
            return l.tail.data;
        }

        l.tail.next = l.head;

        Node curr = l.head;

        while(curr.next!=curr){
            for(int i=1; i<=k-2; i++){
                curr = curr.next;
            }
            curr.next = curr.next.next;
            curr = curr.next;
        }

        return curr.data;
        
    }
}