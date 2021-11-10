
package pkginterface;


public class Ball implements Tossable{
    
private String brandName;
public Ball(){}

public Ball(String brName)
{
    this.brandName=brName;
}

public String getbrandName()
{
    return brandName;
}

public void bounce()
{
}
    @Override
public void toss() 
    {
        System.out.println("Plz. toss The Ball");
    }
    
}
