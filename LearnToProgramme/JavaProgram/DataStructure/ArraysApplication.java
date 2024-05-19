import java.lang.*;
import java.util.Arrays;
import java.util.*;


public class ArraysApplication{
    public static void missingElementMethod1(int[] arr){
        int n=arr[arr.length-1];
        int s=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        int diff=s-sum;
        System.out.println("Missing Element is : "+diff);
    }

    public static void missingElementMethod2(int[] arr){
        int low=arr[0];
        int high=arr[arr.length-1];
        int diff=low-0;
        for(int i=0;i<arr.length;i++){
            if((arr[i]-i)!=diff){
                System.out.println("Missing element is : "+(i+diff));
            }
        }
    }
    
    public static void missingElementMethod3(int[] arr){
        int low=arr[0];
        int diff=low-0;
        for(int i=0;i<arr.length;i++){
            if((arr[i]-i)!=diff){
                while(diff<arr[i]-i){
                    System.out.println("Missing Element is : "+(i+diff));
                    diff++;
                }
            }
        }
    }

    public static int maxElem(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

    public static void missingElementMethod4(int[] arr){
        int max=maxElem(arr)+1;
        int[] HashTable=new int[max];
        System.out.println(Arrays.toString(HashTable));

        for(int i=0;i<arr.length;i++){
            HashTable[arr[i]]++;
        }
        System.out.println(Arrays.toString(HashTable));

        for(int j=1;j<HashTable.length;j++){
            if(HashTable[j]==0){
                System.out.println("Misisng Element are : "+j);
            }
        }
    }

    public static void duplicateElement(int[] arr){
        int lastDuplicate=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==arr[i] && arr[i-1]!=lastDuplicate){
                System.out.println("Duplicate Element : "+arr[i-1]);
                lastDuplicate=arr[i-1];
            }
        }
    }

    public static void countDuplicates(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                int j=i+1;
                while(arr[j]==arr[i]) j++;
                System.out.println(arr[i]+" is appearing "+(j-i)+ " times . ");
                i=j-1;
            }
        }
    }
    
    public static void countFindDuplicateElement(int[] arr){
        int max=maxElem(arr)+1;
        int[] ht=new int[max];
        for(int i=0;i<arr.length;i++){
            ht[arr[i]]++;
        }
        for(int j=0;j<ht.length;j++){
            if(ht[j]>1){
                System.out.println(j+ " is a duplicate element "+ht[j]+" times appear in the array .");
            }
        }
    }

    public static void countFindDuplicateInUnsortedArrays(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int count=1;
            if(arr[i]!=-1){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        count++;
                        arr[j]=-1;
                    }
                }
            }
            if(count>1){
                System.out.println(arr[i]+" is a repeated elements and it is appear "+count +" times .");
            }
        }
    }

    public static void FindDuplicateInUnsortedArrays(int[] arr){
        int max=maxElem(arr)+1;
        int[] ht=new int[max];
        for(int i=0;i<arr.length;i++){
            ht[arr[i]]++;
        }
        for(int j=0;j<ht.length;j++){

            if(ht[j]>1){
                System.out.println(j+" is a repeated elements and it is appear "+ht[j] +" times .");
            }        
        }
    }

    public static void PairWithSumKUnsortedArrayMethod1(int[] arr,int k){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==k){
                    System.out.println(arr[i]+" and "+arr[j]+" has "+" sum "+k);
                }
            }
        }
    }

    public static void PairWithSumKUnsortedArrayMethod2(int[] arr,int k){
        int max=maxElem(arr)+1;
        int[] ht=new int[max];
        for(int i=0;i<arr.length;i++){
            if((k-arr[i]>0) && (ht[k-arr[i]]!=0)){
                System.out.println(arr[i]+" and "+(k-arr[i])+" has "+" sum "+k);
            }
            ht[arr[i]]++;
        }
    }

    public static void PairWithSumKSortedArray(int[] arr,int k){
        int i=0;
        int j=arr.length-1;
        //for(i=0,j=arr.length-1;i<j;)
        while(i<j){
            if(arr[i]+arr[j]==k){
                System.out.println(arr[i]+" and "+arr[j]+" has "+" sum "+k);
                i++;
                j--;
            }
            else if(arr[i]+arr[j]<k){
                i++;
            }
            else{
                j--;
            }
        }
    }

    public static void findMaxMinSingleScan(int[] arr){
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            else if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum Element "+max+" Minimum Element "+min);
    }

    public static void insertedInSortedArray(int[] arr,int num,int currentlen){
        int j=currentlen-1;
        while (arr[j] > num){
            arr[j+1]=arr[j];
            //i--;
            j--;
        }
        arr[j+1]=num;
    }

    public static boolean isSortedArray(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void leftNegativeRightPositive(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            while(arr[i]<0){
                i++;
            }
            while(arr[j]>=0){
                j--;
            }
            if(i<j){
                 swap(arr,i,j);
            }
        }
    }

    public static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

    }

    public static int[] mergeArrays(int[] arr1,int[] arr2){
        int i=0;
        int j=0;
        int k=0;
        int m=arr1.length;
        int n=arr2.length;
        int[] c=new int[m+n];
        while(i<m && j<n){
            if(arr1[i]<arr2[j]){
                c[k++]=arr1[i++];
            }
            else{
                c[k++]=arr2[j++];
            }
        }
        //for(;i<m;i++){
        while(i<m){
            c[k++]=arr1[i++];
        }
        //for(;j<n;j++){
        while(j<n){
            c[k++]=arr2[j++];
        }
        return c;
    }

    public static int[] setUnionForSortedArray(int[] arr1,int[] arr2){
        int i=0;
        int j=0;
        int k=0;
        int m=arr1.length;
        int n=arr2.length;
        int[] c=new int[m+n];
        while(i<m && j<n){
            if(arr1[i]<arr2[j]){
                c[k++]=arr1[i++];
            }
            else{
                c[k++]=arr2[j++];
            }
        }
        //for(;i<m;i++){
        while(i<m){
            c[k++]=arr1[i++];
        }
        //for(;j<n;j++){
        while(j<n){
            c[k++]=arr2[j++];
        }
        return c;
    }

    public static int[] setUnionForUnSortedArray(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int n = arr1.length;
        int m = arr2.length;
        int[] arr3 = new int[n + m];
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
            } else if (arr2[j] < arr1[i]) {
                arr3[k++] = arr2[j++];
            } else {
                arr3[k++] = arr1[i++];
                j++; // Only increment j when elements are equal
            }
        }

        while (i < n) {
            arr3[k++] = arr1[i++];
        }
        while (j < m) {
            arr3[k++] = arr2[j++];
        }

        return arr3;
    }

    public static int[] setIntersectionOfArrays(int[] arr1,int[] arr2){
        int i=0;
        int j=0;
        int k=0;
        int[] arr3;
        int n=arr1.length;
        int m=arr2.length;
        if(n<m){
            arr3=new int[n];
        }else{
            arr3=new int[m];
        }
    
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr2[j]<arr1[i]){
                j++;
            }
            else{
                arr3[k++]=arr1[i++];
                j++;
            }
        }
        return arr3;

    }
  
    public static int[] setDifferenceofArrays(int[] arr1,int[] arr2){
        int i=0;
        int j=0;
        int k=0;
        int n=arr1.length;
        int m=arr2.length;
        int[] arr3=new int[n];
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                arr3[k++]=arr1[i++];
            }
            else if(arr2[j]<arr1[i]){
                j++;
            }
            else{
                i++;
                j++;
            }

        }
        while(i<n){
            arr3[k++]=arr1[i++];
        }
        return arr3;

    }
    
    public static void main (String args[])
    {
        //int[] arr={1,2,3,4,5,6,7,8,9,10,11,13};
        //missingElementMethod1(arr);
        //int[] arr={6,7,8,9,11,12,15,16,17,18,19};
        //missingElementMethod3(arr);
        //int[] arr={3,7,4,9,12,6,1,11,2,10};
        //System.out.println(maxElem(arr));
        //missingElementMethod4(arr);
        //int[] arr1={3,6,8,8,10,12,15,15,15,20};
        //duplicateElement(arr1);
        //countDuplicates(arr1);
        //System.out.println("countFindDuplicateElement ");
        //countFindDuplicateElement(arr1);
        //System.out.println("countFindDuplicateInUnsortedArrays : ");
        //int[] arr3={8,3,6,4,6,5,6,8,2,7};
        //countFindDuplicateInUnsortedArrays(arr3);
        //FindDuplicateInUnsortedArrays(arr3);
        //System.out.println("PairWithSumKUnsortedArrayMethod1 : ");
        //int[] arr4={6,3,8,10,16,7,5,2,9,14};
        //PairWithSumKUnsortedArrayMethod2(arr4,10);
        //System.out.println("PairWithSumKSortedArray : ");
        //int[] arr5={1,3,4,5,6,8,9,10,12,14};
        //PairWithSumKSortedArray(arr5,10);
        //System.out.println("findMaxMinSingleScan : ");
        //findMaxMinSingleScan(arr4);
        //int[] arr=new int[10];
        //int[] arr={4,8,13,16,20,25,28,33};
        /* 
        arr[0] = 4;
        arr[1] = 8;
        arr[2] = 13;
        arr[3] = 16;
        arr[4] = 20;
        arr[5] = 25;
        arr[6] = 28;
        arr[7] = 33;
        System.out.println(Arrays.toString(arr));
        insertedInSortedArray(arr, 18,8);
        insertedInSortedArray(arr, 5,9);
        System.out.println(Arrays.toString(arr));
        System.out.println(isSortedArray(arr));
        
        int[] arr={1,4,-5,7,-9,1,3,0,4,-5,8,-9,10};
        System.out.println(Arrays.toString(arr));
        leftNegativeRightPositive(arr);
        System.out.println(Arrays.toString(arr));
        */
        int[] arr1={2,6,10,15,25};
        int[] arr2={3,6,7,15,20};
        //System.out.println(Arrays.toString(mergeArrays(arr1, arr2)));
        //System.out.println(Arrays.toString(setUnionForUnSortedArray(arr1,arr2)));
        //System.out.println(Arrays.toString(setIntersectionOfArrays(arr1,arr2)));
        System.out.println(Arrays.toString(setDifferenceofArrays(arr1,arr2)));
    }
}
/* */