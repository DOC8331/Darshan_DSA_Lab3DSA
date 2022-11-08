package Question1;

public class BalancedBrackets {
			
			public boolean checkingbalancedbrackets(String bracketExpressionString) {
				boolean flag=true;
				if(bracketExpressionString!=""||!bracketExpressionString.isEmpty()) {
					char[] chararr=bracketExpressionString.toCharArray();
					if(chararr.length%2!=0) {
						flag=false;
					}
					else {
						for(int i=0; i<chararr.length/2; i++) {
							char ch=chararr[i];
							switch(ch) {
							case '(' :
								if(chararr[chararr.length-1-i]!=')') 
									flag=false;
									break;
								
							case '{' :
								if(chararr[chararr.length-1-i]!='}') 
									flag=false;
									break;
								
							case '[' :
								if(chararr[chararr.length-1-i]!=']') 
									flag=false;
									break;
							default : 	
								flag=false;
								break;
								
							}
						}
					}
				}
				else {
					System.out.println("entered string is empty. enter a different string");
					flag=false;
				}
				
				return flag;
				
			}

}
