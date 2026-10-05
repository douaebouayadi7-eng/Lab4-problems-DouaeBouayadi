package problem2;

import java.util.Arrays;

public class IntegerList
{
    int[] list; //values in the list
    int arrSize;
    int numIntegers;


    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size){
        list= new int[size];
        arrSize= size;
        numIntegers=0;
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }

    public void increaseSize(){
            int[] temp= new int[arrSize*2];
            for (int i=0; i<list.length; i++){
                temp[i]=list[i];
            }
            list= temp;
            arrSize= arrSize*2;
    }
    public void addElement(int newVal){
        if (numIntegers== arrSize){
            increaseSize();
        }
        list[numIntegers]= newVal;
        numIntegers++;
    }
    public void removeFirst(int newVal){
        for(int i=0; i<numIntegers; i++){
            if (list[i]==newVal){
                for(int j=i; j<numIntegers-1; j++){
                    list[j]=list[j+1];
                }
                numIntegers--;
                break; //because we only need the first occurrence.
            }
        }
    }
    public void removeAll(int newVal){
        int i=0;
        while(i<numIntegers){
            if(list[i]==newVal){
                for(int j=i; j<numIntegers-1; j++){
                    list[j]=list[j+1];
                }
                numIntegers--;
            }
            else i++;
        }
    }
}
