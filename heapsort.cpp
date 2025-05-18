#include<bits/stdc++.h>
using namespace std;
void heapify(int H[],int n,int i,bool isMaxHeap)
{
    int la=i;
    int l=2*i+1;
    int r=2*i+2;
    if(isMaxHeap)
    {
        if(l<n&&H[l]>H[la])
            la=l;
        if(r<n&&H[r]>H[la])
            la=r;
    }
    else
    {
        if(l<n&&H[l]<H[la])
            la=l;
        if(r<n&&H[r]<H[la])
            la=r;
    }
    if(la!=i)
    {
        swap(H[i],H[la]);
        heapify(H,n,la,isMaxHeap);
    }
}
int main()
{
    int n;
    cin>>n;
    int H[n];
    for(int i=0;i<n;i++)
    {
        cin>>H[i];
    }
    int p=(n/2)-1;

    for(int i=p;i>=0;i--)
    {
        heapify(H,n,i,true);
    }
    for(int i=0;i<n;i++)
    {
        cout<<H[i]<<" ";
    }
    cout<<endl;

    for(int i=p;i>=0;i--)
    {
        heapify(H,n,i,false);
    }
    for(int i=0;i<n;i++)
    {
        cout<<H[i]<<" ";
    }
    cout<<endl;
}
