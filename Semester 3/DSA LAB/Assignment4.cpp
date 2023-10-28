#include <iostream>
using namespace std;

class Node // Data Structure to store Binary Tree node
{
public:
    char data;
    Node *left;
    Node *right;
    Node *next;

    Node(char ch) // Constructor of class Node
    {
        data = ch;
        left = NULL;
        right = NULL;
        next = NULL;
    }
};

class stack // Using Data Structure stack
{
public:
    Node *top;

    stack() // Contructor of class stack
    {
        top = NULL;
    }

    void push(Node *x) // Function to push Node element
    {
        x->next = top;
        top = x;
    }

    Node *pop() // Function to remove element
    {
        Node *temp;
        temp = top;
        top = top->next;
        return temp;
    }

    bool IsEmpty()
    {
        return (top == NULL);
    }
};

class ExpTree
{
public:
    stack s1;
    stack s2;
    stack s3;
    string postfix, prefix;

    void getPostfix() // Taking postfix input
    {
        cout << "\nEnter Postfix Expression: ";
        cin >> postfix;
    }

    Node *createtreePostfix() // Function for creating Expression Tree using postfix
    {
        Node *z;
        Node *x;
        Node *y;
        for (int i = 0; i < postfix.length(); i++)
        {
            if (isalpha(postfix[i]))
            {
                z = new Node(postfix[i]);
                s1.push(z);
            }
            else
            {
                y = s1.pop();
                x = s1.pop();
                z = new Node(postfix[i]);
                z->left = x;
                z->right = y;
                s1.push(z);
            }
        }
        return (s1.pop());
    }

    void getPrefix() // Taking prefix input
    {
        cout << "\nEnter Prefix Expression: ";
        cin >> prefix;
    }

    Node *createtreePrefix() // Function for creating Expression Tree using prefix
    {
        Node *z;
        Node *x;
        Node *y;
        for (int i = prefix.length() - 1; i >= 0; i--)
        {
            if (isalpha(prefix[i]))
            {
                z = new Node(prefix[i]);
                s2.push(z);
            }
            else
            {
                x = s2.pop();
                y = s2.pop();
                z = new Node(prefix[i]);
                z->left = x;
                z->right = y;
                s2.push(z);
            }
        }
        return (s2.pop());
    }

    void inorder(Node *root) // Function to convert expression into inorder
    {
        if (root != NULL)
        {
            inorder(root->left);
            cout << root->data;
            inorder(root->right);
        }
    }

    void preorder(Node *root) // Function to convert expression into preorder
    {
        if (root != NULL)
        {
            cout << root->data;
            preorder(root->left);
            preorder(root->right);
        }
    }

    void postorder(Node *root) // Function to convert expression into postorder
    {
        if (root != NULL)
        {
            postorder(root->left);
            postorder(root->right);
            cout << root->data;
        }
    }

    void nonrecursiveinorder(Node *root)
    {
        stack s;
        Node *curr = root;

        while (!s.IsEmpty() || curr != NULL)
        {
            if (curr != NULL)
            {
                s.push(curr);
                curr = curr->left;
            }
            else
            {
                curr = s.pop();
                cout << curr->data << " ";
                curr = curr->right;
            }
        }
    }

    void nonrecursivepreorder(Node *root)
    {
        stack s1;
        Node *curr;
        if (root == NULL)
            return;
        s1.push(root);

        while (!s1.IsEmpty())
        {
            curr = s1.pop();
            cout << curr->data << " ";
            if (curr->right)
            {
                s1.push(curr->right);
            }
            if (curr->left)
            {
                s1.push(curr->left);
            }
        }
    }

    void nonrecursivepostorder(Node *root)
    {
        stack s;
        s.push(root);
        stack s1;
        Node *curr;
        while (!s.IsEmpty())
        {
            curr = s.pop();
            s1.push(curr);
            if (curr->left)
            {
                s.push(curr->left);
            }
            if (curr->right)
            {
                s.push(curr->right);
            }
        }
        while (!s1.IsEmpty())
        {
            curr = s1.pop();
            cout <<curr->data<< " ";
            //curr = curr->right;
        }
    }
};

int main() // Main function
{
    ExpTree obj; // Instance of class
    int choice, choice1;
    char data;

    do
    {
        cout << "\n\n";
        cout << "\n-------WAYS OF TRAVERSAL--------";
        cout << "\n1.Using Recursion";
        cout << "\n2.Without using Recursion";
        cout << "\n3.Exit from traversal methods";
        cout << "\nEnter your choice:";
        cin >> choice1;

        if (choice1 == 1)
        {
            obj.getPostfix();
            obj.getPrefix();
            do
            {
                cout << "\n\n";
                cout << "\n-------RECURSIVE OPERATIONS--------";
                cout << "\n-------------------------";
                cout << "\n1.Inorder for Postfix";
                cout << "\n2.Preorder for Postfix";
                cout << "\n3.Inorder for Prefix";
                cout << "\n4.Postorder for Prefix";
                cout << "\n5.Exit from operations";
                cout << "\n-------------------------";
                cout << "\nEnter your choice: ";
                cin >> choice;

                switch (choice)
                {
                case 1:
                    cout << "\nInorder using Postfix Expression: ";
                    obj.inorder(obj.createtreePostfix());
                    break;
                case 2:
                    cout << "\nPreorder using Postfix Expression: ";
                    obj.preorder(obj.createtreePostfix());
                    break;
                case 3:
                    cout << "\nInorder using Prefix Expression: ";
                    obj.inorder(obj.createtreePrefix());
                    break;
                case 4:
                    cout << "\nPostorder using Prefix Expression: ";
                    obj.postorder(obj.createtreePrefix());
                    break;
                }
            } while (choice < 5);
        }

        else if (choice1 == 2)
        {
            int ch;
            obj.getPostfix();
            obj.getPrefix();
            do
            {
                cout << "\n\n";
                cout << "\n-------NON-RECURSIVE OPERATIONS--------";
                cout << "\n1.Inorder for Postfix";
                cout << "\n2.Preorder for Postfix";
                cout << "\n3.Inorder for Prefix";
                cout << "\n4.Postorder for Prefix";
                cout << "\n5.Exit from operations";
                cout << "\n-------------------------";
                cout << "\nEnter your choice: ";
                cin >> ch;

                switch (ch)
                {
                case 1:
                    cout << "\nInorder using Postfix Expression: ";
                    obj.nonrecursiveinorder(obj.createtreePostfix());
                    break;
                case 2:
                    cout << "\nPreorder using Postfix Expression: ";
                    obj.nonrecursivepreorder(obj.createtreePostfix());
                    break;
                case 3:
                    cout << "\nInorder using Prefix Expression: ";
                    obj.nonrecursiveinorder(obj.createtreePrefix());
                    break;
                case 4:
                    cout << "\nPostorder using Prefix Expression: ";
                    obj.nonrecursivepostorder(obj.createtreePrefix());
                    break;
                }

            } while (ch < 5);
        }
        else
        {
            break;
        }
    } while (choice1 < 3);

    return 0;
}