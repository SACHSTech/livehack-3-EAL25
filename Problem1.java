class Problem1 extends ConsoleProgram {

  /**
  * Description
  * @author: Evelyn A.L.
  */
  
  @Override
  public void run() {

      // get username
       String username = readLine("Enter your username: ");
       System.out.println("Your username is: " + username);

       String cleanUserName = username.trim();  // remove newlines etc.
// remove newlines etc.
    String alphaNumPattern = "^[a-zA-Z0-9]*$";
      // length of username
        // regex pattern to match for alphanumeric test
   
    boolean onlyAlphaNum;   // is the name alphanumeric?
    boolean atLeastOneDigit = false;  // does the name contain at least one digit?
    boolean longEnough;     // is the name greater than 7 characters?
    boolean acceptableUserName; // are all above factors true?
 
    // Test that the username has at least one digit by iterating through each character
    // once a digit is found, set the "atLeastOneDigit" boolean to TRUE
    for (char c : cleanUserName.toCharArray()) {
        if (Character.isDigit(c)) {
          atLeastOneDigit = true;
        }
    }
   
      // Test that the username is alphanumic only using regex "alphaNumPattern"
      onlyAlphaNum = cleanUserName.matches(alphaNumPattern);
   
      // Measure the length of the username, if it's < 7 characters, then set longEnough to FALSE
      longEnough = cleanUserName.length() >= 7;
     
      // If all tests (at least one digit and only alphanumic + 7 characters are true), then set acceptableUserName to TRUE, otherwise FALSE
      acceptableUserName = atLeastOneDigit == true && onlyAlphaNum == true && longEnough == true;
   
      System.out.println("Your username is " + acceptableUserName);
    

       
//*==========================================================================================*/  
 if(acceptableUserName){
        // get users info
        String FirstName = readLine("Enter your first name: ");
        String LastName = readLine("Enter your last name: ");
        String StudentID = readLine("Enter the 9 digit student number: " );
      
        System.out.println("Your first name is: " + FirstName);
        System.out.println("Your last name is: " + LastName);
        System.out.println("Your student id is: " + StudentID);
  
//*==========================================================================================*/  
    //Creating the student password
    String First;
    String Last;
    String ID;

    First = FirstName.substring(0,1);
    Last = LastName.substring(0,4);
    ID = StudentID.substring(4,7);

    System.out.println("Your generated password is: " + Last + First + ID);


/*==========================================================================================*/  
 }

 
    }
  }