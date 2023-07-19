package program;

//Lambda Expression Using Parameter ?

interface Myintf{
	abstract public void say(String name);
}
public class LambdaWithParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myintf ref = (na)->{
			System.out.println("My name is "+na);
		};
		ref.say("Nayan");
	}

}