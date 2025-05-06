import java.util.*;
public class RandomStringChooser
{
  ArrayList <String> words; 
  RandomStringChooser(String[] arrays){
    words=new ArrayList <String> (); 
    for ( int i= 0 ; i< arrays.length;i++) {
      words.add(arrays[i]); 
    } 
  } 
  public String getNext(){
    if(words.size()>0) {
      return words.remove((int)Math.random()*words.size() ) ; 
    } return "NONE"; 
  } 
}
