import java.util.ArrayList;
public class insert {
    public static void  main(String[] args){
        //定义一个动态数组
        ArrayList<Integer> dynamicArray = new ArrayList<>(); 
        dynamicArray.add(4);
        dynamicArray.add(5);
        dynamicArray.add(3);
        dynamicArray.add(1);
        dynamicArray.add(4);
        dynamicArray.add(56);
        dynamicArray.add(45);
        dynamicArray.add(8);
        dynamicArray.add(79);
        dynamicArray.add(21);
        dynamicArray.add(0);
        dynamicArray.add(34);
        int size = dynamicArray.size();
        System.out.println("the length of the array:"+size);
        for (int i=0;i<dynamicArray.size();i++){
            System.out.println(dynamicArray.get(i));
        }
        //start to insorting
        /*for (int j=1;j<dynamicArray.size();j++){
            int temp = dynamicArray.get(j);
            //insert A[j] into the sorted sequence A[0..j-1]
            int i = j-1;
            while(i>=0 && dynamicArray.get(i)>temp){
                dynamicArray.set(i+1,dynamicArray.get(i));
                i = i-1;
            }
            dynamicArray.set(i+1,temp); 
        }
        */
        for (int j=1;j<dynamicArray.size();j++){
            int temp = dynamicArray.get(j);
            //insert A[j] into the sorted sequence A[0..j-1]
            int i = j-1;
            while(i>=0 && dynamicArray.get(i)<temp){
                dynamicArray.set(i+1,dynamicArray.get(i));
                i = i-1;
            }
            dynamicArray.set(i+1,temp); 
        }
        System.out.println("after sorting:");
        for (int j=0;j<dynamicArray.size();j++){
            System.out.println(dynamicArray.get(j));
        }
    }
}
