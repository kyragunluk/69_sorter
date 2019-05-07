/**
  Implement an selection sort, in the Sorters structure
 */
import java.util.ArrayList;

public class SelectionSorter extends Sorter {
    private ArrayList<String> list;
    private int startAt;
    private int indexOfSmallest ;

    public SelectionSorter(  ArrayList< String> unordered) {
        super(unordered);
        list = unordered;
        //Run reigningDweeb for positions 0 through n–2 in the list.
        for( int next = 0
           ; next < list.size() -1  // last needs no sort
           ; next++) {
             startAt = next;
             mySort();
            //Swap it with the first value in the unsorted region,
            //thereby expanding the sorted region. 
            list.set( next, list.set( indexOfSmallest, list.get( next))
                          );
        }
    }

    public void mySort() {
        int save = indexOfSmallest;
        indexOfSmallest = startAt;
        int dweebAt = startAt;
        String dweeb = list.get( dweebAt);

        for( int testAt = startAt +1
           ; testAt < list.size()
           ; testAt++)
           //Find the smallest value in the unsorted region.
            if( list.get( testAt).compareTo( dweeb) < 0) {
                // Found a smaller value. Remember it.
                dweebAt = testAt;
                dweeb = list.get( dweebAt);
                indexOfSmallest = dweebAt;
            }
    }

}
/*
    private ArrayList<String> callengers;
    private int startIndex;
    private String currentSmallest;

    public InsertionSorter(  ArrayList< String> unordered) {
        super(usersData);
        challengers = unordered;
        int nextLargerAt = champIndex( unordered);
        System.out.println(
             "smallest element is at index " + nextLargerAt
             + " and has the value " + unordered.get( nextLargerAt));
        ArrayList<String> list_iAS = unordered;
        challengers = list_iAS;
        for(int index = 0 ; index < list_iAS.size() ; index++ ){
            String currentObject = list_iAS.get(index);
            String nextSmallest = list_iAS.get(mySort());
            mySort();
            list_iAS.set(index , nextSmallest);
            list_iAS.set(emptyIndex , currentObject);
         }
         // test champIndex, for incremental development
}
    }

    public void mySort() {
         String smallest = challengers.get(startIndex);
         int indexOfSmallest = startIndex;
         for (int index = startIndex; index < challengers.size() ; index++){
             if (challengers.get(index).compareTo(smallest) < 0){
                 smallest = challengers.get(index);
                 indexOfSmallest = index;
                 }
         }
         currentSmallest = smallest;
    }
}
*/
