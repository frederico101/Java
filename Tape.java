package turing;
/**this software are the turing machine's tape implemented by double linked list
 * 
 * */
public class Tape {
	
	private Cell currentHead = new Cell(); //root first cell                  
	public Tape() { // Constructor to create the root 
		Cell runner = new Cell();
		runner.content = ' '; // the blank space of the new tape 
		runner.prev = null;   
		runner.next = null;
		currentHead = runner;   
	}

	public Cell getCurrentCell() { // The pointer to current tape.
		return currentHead;
	}

	public char getContent() { // The content of current tape.
		return currentHead.content;
	}

	public void setContent(char ch) { // ch The character to be set into the current tape.
		currentHead.content = ch;
	}

	public void moveLeft() { // Moves one position to the left along the tape.
		if (currentHead.prev == null) {
			Cell runner = new Cell();
			runner.content = ' ';
			runner.prev = null;
			runner.next = currentHead;
			currentHead.prev = runner;
		}
		currentHead = currentHead.prev;
	}

	public void moveRight() { // Moves one position to the right along the tape.
		if (currentHead.next == null) {
			Cell runner = new Cell();
			runner.content = ' ';
			runner.next = null;
			runner.prev = currentHead;
			currentHead.next = runner;
		}
		currentHead = currentHead.next;
	}

	public String getTapeContents() { // Returns a String consisting of the chars of all the content in the tape.
		Cell getTape = currentHead;
		while (getTape.prev != null)
			getTape = getTape.prev;
		String Content = "";
		while (getTape != null) {
			 Content += getTape.content;
			getTape = getTape.next;
		}
		 Content = Content.trim(); // Returns a copy of the string, with leading and 
		 //trailing whitespace omitted.
		return Content;
	}
}