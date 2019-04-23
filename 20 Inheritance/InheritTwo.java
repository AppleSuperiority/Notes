//(c) A+ Computer Science
// www.apluscompsci.com

//inheritance example

import static java.lang.System.*;
public class InheritTwo
{
  public static void main ( String[] args )
  {
     Monster m = new Monster();
     out.println(m);

<<<<<<< HEAD
     Witch witch = new Witch();
     out.println(witch);
     
     Sasquatch r = new Sasquatch();
     out.println(r);
     //instantiate Sasquatch
=======
public class InheritTwo
{
  public static void main ( String[] args )
  {
     Monster m = new Monster();
     out.println(m);

     Witch witch = new Witch();
     out.println(witch);
     
     //instantiate Sasquatch
     Sasquatch billy = new Sasquatch();
     System.out.println(billy.getHasFluffy());
     System.out.println(billy);
>>>>>>> upstream/master
     
     
  }
}
<<<<<<< HEAD
=======

>>>>>>> upstream/master
class Monster
{
 private String myName;

 public Monster()
 {
  myName = "Monster";
 }

 public Monster( String name )
 {
  myName = name;
 }

 public String toString()
 {
  return "Monster name :: " + myName + "\n";
 }
}

class Witch extends Monster
{ 
 //how does Witch work if it has no code?

 
 
}

//make a new type of Monster - Sasquatch 
<<<<<<< HEAD
class Sasquatch extends Monster{
  private String name;
  private String identity;
  private String talent;
  private String quality;
  
  public Sasquatch(){
    name = "Reggie";
    identity = "veggie";
    talent = "making codes a lot more complicated than they need to be and making number systems no one understands but him";
    quality = "stubborn";
  }
  
  public Sasquatch( String naame, String who, String play, String what){
    name = naame;
    identity = who;
    talent = play;
    quality = what;
  }
  
  public String toString(){
    return "Monsieur Sasquatch's name is " + name + " and he is a " + identity + ". His talent is " + talent + 
      " and his best quality is being " + quality + "\n";
  }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    

=======

class Sasquatch extends Monster{
     private boolean hasFluffy;
     
     public Sasquatch(){
          hasFluffy = true;
     }
     
     public boolean getHasFluffy(){
          return hasFluffy;
     }
}
>>>>>>> upstream/master




