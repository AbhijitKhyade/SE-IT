#include <iostream>
using namespace std;

class HeapSort
{
public:
    void heapifymax(int arr[], int n, int i)
    {
        // Initialise largest as root
        int largest = i;
        int l = (2 * i + 1);
        int r = (2 * i + 2);

        // If left child is larger than largest
        if (l < n && arr[l] > arr[largest])
        {
            largest = l;
        }

        // If right child is larger than largest
        if (r < n && arr[r] > arr[largest])
        {
            largest = r;
        }

        // If largest is not root
        if (largest != i)
        {
            swap(arr[i], arr[largest]);

            // recursively heapify the affected sub-tree
            heapifymax(arr, n, largest);
        }
    }
    void heapifymin(int arr[], int n, int i)
    {
        // Initialise largest as root
        int largest = i;
        int l = (2 * i + 1);
        int r = (2 * i + 2);

        // If left child is larger than largest
        if (l < n && arr[l] < arr[largest])
        {
            largest = l;
        }

        // If right child is larger than largest
        if (r < n && arr[r] < arr[largest])
        {
            largest = r;
        }

        // If largest is not root
        if (largest != i)
        {
            swap(arr[i], arr[largest]);

            // recursively heapify the affected sub-tree
            heapifymin(arr, n, largest);
        }
    }

    void heapSortMax(int arr[], int n)
    {
        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
        {
            heapifymax(arr, n, i);
        }

        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--)
        {
            // Move current root to end
            swap(arr[0], arr[i]);

            // call max heapify on the reduced heap
            heapifymax(arr, i, 0);
        }
    }

    void heapSortMin(int arr[], int n)
    {
        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
        {
            heapifymin(arr, n, i);
        }

        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--)
        {
            // Move current root to end
            swap(arr[0], arr[i]);

            // call max heapify on the reduced heap
            heapifymin(arr, i, 0);
        }
    }

    void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
        {
            cout << arr[i] << " ";
        }
    }
};

int main()
{
    HeapSort obj;
    int n;
    cout << "Enter size of array:- ";
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cout<<"Enter element "<<(i+1)<<":- ";
        cin >> arr[i];
    }
    int choice;
    do
    {
        cout << "\n1.Max heapsort\n2.Min heapsort\n3.Exit" << endl;
        cout << "Enter your choice: ";
        cin >> choice;
        switch (choice)
        {
        case 1:
            obj.heapSortMax(arr, n);
            cout << "sorted array: ";
            obj.printArray(arr, n);
            cout << endl;
            break;
        case 2:
            obj.heapSortMin(arr, n);
            cout << "sorted array: ";
            obj.printArray(arr, n);
            break;
        case 3:
            cout << "Exiting...";
            break;
        default:
            break;
        }
    } while (choice < 3);
}