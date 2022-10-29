package calculateChainOfResponsibility;

public class DivideNumbers implements Chain {
	
	private Chain nextInChain;

	@Override
	public void setNextChain(Chain nextChain) {
		// TODO Auto-generated method stub
		this.nextInChain = nextChain;
	}

	@Override
	public void calculate(Numbers request) {
		// TODO Auto-generated method stub
		if(request.getCalcWanted() == "div") {
			System.out.println(request.getNumber1()+ " / "+ request.getNumber2()+ " = " +(request.getNumber1()/request.getNumber2()));
		} else {
			System.out.println("Only works for add, sub, mult, and div");
		}
	}

}
