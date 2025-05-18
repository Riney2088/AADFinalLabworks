#include<bits/stdc++.h>
using namespace std;

 void takeinput(int a[],int s)
 {
    for(int i=0;i<s;i++)
    {
        cin>>a[i];
    }
 }
 void insertionsort(int a[],int s)
 {
     for(int j=1;j<s;j++)
    { int key=a[j];
        int i=j-1;
        while(i>=0&&a[i]>key)
        {
            a[i+1]=a[i];
            i=i-1;

        }
        a[i+1]=key;
    }
 }
 void printarray(int a[],int s)
 {
     for(int i=0;i<s;i++)
    {
        cout<<a[i]<<" ";
    }
    cout<<endl;
 }
int main()
{
    int s;
    cout<<"Enter the size of the array: "<<endl;
    cin>>s;
    int a[s+1];

    cout<<"Enter the array elements: "<<endl;
    takeinput(a,s);

    cout<<"Before sorting the array: "<<endl;
    printarray(a,s);

    insertionsort(a,s);

    cout<<"After performing insertion sort,The sorted array: "<<endl;
    printarray(a,s);
    return 0;
}
