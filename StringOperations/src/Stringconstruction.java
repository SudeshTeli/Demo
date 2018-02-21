
public class Stringconstruction {

	  static String str1 = "You cannot change me!";      // Interned
	  
	
	  public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String emptyStr = new String();           // ""   
		   System.out.println("emptyStr: \"" + emptyStr + "\"");
		    String str2 = "You cannot change me!";       // Interned   
		    String str3 = "You cannot" + " change me!";    // Interned    
		    String str4 = new String("You cannot change me!");   // New String object
		
		  
		    String words = " change me!";   
		    String str5 = "You cannot" + words;      // New String object
		    System.out.println("str1 == str2:      " +  (str1 == str2));     // (1) true   
		    System.out.println("str1.equals(str2): " +  str1.equals(str2));  // (2) true
		    System.out.println("str1 == str3:      " + (str1 == str3));      // (3) true   
		    System.out.println("str1.equals(str3): " + str1.equals(str3)); // (4) true
		    System.out.println("str1 == str4:      " + (str1 == str4));      // (5) false    
		    System.out.println("str1.equals(str4): " + str1.equals(str4)); // (6) true
		    System.out.println("str1 == str5:      " + (str1 == str5));      // (7) false  
		    System.out.println("str1.equals(str5): " + str1.equals(str5)); // (8) true
		    System.out.println("str1 == Auxiliary.str1:      " +  (str1 == Auxiliary.str1));     // (9) true    
		    System.out.println("str1.equals(Auxiliary.str1): " +    str1.equals(Auxiliary.str1)); // (10) true
		    System.out.println("\"You cannot change me!\".length(): " +        "You cannot change me!".length());// (11) 21 
	
	
		    //to lwer case operation
		    String str6 = str5.toLowerCase();
		    System.out.println("\nAfter applying the to lower case operation\n");
		    System.out.println(str6);
		    
		   //touppercase operation
		    
		    String str7 = str6.toUpperCase();
		    System.out.println("\nAfter applying the to upper case operation to the above displayed string\n");
		    System.out.println(str7);
	
		    
		    //concatenation operation
		    
		    String glue = "Just trying concat operation"; 
		    glue=glue.concat(" got lost in space."); 
		    System.out.println(glue);
		    
		    //chaining the string object with other string values
		    glue = glue.concat("  advertising for a ride home").concat(" here.").concat("out in space");
		    System.out.println(glue);  
		    
		    //chaining again
		    glue=glue.concat(". Hope that space pirates don't get their hands on my precious cargo. Enduarari gaikon\n");
		    System.out.println(glue);  
		    
		    String motto = new String("Program once");     // new string object
		    motto += ", execute everywhere.";              // concatenate using + sign
		    motto = motto.concat(" Don't bet on it!");     // concatenating using chaining method
		    System.out.println(motto+"\n"); 
		    
		    
		    //trying the indexing methods to find the position of single character
		    int search1 = motto.indexOf('r');  //here first position where r occurs that index value is returned
		    System.out.println("searching for character r in string "+motto);
		    System.out.println("The character is found at position "+search1+"\n");
		    int search2 = motto.indexOf('r',2);
		    System.out.println("searching for second occurance of character r in string "+motto);
		    System.out.println("The character is found at position "+search2+"\n");
		    
		    int search3=motto.lastIndexOf('r');
		    System.out.println("searching for character r in reverse order in string "+motto);
		    System.out.println("The character is found at position "+search3+"\n");
		    int search5=motto.lastIndexOf('r', 29);
		    System.out.println("searching for second occurance of character r in reverse order in string "+motto);
		    System.out.println("The character is found at position "+search5+"\n");
		    
		  //trying the indexing methods to find the position of word in a string
		    
		    System.out.println("searching for word 'space' in string "+glue);
		    int indexsearch1 = glue.indexOf("space");
		    System.out.println("The word 'space' was found at position "+indexsearch1+"\n");
		    System.out.println("searching for second occurance word 'space' in string "+glue);
		    int indexsearch2 = glue.indexOf("space",45);
		    System.out.println("The word 'space' was found second time at position "+indexsearch2+"\n");
		    System.out.println("searching for word 'space' in reverse order in string "+glue);
		    int indexsearch4 = glue.lastIndexOf("space");
		    System.out.println("The word 'space' was found at position "+indexsearch4+"\n");
		    System.out.println("searching for second occurance word 'space' in reverse order in string "+glue);
		    int indexsearch5 = glue.lastIndexOf("space",105);
		    System.out.println("The word 'space' was found in reverse order second time at position "+indexsearch5+"\n");
		   
		    
		    //trying the replace command for replacing the one char
		    String hh=motto.replace('o','y');
		    System.out.println(hh+"\n");
		    
		    //trying the replace command for replacing the one word
		    String kk=motto.replace("Program","Die");
		    System.out.println(kk+"\n");
		    
		    //trying out extracting string
		    System.out.println("The string that is to be operated on");
		    System.out.println(glue);
		    glue=glue.trim();
		    System.out.println(glue);
		    System.out.println("The string after performing substring operation from position 40 \n");
		    String gluestick=glue.substring(40);
		    System.out.println(gluestick);
		    System.out.println("The string that is to be operated on");
		    System.out.println(glue);
		    String fevicol=glue.substring(40, 80);
		    System.out.println("The string after performing substring operation from position 40 till 80 \n");
		    System.out.println(fevicol);
		    System.out.println("replace"+(motto+kk).trim()+"\n");
		    System.out.println("substring"+(motto+glue).substring(4,glue.length())+"\n");
		    
		    
		    
		   
		    
		    
		    
	}

}
