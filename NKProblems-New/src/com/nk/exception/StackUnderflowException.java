package com.nk.exception;

public class StackUnderflowException extends Exception
{
	public StackUnderflowException()
	{}
	
	public StackUnderflowException(String msg)
	{
		super(msg);
	}
	
	@Override
	public String toString()
	{
		return "Stack is already empty";
	}
}
