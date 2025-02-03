package day3_day4_oops;

import java.io.IOException;
import java.sql.*;
 
class A
{
		void display() throws IOException, SQLException, ABCException,NullPointerException,ArrayIndexOutOfBoundsException
		{
			for(int i=0;i<=20;i++)
			{
				System.out.println("I :"+i);
				if(i==18) throw new NullPointerException();
				if(i==16) throw new ArrayIndexOutOfBoundsException();
				if(i==14) throw new IOException();
				if(i==11) throw new SQLException();
				if(i==13) throw new ArithmeticException();
				if(i==10) throw new ABCException("Abc Excpetrion ");
			}
		}
}
public class ALLException {
	public static void main(String[] args) {
		
		try
		{
			A a = new A();a.display();
			try
			{	
			}
			catch(Exception e)
			{
			}
			
			try
			{	
			}
			catch(Exception e)
			{
			}
			finally
			{
			}
			
			try
			{	
			}
			finally
			{
			}
		}
		catch (NullPointerException np) {
			try
			{	
			}
			catch(Exception e)
			{
			}
			
			try
			{	
			}
			catch(Exception e)
			{
			}
			finally
			{
			}
			
			try
			{	
			}
			finally
			{
			}
			System.out.println("NullPointerException raisesd ");
		}
		catch (ArithmeticException np) {
			System.out.println("ArithmeticException raisesd ");
		}
		catch (ArrayIndexOutOfBoundsException  anp) {
			System.out.println("ArrayIndexOutOfBoundsException raisesd ");
		}
		catch (IOException  io) {
			System.out.println("IOException raisesd ");
		}
		catch (ABCException  aio) {
			System.out.println("ABCException raisesd ");
		}
		catch (SQLException  isql) {
			System.out.println("SQLException raisesd ");
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			try
			{	
			}
			catch(Exception e)
			{
			}
			
			try
			{	
			}
			catch(Exception e)
			{
			}
			finally
			{
			}
			try
			{	
			}
			finally
			{
			}
			
			System.out.println("Thank you ");
		}
	}
}
class ABCException extends Exception
{
	ABCException(String msg)
	{
		super(msg);
	}
 
}