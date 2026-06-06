package Practice.LinkedList;

public class DoublyLinkedList<T>
{
    public static void main(String[] args)
    {
        DoublyLinkedList<Integer> obj1=new DoublyLinkedList<>();
        obj1.insertHead(10);
        obj1.display();
//        obj1.insertTail(20);
//        obj1.display();
//        obj1.insertHead(30);
//        obj1.display();
//        obj1.insertTail(50);
//        obj1.display();
        obj1.insertNode(40,2);
        obj1.display();
    }
    DoublyNode<T> head;
    int size;
    DoublyLinkedList()
    {
        head=null;
         size=0;
    }

    public void insertHead(T data)
    {
        DoublyNode<T> newNode=new DoublyNode<>(data);

        if(head==null)
        {
            head=newNode;
            System.out.println("Inserted a node at head successfully");
            size++;
            return;
        }
        head.prev=newNode;
        newNode.next=head;
        head=newNode;
        System.out.println("Inserted a node at head successfully");
        size++;

    }
    
    public void insertTail(T data)
    {
        DoublyNode<T> newNode=new DoublyNode<>(data);

        DoublyNode<T> temp=head;
        if(temp==null)
        {
            head=newNode;
            size++;
            System.out.println("Inserted a node at tail successfully");
            return;
        }
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
        size++;
        System.out.println("Inserted a node at tail successfully");
    }

    public void insertNode(T data,int position)
    {
        DoublyNode<T> newNode=new DoublyNode<>(data);

        if(position>size+1 || position<=0)
        {
            System.out.println("Invalid Position");
            return;
        }
        if(position==1)
        {
            insertHead(data);
            return;
        }
        if(position==size+1)
        {
            insertTail(data);
            return;
        }

        DoublyNode<T> temp=head;
        DoublyNode<T> prevTemp=null;

        int count=1;
        while(count<position)
        {
            prevTemp=temp;
            temp=temp.next;
            count++;
        }
        newNode.next=temp;
        temp.prev=newNode;
        newNode.prev=prevTemp;
        prevTemp.next=newNode;
        size++;
        System.out.println("Insterted "+data+" at "+position);

    }

    public void display()
    {
        DoublyNode<T> temp=head;

        while(temp!=null)
        {
            System.out.println("Node value is "+temp.data);
            temp=temp.next;
        }

    }
}
class DoublyNode<T>
{
    T data;
    DoublyNode<T> next;
    DoublyNode<T> prev;

    DoublyNode()
    {
        this.data=null;
    }
    DoublyNode(T data)
    {
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
