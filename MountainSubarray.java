package TutorOps;
public class MountainSubarray {
    public static void main(String[] args) {
        int a[] = new int[] {1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};
        int count = 1, temp = 0;
        for(int i = 1; i<a.length-1;){
            if(a[i-1]<a[i] && a[i]>a[i+1]){
                int j = i;
                while(j>0 && a[j]>a[j-1]){
                    count++;
                    j--;
                }
                while(i<a.length-1 && a[i]>a[i+1]){
                    count++;
                    i++;
                }
            }
            else{
                i++;
            }
            if(temp<count){
                temp = count;
            }
            count = 1;
        }
        System.out.println(temp);
    }
}
