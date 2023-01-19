//Programmer:  John Chapin  email: john.chapin@lcps.org
//Programmer: Chris Schroeder email: chris@4schroeders.com - Modified to use the ISortPanel

public class InsertionSort implements Runnable {
  int[] sortArray;
  ISortPanel panel;

  public InsertionSort(int[] anArray, ISortPanel aPanel) {
    sortArray = anArray;
    panel = aPanel;
  }
  
  // ***** SWAP CODE GOES HERE (PASS THE ARRAY REFERENCE and INDEXES) ****
  void swap(int i, int j)
  {
    int temp = sortArray[i];
    sortArray[i] = sortArray[j];
    sortArray[j] = temp;
  }
  // *********  SORT ROUTINE GOES IN THE RUN METHOD
  public void run() 
  {
    for(int i = 0; i < sortArray.length; i++)
    {
      int j = i;
      while(j>=1 && sortArray[j] < sortArray[j-1])
      {
        swap(j, j-1);
        panel.updateArray(sortArray);
        j--;

      }
    }
      // Displays the whole array - put after a change is made
      								
  }// selectionSort() in run method
}// SelectionSort class