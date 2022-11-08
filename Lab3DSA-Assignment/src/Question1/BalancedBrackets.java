package Question1;

import java.util.Stack;

public class BalancedBrackets {
		
		public boolean checkingbalancedbrackets(String bracketExpresseion) {
			
			Stack<Character> stack = new Stack<Character>();
			for (int i = 0; i < bracketExpresseion.length(); i++) {
					
					char character= bracketExpresseion.charAt(i);
					
					if(character == '(' || character== '{' || character=='[' )
					{
						stack.push(character);
						continue;
					}
					
					if(stack.isEmpty())
						return false;
					
					char c;
					
					switch(character) {
					
					case ')':
						c=stack.pop();
						if(c=='}'|| c==']')
							return false;
						break;
					case '}':
						c=stack.pop();
						if(c==')'|| c==']')
							return false;
						break;
					case ']':
						c=stack.pop();
						if(c=='}'|| c==')')
							return false;
						break;
					}
					
			}
			return (stack.isEmpty());
		}
}
