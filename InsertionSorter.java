/**
  Implement an insertion sort, in the Sorters structure
 */
import java.util.ArrayList;

public class InsertionSorter extends Sorter {
    private ArrayList<String> list;
    private int alreadyInserted;

    /**
      Construct an instance to process the user's data.
     */
    public InsertionSorter(  ArrayList< String> usersData) {
        super(usersData);
        list = usersData;
        //Run insert1 for positions 1 through n–1 in the list.
        for (int index = 0 ; index < usersData.size() ; index ++){
            alreadyInserted = index;
            mySort();
            /* debugging
            System.out.println( "    dbg: "
              + "after inserting element " + alreadyInserted
              + " elements: " + list
              );
            */
        }
    }


    /**
      sort the user's data, implementing insertion sort
     */
    public void mySort() {
        String valueToAdd = list.get(alreadyInserted);
        if (valueToAdd.compareTo(list.get(0)) < 0){
            //shifting all larger values, to make space,
            //thereby expanding the sorted region
            for (int i = alreadyInserted ; i > 0 ; i --){
                list.set(i,list.get(i-1));
            }
            //Insert the first unsorted element in its
            //place in the current sorted region
            list.set(0,valueToAdd);
            /* debugging
            System.out.println("value " + valueToAdd
            + " was moved to the beginning");
            */
        }
        else{
            for (int index = alreadyInserted ; index > 0 ; index --){
                if (valueToAdd.compareTo(list.get(index-1)) > 0 ){
                    //shifting all larger values, to make space,
                    //thereby expanding the sorted region
                    for (int i = alreadyInserted ; i > index ; i --){
                        list.set(i,list.get(i-1));
                    }
                    //Insert the first unsorted element in its
                    //place in the current sorted region,
                    list.set(index,valueToAdd);
                    /* debugging
                    System.out.println("value " + valueToAdd
                    + " was moved to index " + index);
                    */
                    break;
                }
            }
        }
    }
}
