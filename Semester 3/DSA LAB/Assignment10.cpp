#include <bits/stdc++.h>
using namespace std;

class FileHandling
{
public:
    string name, Address, div;
    int rollno;

    void createDatabase() // function to write data in file
    {
        ofstream fout;
        fout.open("Student.txt", ios::app);
        cout << "\nStudent.txt file is created successfully." << endl;
        bool flag = false;
        do
        {
            cout << "\nEnter your name: ";
            cin >> name;
            cout << "Enter your address: ";
            cin >> Address;
            cout << "Enter your division: ";
            cin >> div;
            cout << "Enter your rollno: ";
            cin >> rollno;

            fout << name << "\t\t" << rollno << "\t\t" << div << "\t\t" << Address << endl;
            cout << "\nStudent records are added sucessfully.";
            cout << "\nDo you want to add more data? (y/n): ";
            char ch;
            cin >> ch;
            if (ch == 'y')
            {
                flag = true;
                cout << "\n";
            }
            else
            {
                flag = false;
                break;
            }

        } while (flag);
        fout.close();
    }

    void displayData()
    {
        string str;
        ifstream fin("Student.txt");
        cout << "\t---Student Records---" << endl;

        while (getline(fin, str))
        {
            cout << str << endl;
        }
        fin.close();
        cout << "\n";
    }

   

    void searchRecords()
    {
        string line;
        int key;
        ifstream obj("Student.txt", ios::in);
        cout << "Enter roll to search: ";
        cin >> key;
        if (obj.is_open())
        {
            int j = 0;
            while (getline(obj, line))
            {
                int i = 0;
                string arr[4];
                stringstream input(line);
                while (input.good() && i < 4)
                {
                    input >> arr[i];
                    i++;
                }
                if (to_string(key) == arr[1])
                {
                    cout << "\nRecord found." << endl;
                    for (int k = 0; k < 4; k++)
                    {
                        cout << arr[k] << " ";
                    }
                }
                j++;
            }
            obj.close();
            cout << "\nReord not found.";
        }
    }''

    void deleteRecords()
    {
        string line;
        int key;
        bool flag = false;
        ifstream obj("Student.txt", ios::in);
        ofstream file("Stu.txt", ios::out);
        cout << "Enter roll to delete: ";
        cin >> key;
        if (obj.is_open())
        {
            while (getline(obj, line))
            {
                int i = 0;
                string arr[4];
                stringstream input(line);
                while (input.good() && i < 4)
                {
                    input >> arr[i];
                    i++;
                }
                if (to_string(key) != arr[1])
                {
                    file << line << endl;
                }
                else
                {
                    flag = true;
                }
            }
            if(!flag)
            {
                cout<<"\nRecord not found";
            }
            else
            {
                cout<<"\nRecord deleted successfully.";
            }
            obj.close();
            file.close();
            remove("Student.txt");
            rename("Stu.txt","Student.txt");
        }
    }

    int menu()
    {
        int choice;
        cout << "\n1.Add Records";
        cout << "\n2.Display Records";
        cout << "\n3.Remove Records";
        cout << "\n4.Search Records";
        cout << "\n----------------------";

        return choice;
    }
};

int main()
{
    FileHandling obj;
    int choice;

    do
    {
        obj.menu();
        cout << "\nEnter your choice: ";
        cin >> choice;

        switch (choice)
        {
        case 1:
            obj.createDatabase();
            break;
        case 2:
            obj.displayData();
            break;
        case 3:
            obj.deleteRecords();
            break;
        case 4:
            obj.searchRecords();
            break;
        default:
            break;
        }
    } while (choice < 5);

    return 0;
}