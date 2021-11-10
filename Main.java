
package pkginterface;


public class Interface {

       public static void main(String[] args) {
      Tossable tossable1=new Rock(); 
      Tossable tossable2=new Ball();
      Baseball Bb=new Baseball("Baseball");
      Football Fb=new Football("Football");
      tossable1.toss();
      tossable2.toss();
           System.out.println( Bb.getbrandName());
           System.out.println( Fb.getbrandName());

         

    }
    
}
