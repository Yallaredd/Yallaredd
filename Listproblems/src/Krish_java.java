
public class Krish_java {

	public static void main(String[] args) {
		
		
		  String str = "sudha reddy kamabalapalli"; String temp= " ";
		 /* System.out.println("Length"+str.length()); System.out.println(str); for(int
		 * i=str.length()-1;i>-1;i--) { temp=temp+str.charAt(i);
		 * 
		 * 
		 * 
		 * } // i want print word by word System.out.println(temp);
		 * 
		 * String[] words =str.split(" ");
		 * 
		 * for (int k=0;k<=words.length-1;k++) {
		 * 
		 * System.out.println("word:"+words[k]);
		 * 
		 * } // I want print Replace char "S","r"
		 * 
		 * String strRep = str.replace("s", "r");
		 * 
		 * System.out.println("replace word is:"+ strRep);
		 * 
		 * 
		 * // i want replace all
		 * 
		 * String strRepall = str.replaceAll("l","a" );
		 * 
		 * System.out.println("after replace::"+strRepall);
		 * 
		 * // Replace all char will allow you regular expression
		 * 
		 * str = "sudha123 reddy654 kamabalapalli987"; str = str.replaceAll("\\d","");
		 * System.out.println("Aftre remove digits::"+str);
		  
		 
		 */		 
		 // Starts with
		
		 str = "Online Testing Help";
		 
		 System.out.println(str.endsWith("Help"));
		 
		//  Ends  with
			
			 str = "Online Testing Help";
			 
			 System.out.println(str.endsWith("Help"));
			 
			 // Sub string method
			 
			 str = "Online Testing Help";
			 System.out.println("substring is"+str.substring(0));
		 
			 System.out.println("substring is"+str.substring(7));
			 System.out.println("substring is"+str.substring(8,13));
			 
		// To charArry is used to convert to string to chararry 
			 
			 char[]strChar=str.toCharArray();
			 
			for(int i=0;i<strChar.length;i++) {
				
				System.out.println("Each char is:"+ strChar[i]);
				
			}
			 
			 //  Convert lower case 
			
			System.out.println("To lower case::"+str.toLowerCase());
			 
			
			
		     // Convert lower case 
			
			
			System.out.println("To lower case::"+str.toUpperCase());
		 
	
	      // Trim Methode 
	
	  str  = " sudha reddy kamala    ";
	  
        System.out.println("Before trim ::"+ str.length());
        
        str = str.trim();
        
        System.out.println("After trim ::"+ str.length());
        
        
        // compar to 
         
       // String str = "sudha reddy kamabalapalli";
        
        String str1 = "sudha";
        String str2 = "sudha";
        
        System.out.println(str1.compareTo(str2));
        
        //concat string method 
        
        System.out.println(str.concat(str2));
        
        
			
	}
	

	}


