public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList(){
        head=null;
    }
    public void add(int data){
        Node element =new Node(data);
        if(head==null) {
            head = element;
            return;
        }
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=element;
    }
    public void display(){
        Node current=head;
        while(current!=null){
            System.out.println(current.data+"->");
            current=current.next;

        }
        System.out.println("Null");

    }
    public Node findMiddle(){
        int length=0;
        Node temp=head;
        while(temp!=null) {
            length++;
            temp = temp.next;
        }
        temp=head;
        for(int i=0; i<length/2;i++){
            temp=temp.next

        }
          return slow;

    }
    public Node getHead(){
        return head;
    }
}
