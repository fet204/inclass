package thursday;

import java.util.NoSuchElementException;

/*
 * tip: 
 * - Every time you are using loops on a list, make a current that will hold the front value so you don't lose  the list
 * - Make sure you never change the front of the list without having some other field that is pointing to your list
 */

public class LinkedIntList {
	
	private ListNode front; 
	public LinkedIntList() {
		front = null;
	}
	
	public void add(int value) {
		// This detects if the front is nothing. If it is, it will make a new listnode that will pass a value
		if (front == null) {
			front = new ListNode(value);
		}
		
		// The else method takes care as the rest of the exceptions. 
		// This navigates the rest of the list and gets to the end so you can put the new value at the end of the list.
		else {
			ListNode current = front; 
			while (current.next != null) {
				current = current.next;
			}
			current.next = new ListNode(value);
		}
		
		
		
	}
	
	public void print() {
		ListNode current = front; 
		while (current.next != null) {
			System.out.print(current.data + " ");
			current = current.next; // this is the incremental statement so that way the while loop actually moves through the loop and doesn't loop on forever
		}
		System.out.print(current.data); // prints the last value because the while loop stops right before the last value because it is detecting the null. 
	}
	
	public int min() {
		if (front == null){
	        throw new NoSuchElementException();
	    }
	    
	    else {
	        
	        Integer lowestNum = front.data;
	        Integer current = front.data;
	        
	        while (front != null){
	            if (current < front.next.data){
	                lowestNum = front.data;
	            }
	        }
	        return lowestNum;
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void remove(int index) {
		if(index == 0) {
			front = front.next;
		}
		
		else {
			ListNode current = front;
			for (int i = 0; i < index -1; i ++) {
				current = current.next; 
			}
			
			current.next = current.next.next; 
		}
	}
}

/*
 * 
 */









