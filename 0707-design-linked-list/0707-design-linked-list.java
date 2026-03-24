class MyLinkedList {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;

        }
    }
   
    Node head;
    int size;

    public MyLinkedList() {
        head = null;
        size = 0;
        
    }
    
    public int get(int index) {
        if(index < 0|| index >= size){
            return -1;
        }
        Node temp = head;
        for(int i = 0; i<index; i++){
            temp = temp.next;
           

        }
         return temp.data;
            
      
        
    }
    
    public void addAtHead(int val) {
        Node newnode = new Node(val);
        newnode.next = head;
        head = newnode;
        size++;
        
    }
    
    public void addAtTail(int val) {
        if(head == null){
            head = new Node(val);
            size++;
            return;
        }
        Node temp = head;
        while(temp != null && temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(val);
        size++;
        
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 ||index > size) {
            return;
        }
        if( index == 0){
            addAtHead(val);
            return;
        } else if( index== size ){
            addAtTail(val);
            return;
        }else{
            Node temp = head;
            for(int i = 0; i <index-1; i++){
                temp= temp.next;
            }
           Node n = new Node(val);
           n.next = temp.next;
            temp.next = n;
            size++;

        }
        
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size){
            return;
        }else if( index == 0){
            head= head.next;
            size--;
            return;
        } 
        else {
            Node temp = head;
            for(int i = 0; i < index-1;i++){
                temp = temp.next;
            } 
            temp.next = temp.next.next;
            size--;
            
        }       
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */