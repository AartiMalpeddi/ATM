package myatm;

public class InvalidAmountException extends Exception
{
  public InvalidAmountException()
  {
    super();
  }
  public InvalidAmountException(String msg)
  {
    super(msg);
  }
  }
