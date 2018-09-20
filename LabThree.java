package sillyphrases;

import java.util.ArrayList;

/*
  This is working without the optional rules <sentence> ::= <simple_sentence> [ <CONJUNCTION> <SENTENCE> ], if you run with this rules you will
  get a  infinite recursive.
  
*/
 public class LabThree {
	       
		static final String[] conjunction = { "and", "or", "but", "because"}; 
		static final String[] proper_noun = {"Fred", "Jane", "Richard Nixon", "Miss America" };
		static final String[] common_noun = {"man", "woman", "fish", "elephant", "unicorn" };
		static final String[] determiner = {"a", "the","every", "some"};
		static final String[] adjective = {"big", "tiny", "pretty", "bald"};
		static final String[] intransitive_verb = {"runs", "jumps", "talks", "sleeps"};
		static final String[] transitive_verb = {"loves", "hates", "sees", "knows", "looks for", "finds"};
        
		static ArrayList<String> list = new ArrayList<>();
		
		static public void main(String[] args ) {
			
		         
			
			 
			while (true) {
		   
			      
		         sentence();
		         System.out.println("\n\n");
		        try {
		        	
		            Thread.sleep(3000);
		            
		        }
		        catch (InterruptedException e) {
		        	System.out.println("wHAAAAAATTTTT!!!!!" + e );
		        }
		     }
		  
			      
		     

		  
		  }// end of main
		
		
		
		
		
		
    /* static public String randomItem( String listOfStrings) {	   // MY BRAIN STOPPED TO WORK RIGHT HER
			   
    	     String names = listOfStrings;
    	    	 
    	     String new_name = TextIO.getln();
    		 int i = 1;
    		 String x;
    		 x = randomItem(new_name);
    		 list.add(x);
    		  i++;
                  
	             
	            
	             return names;
    
    } 
    */ 
	// I was trying to pass a collection of list but it did not work. 
	
	
	static public  void sentence( ) {  
		
		//<sentence> ::= <simple_sentence> [ <conjunction> <sentence> ]  
		
		 simple_sentence();
		
		 
		/* if(Math.random() < 0.2 );
         int IndexConj = (int)(Math.random()* conjunction.length);
         System.out.print("  " + conjunction[IndexConj]);
         
         System.out.print(" \n\n");
    
        sentence(); */            //if called get a infinite recursive  
		 
	} 
	
public static void simple_sentence() {  
		
//	<simple_sentence> ::= <noun_phrase> <verb_phrase>  
	
	//String list  = TextIO.getln(); 
	 //  randomItem( list );
	  noun_phrase();
	  verb_phrase();
		
	}//end of simple sentence
	
	
	

public static void verb_phrase() {                
		/*
		 * <verb_phrase> ::= <intransitive_verb> | <transitive_verb> <noun_phrase> | is <adjective> |  believes that <simple_sentence>
		 * 
		 * */
		if(Math.random() < 0.2) {
		int IndexVerb = (int)(Math.random()* intransitive_verb.length);
             
         System.out.print("  " + intransitive_verb[IndexVerb] ); 
          
        	
		}
		else if (Math.random() > 0.2 ) {
        	 int IndexVerb = (int)(Math.random()* intransitive_verb.length);
             System.out.print("  " + intransitive_verb[IndexVerb] ); 
             
              noun_phrase();
        	 
        	 
 		    }//end of else if
         if (Math.random() < 0.75 ) {
             int IndexAdj= (int)(Math.random()* adjective.length);
			   
                  System.out.print( " is " + adjective[IndexAdj] );
			      
         }
         
         
        
		
         else {  
	        	 
	        	 System.out.println(" believes that " );
	        	 simple_sentence();
	        	 // believes that <simple_sentence>
          }
        	
	
	}//end of verb_phrase
		

	
    static public void noun_phrase() {
    	
//    	<noun_phrase> ::= <proper_noun> | <determiner> [ <adjective> ]. <common_noun> [ who <verb_phrase> ]  			
             
    	
    	 
    	
    	
    	         int IndexProperNoun = (int)(Math.random()* proper_noun.length);   
        	                     
    			             System.out.print(" " + proper_noun[IndexProperNoun]);
    			             
    			             
    		
    	     if(Math.random() > 0.75) {
                
    	         int IndexDeter = (int)(Math.random()* determiner.length);
    	                  
    	                     System.out.print("  " + determiner[IndexDeter]);
    	                     
    	        int IndexAdj= (int)(Math.random()* adjective.length);
    	        int IndexCommon = (int)(Math.random() * common_noun.length);     
    	                  System.out.print("  " + adjective[IndexAdj] + " "+ common_noun[IndexCommon] );
    	                        
    	                                System.out.print(". who " );     
    	                                
    	                                 verb_phrase();
    	     
    	     }
            }
    	
 

}//end of labthree
