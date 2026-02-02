public class Main {

   public static void main(String []args) {
      
// 1D ARRAY is a block of memory that stores a COLLECTION
// of data items (elements) of the same type
// UNDER ONE VARIABLE NAME!!!

// How to DECLARE & CREATE an Array vairable
String[] apCompSci = new String[13];
double[] prices = new double[5]; // default values: 0.0
String[] names = new String[5]; // default values: null
int[] luckyNums = new int[10]; // default values: 0
boolean[] yesNo = new boolean[3];

// How to ACCESS an item in an Array
// arrayName[1] -> 1 is the INDEX (position)
System.out.println( prices[0] ); // FIRST ITEM!

// Use the same syntax to SET a value in an Array
luckyNums[0] = 12;
luckyNums[5] = 32;
System.out.println(luckyNums[0]);
System.out.println(luckyNums[5]);
System.out.println(luckyNums[3]); // prints 0
// System.out.println( luckyNums[45] ); // index 45 is out of bounds!

// Create an aray with values using an INITALIZER LIST!
String[] table = {"Caleb", "Max"};
System.out.println(table[1]); // gets the SECOND value of the array
System.out.println(table[0]); // gets the FIRST value of the array
// Only use INITALIZER LIST shortcut when first declaring array
// i.e. we can't do: apCompSci = {"name1", "name2"}

// The .length ATTRIBUTE gets the NUMBER OF ITEMS in array
int lengthOfTableArray = table.length;
System.out.println( lengthOfTableArray ); // 2 items
// To get the LAST INDEX use: arrayName.length - 1
int finalIndex = table.length - 1;
System.out.println(finalIndex); // 1
// To get the LAST ITEM use: arrayName[arrayName.length - 1]
System.out.println(table[finalIndex]); // table[2] -> "Max"
System.out.println(table[table.length - 1]); //same as above


   } // end main METHOD
} // end Main CLASS
