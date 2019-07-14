package day56_abstraction_02;

public abstract class MobilePhone extends Phone{
	//it does not need to override Call
	public abstract void text(String message);
}
