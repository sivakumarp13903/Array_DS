package linearDS;
import java.util.*;

public class QueueUsingArray {
    static final int MAX_SIZE = 5;
    static int arr[] = new int[MAX_SIZE];
    static int front = -1, rear = -1, element;

    static void insert(int num) {
        if((rear+1)%MAX_SIZE==front) {
        	System.out.println("Queue is Full");
        }
        else {
        	if(front == -1 && rear==-1) {
        		front=rear=0;
        	}
        	else {
        		rear=(rear+1)%MAX_SIZE;
        	}
        	arr[rear]=num;
        }
    }

    static int delete() {
    	int delElement;
    	if(front == -1) {
    		System.out.println("Queue is Empty\n");
    		return -1;
    	}
    	else {
    		delElement=arr[front];
    		if(front==rear) {
    			front=rear=-1;
    		}
    		else {
    			front=(front+1)%MAX_SIZE;
    		}
    	}
    	return delElement;
    }

    static void printQueue() {
        if(front == -1) {
        	System.out.println("Queue is Empty\n");
        }
        int i=front;
        while(true) {
        	System.out.print(arr[i]+" ");
        	if(i==rear) {
        		break;
        	}
        	i=(i+1)%MAX_SIZE;
        }System.out.println();
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int userInput = 1;
        while (userInput != 0) {
            System.out.println("Enter the Option :\nInsert 1\nDelete 2\nView 3");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Enter the Element\n");
                    element = sc.nextInt();
                    insert(element);
                    break;
                case 2:
                    int deletedElement = delete();
                    if (deletedElement != -1) {
                        System.out.println("Deleted Element " + deletedElement);
                    }
                    break;
                case 3:
                    printQueue();
                    break;
                default:
                    System.out.print("Enter the Correct Option");
                    break;
            }
            System.out.print("Enter 1 to continue or 0 to terminate the loop: ");
            userInput = sc.nextInt();
        }
        sc.close();
    }
}
