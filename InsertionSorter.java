/**
  Implement an insertion sort, in the Sorters structure
 */
import java.util.ArrayList;

public class InsertionSorter extends Sorter {


    /**
      Construct an instance to process the user's data
     */
    public InsertionSorter(  ArrayList< String> usersData) {
        for (int index = 0 ; index < usersData.size() ; index ++){
            usersData = mySort(usersData,index);
        }
    }


    /**
      sort the user's data, implementing insertion sort
     */
    public void mySort(ArrayList< String> list, int alreadyInserted) {
        String valueToAdd = list.get(alreadyInserted);
        for (int index = alreadyInserted ; index > 0 ; index --){
            if (valueToAdd.compareTo(list.get(index-1)) > 0s ){
                for (int i = alreadyInserted ; i > index ; i --){
                    list.set(i,list.get(i-1));
                }
                list.set(index,valueToAdd);
            }
        }
        for (int i = alreadyInserted ; i > 0 ; i --){
            list.set(i,list.get(i-1));
        }
        list.set(0,valueToAdd);
    }
}
