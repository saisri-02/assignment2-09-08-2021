import java.util.*;
class Binarysearchnonrec
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter array size : ");
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("Enter searching element : ");
int key=sc.nextInt();
int res=binary(arr,key);
if(res==-1)
System.out.println(key+" Not Found" );
else
System.out.println(res+" is Found");
}
static int binary(int arr[],int key)
{
int low=0;  
int high=n-1; 
while(low<=high)
{
int mid=(low+high)/2;
if(key==arr[mid])
return arr[mid];
else
{
if(key<arr[mid])
high=mid-1;
else
low=mid+1;
}
}
return -1;
}
}


output1:
Enter array size : 
5
12 34 56 78 90
Enter searching element : 
24
24 Not Found

output2:
Enter array size : 
5
23 12 45 68 79 
Enter searching element : 
45
45 is Found