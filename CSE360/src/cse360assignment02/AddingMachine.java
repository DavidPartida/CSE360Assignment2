package cse360assignment02;

public class AddingMachine {
	private int total; // final total
    private int add; // Adding?       0 no     1 yes
    private int sub; // Subtracting?  0 no     1 yes
    private int num; // value being added or subtracted

  
  public AddingMachine () {
    total = 0;  
    add = -1;
    sub = 0;
    num = 0;
    System.out.print(toString()); // Prints out first zero
    add = 0;
  }
  
  public int getTotal () { // Returns the final total
      return total;
  }

  public void add (int value) { // Add method adds the parameter to the total variable
	  if(add == -1) {
		  System.out.print(toString()); // If clear is called then reset 
	  }
      num = value;
      add = 1;
      total = total + value;
      System.out.print(toString()); // Concatenates with operator and the value being added
      add = 0;
  }

  public void subtract (int value) { // Subtract method subtracts the parameter from the total variable
	  if(add == -1) {
		  System.out.print(toString()); // // If clear is called then reset 
	  }
      num = value;
      sub = 1;
      total = total - value;
      System.out.print(toString()); // Concatenates with operator and the value being subtracted
      sub = 0;
  }

  public String toString () {
      if(add == 1){				// If adding then use '+' operator
          return " + " + num;
      }
      else if(sub == 1){		// If subtracting then use '-' operator
          return " - " + num;
      }
      else if (add == -1){
          return "0" + "";
      }
      else{
          return "";
      }
  }
  
  public void clear() { // Clears final total and resets
	  total = 0;
	  add = -1;
  }
  
  public static void main(String[] args){
	  AddingMachine myCalculator = new AddingMachine();// new instance created
	  myCalculator.add(4);
	  myCalculator.subtract(2);
	  myCalculator.add(5);
      System.out.println(myCalculator.toString());
      System.out.println("= " + myCalculator.getTotal());
      myCalculator.clear();
  }
}