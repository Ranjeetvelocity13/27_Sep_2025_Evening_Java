package Day_29_25_11_12_String;

public class Program1 {

    public static void main(String[] args) {

        // ---------------------------------------------------------
        // STRING METHODS IN JAVA
        // ---------------------------------------------------------

        // 1. length() – returns length of the string
        String str1 = "Automation";
        System.out.println(str1.length());

        int len = str1.length();
        System.out.println(len);

        // 2. toUpperCase() – converts all characters to uppercase
        String name = "Python";
        System.out.println(name.toUpperCase());

        // 3. toLowerCase() – converts all characters to lowercase
        String country = "INDIA";
        System.out.println(country.toLowerCase());

        // 4. charAt(index) – returns character at given index (0-based index)
        String word = "Hello";
        System.out.println(word.charAt(0)); // H
        System.out.println(word.charAt(3)); // l
        // System.out.println(word.charAt(5)); // Error: Index out of range

        String lang = "java";
        System.out.println(lang.charAt(3)); // a

        // 5. equals() – compares two strings (case-sensitive)
        String s1 = "Java";
        String s2 = "Java";
        System.out.println(s1.equals(s2)); // true

        String s3 = "java";
        System.out.println(s1.equals(s3)); // false

        // 6. equalsIgnoreCase() – compares ignoring case
        String s4 = "JAVA";
        String s5 = "java";
        String s6 = "Automation";
        String s7 = "automation";

        System.out.println(s4.equalsIgnoreCase(s5)); // true
        System.out.println(s6.equalsIgnoreCase(s7)); // true

        // 7. contains() – checks if substring exists
        String msg = "Welcome to Java world";
        System.out.println(msg.contains("Java"));   // true
        System.out.println(msg.contains("Python")); // false

        // 8. startsWith() – checks if string starts with given value
        String str = "Automation Testing";
        System.out.println(str.startsWith("Auto")); // true
        System.out.println(str.startsWith("Test")); // false

        // 9. endsWith() – checks if string ends with given value
        System.out.println(str.endsWith("ing")); // true
        System.out.println(str.endsWith("Auto")); // false

        // 10. indexOf() – returns first occurrence of given character
        String s = "Programmingr";
        System.out.println(s.indexOf('r')); // first r = index 1
        System.out.println(s.indexOf('g')); // first g = index 3

        // find 2nd occurrence of 'r'
        System.out.println(s.indexOf('r', s.indexOf('r') + 1));

        // find 3rd occurrence of 'r'
        System.out.println(s.indexOf('r',
                s.indexOf('r', s.indexOf('r') + 1) + 1));

        // 11. lastIndexOf() – returns last occurrence of substring
        String name1 = "Programming";
        System.out.println(name1.lastIndexOf('g'));  // index of last g
        System.out.println(name1.lastIndexOf("mm")); // index of "mm"

        // 12. substring() – returns part of string
        String word1 = "Programming";
        System.out.println(word1.substring(2));      // from index 2 to end
        System.out.println(word1.substring(4));      // from index 4 to end

        System.out.println(word1.substring(2, 7));   // index 2 to 6

        // 13. replace() – replace character or substring
        String msg1 = "Java is fun";
        System.out.println(msg1.replace("fun", "powerful"));
        System.out.println(msg1.replace('J', 'P'));

        // 14. trim() – removes leading and trailing spaces
        String data = "     Java   ";
        System.out.println(data.length());
        System.out.println(data);
        System.out.println(data.trim());          // remove start/end spaces
        System.out.println(data.stripLeading());  // remove only leading spaces
        System.out.println(data.stripTrailing()); // remove only trailing spaces

        // 15. concat() – join two strings
        String first = "Hello";
        String second = "World";
        System.out.println(first.concat(" " + second));

        // 16. isEmpty() – checks if string is empty
        String s10 = "";
        System.out.println(s10.isEmpty()); // true
        System.out.println(first.isEmpty()); // false

        // 17. compareTo() – compares lexicographically
        String s11 = "Amit";
        String s12 = "Amit";
        System.out.println(s11.compareTo(s12)); // 0 (equal)

        // 18. toCharArray() – converts string to char array
        String word11 = "Java";
        char[] arr1 = word11.toCharArray();

        System.out.println(arr1); // prints as a char sequence

        // Enhanced for loop
        for (char c : arr1) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Normal for loop
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        // 19. split() – splits string based on delimiter

        String sentence = "Java is easy to learn";
        String[] word2 = sentence.split(" ");

        for (String w : word2) {
            System.out.println(w);
        }

        String fruits = "Apple,Mango,Banana,Orange";
        String[] fruitsList = fruits.split(",");

        for (String f : fruitsList) {
            System.out.println(f);
        }

        String date = "12/11/2025";
        String[] part = date.split("/");

        System.out.println("Day: " + part[0]);
        System.out.println("Month: " + part[1]);
        System.out.println("Year: " + part[2]);
    }
}
