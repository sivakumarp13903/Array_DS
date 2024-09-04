package linearDS;
import java.util.*;
public class StackUsingArray {
	static final int MAX_SIZE=5;
	static int arr[]=new int[MAX_SIZE];
	static int top=-1;
	static void push(int num) {
		if(top>=MAX_SIZE-1) {
			System.out.println("Stack is Full");
			return;
		}
		arr[++top]=num;
		//printStack();
	}	
	
	static int pop() {
		if(top<0) {
			System.out.print("Stack is empty");
			return -1;
		}
		int popElement=arr[top--];
		printStack();
		return popElement;
	}
	
	static void printStack() {
		if(top<0) {
			System.out.print("Stack is Empty\n");
			return;
		}
		for(int i=0;i<=top;i++) {
			System.out.print(arr[i]+" ");
		}System.out.println();
	}
	
	public static void main(String arg[]) {
		Scanner sc=new Scanner (System.in);
		int userInput = 1;
        while (userInput != 0) {
        	System.out.println("Enter the Option :\nPush 1\nPop 2\nView 3\t");
			int option=sc.nextInt();
			switch(option) {
			case 1: System.out.println("Enter the Element\t");
    				int element =sc.nextInt();
    				push(element);
    				break;
			case 2: System.out.println("Poped Element "+pop());
					break;
			case 3: printStack();
					break;
			default:
    			System.out.print("Enter the Correct Option");
    			break;
    		}
        	System.out.print("Enter 1 to continue or 0 to terminate the loop: ");
            userInput = sc.nextInt();
        }sc.close();
	}
}
