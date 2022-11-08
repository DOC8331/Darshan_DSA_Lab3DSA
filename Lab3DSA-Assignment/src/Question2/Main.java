package Question2;

import Question2.FindSumPair.Node;

public class Main {

	public static void main(String[] args) {
		
		Node root= null;
		
		FindSumPair fsp =new FindSumPair();
		
		root = fsp.insert(root, 40);
		root = fsp.insert(root, 20);
		root = fsp.insert(root, 60);
		root = fsp.insert(root, 10);
		root = fsp.insert(root, 30);
		root = fsp.insert(root, 50);
		root = fsp.insert(root, 70);
		
		int sum=190;
		
		fsp.findPairWithGivenSum(root, sum);


	}

}
