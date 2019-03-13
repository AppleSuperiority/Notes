//(c) A+ Computer Science
// www.apluscompsci.com

//comparable sort example

import static java.lang.System.*;
import java.util.Arrays;

public class SortTwo
{
 public static void main ( String[] args )
 {
  Comparable[] list =  {3,8,7,6,5,4,9};
  
  Arrays.sort(list); //uses the compareTo() method of each object
  
  for(Comparable num : list)
  {
   out.println(num);
  }

  out.println("\n\n");

  list = new String[]{"a","x","e","w","q"};
  
  Arrays.sort(list);
  
  for(Comparable let : list)
  {
   out.println(let);
  }
  System.out.println("\n\n\n");
  
 
 Word a = new Word("saddam hussein");
 Word b = new Word("Mao");
 Word c = new Word("osama bin laden");
 Word d = new Word("fidel castro");
 Word e = new Word("hitler");
 Word f = new Word("senor stalin");
 Word g = new Word("mussolini");
 Word h = new Word("ghengis khan");
 Word i = new Word("kim jong un");
 Word j = new Word("kim jong il");
 list = new Word[]{a,b,c,d,e,f,g,h,i,j};
 Arrays.sort(list);
 
  for(Comparable let : list)
  {
   out.println(let);
  }
}
}