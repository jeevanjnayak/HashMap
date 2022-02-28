
public class MyLinkedList<K> {
    public INode head;
    public INode tail;

    public MyLinkedList() {
        this.head=null;
        this.tail=null;
    }

    public void append(INode myNode) {
        if (this.head==null){
            this.head=myNode;
        }
        if (this.tail==null){
            this.tail=myNode;
        } else {
            this.tail.setNext(myNode);
            this.tail=myNode;
        }
    }

    public INode pop () {
        INode tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }
    public boolean search(INode key) {
        INode tempNode = head;
        boolean found = false;
        while(tempNode.getNext() != null) {
            if(tempNode.getKey() == key.getKey()) {
                found = true;
            }
            tempNode = tempNode.getNext();
        }
        return found;
    }

    public void delete(INode deleteNode) {
        MyLinkedList linkedList = new MyLinkedList();
        INode tempNode = head;
        boolean inserted = false;
        while(tempNode.getNext() != null) {
            if(tempNode.getKey() == deleteNode.getKey()) {
                linkedList.pop();
            }
            tempNode = tempNode.getNext();
        }
    }

    public void printMyNodes(){
        StringBuffer myNodes=new StringBuffer("My Nodes :");
        INode tempNode=head;
        while (tempNode.getNext()!=null){
            myNodes.append(tempNode.getKey());
            if (!tempNode.equals(tail))myNodes.append("->");
            tempNode=tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }

}
