package com.nk.linkedlist.exceptions;

public class InvalidOperationException extends Exception
{
	public InvalidOperationException()
	{
		super();
	}
	
	public InvalidOperationException(String message)
	{
		super(message);
	}
	
	@Override
	public String toString()
	{
		return "InvalidOperation ==> "+super.getMessage();
	}
}
