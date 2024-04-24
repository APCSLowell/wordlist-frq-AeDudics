import java.util.*;

public class WordList
{
  private ArrayList <String> myList;

  public WordList() { myList = new ArrayList<String>(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  public int numWordsOfLength(int len)
  {
    int cool = 0;
    for(Object mabob : myList){
      String thingy = (String)mabob;
      if(thingy.length() == len){
        cool++;
      }
    }
    return cool;
  }

  public void removeWordsOfLength(int len)
  {
    for(int i = myList.size() - 1; i >= 0; i--){
      String thing = (String)myList.get(i);
      if(thing.length() == len){
        myList.remove(i);
      }
    }
  }
}
