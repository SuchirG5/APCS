public class ArtistInsertionSort
{

    public static void swap(int i, int j, Comparable[] myArray)
    {
        Comparable temp = myArray[i];
        myArray[i] = myArray[j];
        myArray[j] = temp;
    }

    public static void sort(Comparable[] myArray)
    {
       for(int i = 0; i < myArray.length; i++)
        {
            int j = i;
            while(j>=1 && myArray[j].compareTo(myArray[j-1]) > 0)
            {
                swap(j, j-1, myArray);
                j--;
            }
        }
    }

    public static void printArray(Artist[] arr)
    {
        for(Artist i : arr)
        {
            System.out.println(i.getArtistName() + " " + i.getSongName() + " " + i.getArtistImage() + " " + i.getYearlySales());
        }
    }
}