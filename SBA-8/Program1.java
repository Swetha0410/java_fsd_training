//1. program to take input of two integer arrays from the user and to find the sum of both the arrays.
//Sort the elements of the resultant array in ascending order using selection sort.
package SBA8;

import java.io.*;
import java.util.Scanner;

public class Program1
{
    public void sort(int[] sum)
    {
        int n=sum.length;
        for(int i=0; i<n-1; i++)
        {
            int min=i;
            for(int j=i+1; j<n; j++)
            {
                if(sum[j]<sum[min])
                {
                    min=j;
                }
                int temp=sum[min];
                sum[min]=sum[i];
                sum[i]=temp;
            }
        }
    }

    void printArray(int sum[])
    {
        int n=sum.length;
        for(int i=0; i<n; ++i)
        {
            System.out.print(sum[i]+" ");
        }
        System.out.println();
    }

public static void main(String[] args)
    {
        int i;
        System.out.print("Enter the size of array");
        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr1=new int[size];
        int[] arr2=new int[size];
        int[] sum=new int[size];
        System.out.println("Enter the array one elements:");
        for(i=0; i<size; i++)
        {
                arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the array two elements");
        for(i=0; i<size; i++)
        {
                arr2[i]=sc.nextInt();
        }
        for(i=0; i<size; i++)
        {
                sum[i]= arr1[i]+arr2[i];
        }
        System.out.println("The sum of arrays one and two is:");
        for(i=0; i<size; i++)
        {
                System.out.print(sum[i]+ " ");
         }       
            System.out.println("");

            //printing sorted sum array

        Program1 ob=new Program1();
        ob.sort(sum);
        System.out.println("Sorted Array");
        ob.printArray(sum);
    }
}
