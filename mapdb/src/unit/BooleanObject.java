https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
package unit;


public class BooleanObject
{
  public boolean value = false;
  
  public BooleanObject()
  {    
  }
  
  public BooleanObject( boolean value )
  {    
    this.value = value;
  }
  
  public void setTrue()
  {
    value = true;
  }
  
  public void setFalse()
  {
    value = false;
  }
  
  public boolean isTrue()
  {    
    return value == true;
  }
  
  public boolean isFalse()
  {
    return value == false;
  }
  
  @Override
  public String toString()
  {
    return value ? "true" : "false"  ;
  }
  
}
