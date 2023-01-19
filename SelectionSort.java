//Programmer:  John Chapin  email: john.chapin@lcps.org
//Programmer: Chris Schroeder email: chris@4schroeders.com - Modified to use the ISortPanel

public class SelectionSort implements Runnable {
  int[] sortArray;
  ISortPanel panel;

  public SelectionSort(int[] anArray, ISortPanel aPanel) {
    sortArray = anArray;
    panel = aPanel;
  }
  
  //Write a swap helper method

  // This is the sort routine on sortArray
  public void run() {
     
     for(int i = 0; i < sortArray.length; i++)
     {
     int min = i;
      for(int j = i; j < sortArray.length; j++)
      {
        if(sortArray[j] < sortArray[min])
        {
          min = j;
        }

      }
      swap(i, min);
      panel.updateArray(sortArray);
     }
	  // this code goes after every change in the array
 
  }// selectionSort()
  public void swap(int i, int j) 
  {
    int temp = sortArray[i];
    sortArray[i] = sortArray[j];
    sortArray[j] = temp;  
  }
}// SelectionSort class