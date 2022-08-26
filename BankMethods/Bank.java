package BankMethods;
import myatm.*;

public interface Bank
{
   public void deposit(double amt)throws InvalidAmountException;
   public double withdraw(double amt)throws InvalidAmountException,InsufficientBalanceException;
   
}
