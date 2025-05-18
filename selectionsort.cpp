  #include <bits/stdc++.h>
using namespace std;
void selectionSort(int a[], int n)
{
    for (int i = 0; i<n - 1; i++)
    {
        int minIn = i;
        for (int j = i + 1; j<n; j++)
        {
            if (a[j] < a[minIn])
                minIn = j;
        }
        if (minIn != i) {
            int temp = a[i];
            a[i] = a[minIn];
            a[minIn] = temp;
        }
    }
}
int main() {
    int n;
    cout << "Enter number of elements: "<<endl;
    cin >> n;

    int a[n];
    cout << "Enter " << n << " elements:"<<endl;
    for (int i = 0; i<n; i++) {
        cin >> a[i];
    }

    selectionSort(a,n);

    cout << "Sorted array: ";
    for (int i = 0; i < n; i++)
        cout << a[i] << " ";
    cout << endl;

    return 0;
}
