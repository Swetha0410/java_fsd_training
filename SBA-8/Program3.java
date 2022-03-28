//3.program to take input two arrays and store the dissimilar elements into a resultant array.
//sort the resultant array in a descending order using bubble sort.
//dissimilar elements= the elements not occurring in both the arrays.(unique elements)

package SBA8;
import java.util.*;

class DissimilarSort
{
    void bubbleSort(int[] arr3)
    {
        int n=arr3.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr3[j]>arr3[j+1])
                {
                    int temp=arr3[j];
                    arr3[j]=arr3[j+1];
                    arr3[j+1]=temp;
                }
            }
        }
    }
    void printArray(int arr3[])
    {
        int n=arr3.length;
        for(int i=0;i<n;++i)
        {
        System.out.print(arr3[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        System.out.println("Enter the Size of Array : ");
        Scanner sc=new Scanner(System.in);
        int size = sc.nextInt();
        int arr1[]=new int[size];
        int arr2[]=new int[size];
       
        System.out.println("Enter the elements of Array 1");
        for(int i=0;i<size;i++)
        {
            arr1[i]=sc.nextInt();
        }
        
        System.out.println("Enter the elements of Array 2");
        for(int i=0;i<size;i++)
        {
            arr2[i]=sc.nextInt();
        }
        
         int arr3[]=new int[size];
        System.out.println("Dissimilar Elements is: ");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(arr1[i] != arr2[j])
                {
                    arr3[i]=arr1[i];
                    System.out.println(arr3[i]);
                }
            }
        }
        //Sorting//
        DissimilarSort ob=new DissimilarSort();
        ob.bubbleSort(arr3);
        System.out.println("Sorted Array");
        ob.printArray(arr3);
        
    }
}
