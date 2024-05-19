import java.lang.*;
import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Sort{

    private void swap(int[] array, int index1,int index2) {
        var temp=array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }
  

  public void BubbleSort(int[] arr){
    boolean isSorted;
    for(int i=0;i<arr.length;i++)
      {
        isSorted=true;
        for(int j=1;j<arr.length-i;j++)
        {
           if(arr[j]<arr[j-1])
           {
                swap(arr ,j,j-1);
                isSorted=false;
           }
        }
        if(isSorted)
            return;
      }  
  }


  public void selectionSort(int[] arr){
    for(var i=0;i<arr.length;i++){
        var minIndex=i;
        for(var j=i;j<arr.length;j++){
            if(arr[j]<arr[minIndex]){
                minIndex=j;
            }
        }
        swap(arr,minIndex,i);
    }
  }


  public void insertionSort(int[] arr){
    for(var i=1;i<arr.length;i++)
    {
        var current=arr[i];
        var j=i-1;
        while(j>=0 && arr[j]>current){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=current;
    }

  }


  public void mergeSort(int[] arr){
    if(arr.length<2){
        return;
    }
    var middle=arr.length/2;
    int[] left=new int[middle];
    for(var i=0;i<middle;i++){
        left[i]=arr[i];
    }
    int[] right=new int[arr.length-middle];
    for(var i=middle;i<arr.length;i++){
        right[i-middle]=arr[i];
    }

    mergeSort(left);
    mergeSort(right);
    //Merge the result
    merge(left,right,arr);

  }


  private void merge(int[] left,int[] right,int[] result){
    int i=0,j=0,k=0;
    while(i<left.length && j<right.length){
        if(left[i]<=right[j]){
            result[k++]=left[i++];
        }
        else{
            result[k++]=right[j++];
        }
    }

    while(i<left.length){
        result[k++]=left[i++];

    }
    while(j<right.length){
        result[k++]=right[j++];
    }
  }


  public void quickSort(int[] arr){
    quickSort(arr,0,arr.length-1);
  }
  private void quickSort(int[] arr,int start,int end){
      if(start>=end)
        return;
    //partition
    var boundary=partition(arr,start,end);
    //sortleft
    quickSort(arr,start,boundary-1);
    //sort right
    quickSort(arr,boundary+1,end);
  }


  private int partition(int[] arr,int start,int end){
    var pivot=arr[end];//[arr.length-1];
    var boundary=start-1;//-1;
    //for(var i=0;i<arr.length;i++){
      for(var i=start;i<=end;i++){
      if(arr[i]<=pivot){
        //boundary++;
        swap(arr,i,++boundary);
      }
    }
    return boundary;
  }

  public int findMax(int[] arr){
    int max=arr[0];
    int i;
    for(i=0;i<arr.length;i++){
      if(arr[i]>max)
      {
        max=arr[i];
      }
    }
    return max;
  }
  public void countingSort(int[] arr,int max){
    int[] counts=new int[max+1];
    for(var item:arr){
      counts[item]++;
    }
    var k=0;
    for(var i=0;i<counts.length;i++){
      for(var j=0;j<counts[i];j++){
        arr[k++]=i;
      }
    }
  }

  public void bucketSort(int[] arr,int numberOfBuckets){
    /* 
    List<Integer> x=new ArrayList<>();
    List<List<Integer>> buckets=new ArrayList<>();
    for(var i=0;i<numberOfBuckets;i++){
      buckets.add(new ArrayList<>());
    }

    for(var item:arr){
      buckets.get(item/numberOfBuckets).add(item);
    }
    */
    //var buckets=createBuckets(arr, numberOfBuckets);
    var i=0;
    //for(var bucket:buckets){
    for(var bucket:createBuckets(arr, numberOfBuckets)){
      Collections.sort(bucket);
      for(var item:bucket){
        arr[i++]=item;
      }

    }
  
  }
private List<List<Integer>> createBuckets(int[] arr,int numberOfBuckets){
  List<Integer> x=new ArrayList<>();
  List<List<Integer>> buckets=new ArrayList<>();
  for(var i=0;i<numberOfBuckets;i++){
    buckets.add(new ArrayList<>());
  }

  for(var item:arr){
    buckets.get(item/numberOfBuckets).add(item);
  }
  return buckets;
}

};

public class Sorting
{
  public static void main(String[] args)
  {
    var s=new Sort();
    int[] arr={3,7,5,6,4,8,0,2};
    //s.BubbleSort(arr);
    //s.selectionSort(arr);
    //s.insertionSort(arr);
    //s.mergeSort(arr);
    //int len=arr.length-1;
    //s.quickSort(arr, 0, len);
    //s.quickSort(arr);
    //s.countingSort(arr,8);
    s.bucketSort(arr, 3);
    System.out.println("BubbleSort");
    System.out.println(Arrays.toString(arr));
    System.out.println("Maximum "+s.findMax(arr));

  }
};
