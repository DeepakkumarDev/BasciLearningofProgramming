public class QuestionThree2 {
    public static void main(String[] args) {
        int arr[]={12,98,13,76,53};
        int index=4,result=0,i;
        for(i=0;i<index;i++){
            result+=arr[i];
            i++;
        }
        for(i=0;i<index;i++){
            result+=arr[i];
        }
        System.out.println("Result : "+result);
    }
    
}
