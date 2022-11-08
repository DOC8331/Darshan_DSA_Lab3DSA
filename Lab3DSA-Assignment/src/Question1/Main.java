package Question1;

public class Main {

	public static void main(String[] args) {
				
				String bracketExpressionString ="([[{}]])";
				
				boolean result;
				
				BalancedBrackets BB=new BalancedBrackets();
				
				result=BB.checkingbalancedbrackets(bracketExpressionString);
				
				if(result)
					System.out.println("This String is balanced");
				else
					System.out.println("This String is not balanced");

	}

}
