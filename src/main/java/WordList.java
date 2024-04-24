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
    for(Object mabob : WordList){
      String thingy = (String)mabob;
      if(thingy.length() == len){
        cool++;
      }
    }
    return cool;
  }

  public void removeWordsOfLength(int len)
  {
    for(int i = WordList.size(); i >= 0; i--){
      String thing = (String)WordList.get(i);
      if(thing.length() == len){
        WordList.remove(i);
      }
    }
  }
}
