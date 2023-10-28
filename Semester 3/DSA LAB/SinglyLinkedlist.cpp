#include <iostream>
using namespace std;
    
class node
{
public:
    int data;
    node *next;

    node(int d)
    {
        data = d;
        next = NULL;
    }
};

class LinkedList
{
public:
    node *head;

    LinkedList()
    {
        head = NULL;
    }

    void display()
    {
        cout << "Linked List: ";
        node *p = head;
        if (p == NULL)
        {
            cout << "\nLinked list is empty.";
        }
        else
        {
            while (p != NULL)
            {
                cout << p->data << " ";
                p = p->next;
            }
        }
    }

    void insertAtBeginning()
    {
        int d;
        cout << "\nEnter element to insert at beginning of node: ";
        cin >> d;
        node *temp = new node(d);
        temp->next = head;
        head = temp; 
        display();
    }

    void insertAtEnd()
    {
        int d;
        cout << "\nEnter element to insert at end of node: ";
        cin >> d;
        node *temp = new node(d);
        node *p = head;
        if (head == NULL)
        {
            head = temp;
        }
        else
        {
            while (p->next != NULL)
            {
                p = p->next;
            }
            p->next = temp;
            temp->next = NULL;
        }
        display();
    }

    void insertAtMiddle()
    {
        int d, d1;
        cout << "\nEnter element to insert at middle: ";
        cin >> d;
        cout << "Enter element afterwhich you want to add node: ";
        cin >> d1;
        node *p = head;

        while (p != NULL)
        {
            if (p->data == d1)
            {
                node *temp = new node(d);
                temp->next = p->next;
                p->next = temp;
            }
            p = p->next;
        }
        display();
    }

    void deleteFirst()
    {
        node *temp = head;
        head = head->next;
        delete temp;
        cout << "\nLinked list after delete at front: " << endl;
        display();
    }

    void deleteAtEnd()
    {
        node *p = head;
        node *temp;
        while (p->next != NULL)
        {
            temp = p;
            p = p->next;
        }

        temp->next = NULL;
        delete p;
        cout << "\nLinked list after delete at end: " << endl;
        display();
    }

    void deleteAtMiddle()
    {
        int d;
        cout << "\nEnter any middle element to delete: ";
        cin >> d;
        node *p = head;
        node *temp;
        while (p != NULL)
        {
            temp = p;
            p = p->next;
        }
        temp->next = p->next;
        delete (p);
        cout << "\nLinked list after delete at middle: " << endl;
        display();
    }
};

int main()
{
    LinkedList obj;
    int choice;
    do
    {
        cout << "\n1.InsertAtFirst\n2.InsertAtEnd\n3.InsertAtMiddle\n4.DeleteAtFirst\n5.DeleteAtEnd\n6.Exit";
        cout << "\nEnter your choice: ";
        cin >> choice;

        switch (choice)
        {
        case 1:
            obj.insertAtBeginning();
            break;
        case 2:
            obj.insertAtEnd();
            break;
        case 3:
            obj.insertAtMiddle();
            break;
        case 4:
            obj.deleteFirst();
            break;
        case 5:
            obj.deleteAtEnd();
            break;
        case 6:
            cout << "\nExiting the Program!!";
            break;
        default:
            cout << "\nInvalid choice.";
        }
    } while (choice < 6);
}