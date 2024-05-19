class ArrysAppl{
    public void Display(int[] arr){
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
        System.out.println();
    }

    void misElemMeth1(int[] arr){
        int n=arr[arr.length-1];
        int s=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            
        }
        int diff=s-sum;
        System.out.println("Missing element is :"+diff);
    }

    void misElemMeth2(int[] arr){
        int low=arr[0];
        int high=arr[arr.length-1];
        int diff=low-0;
        for(int i=0;i<arr.length;i++){
            if((arr[i]-i)!=diff){
                System.out.println("Missing element is : "+(i+diff));
                break;
            }
        }
    }

    void misElemMeth3(int[] arr){
        int low=arr[0];
        int diff=low;
        for(int i=0;i<arr.length;i++){
            if((arr[i]-i)!=diff){
                while(diff<(arr[i]-i)){
                    System.out.println("Missing Element : "+(i+diff));
                    diff++;

                }
            }
        }
    }



}
public class ArraysApp {
    public static void main(String[] args){
        var arapp=new ArrysAppl();
        int[] arr={1,2,3,5,6,8,9,11};
        arapp.Display(arr);

        arapp.misElemMeth3(arr);
    }
}

