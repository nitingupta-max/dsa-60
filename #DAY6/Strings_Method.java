
public class Strings_Method {
    public static void main(String[] args) {
        String s = "STRING";
        System.out.println("Char at index 2 is : " + s.charAt(2));// prints R

        System.out.println("Length of string is : " + s.length());// prints length of string

        System.out.println(s.substring(2));// prints substring starting from index 2 to end
        System.out.println(s.substring(1, 4));// prints substring starting from index 1 and end at (4-1)

        // java string format method
        String name = "Nitin";
        int age = 19;
        System.out.println(String.format("My Name is %s and I am %d Year", name, age));
        System.out.println(String.format("value is %f", 34.8795893));

        System.out.println(String.format("%x", 101)); // prints number in hexadecimal form
        String str2 = String.format("|%10d|", 101); // Specifying length of integer
        System.out.println(str2);

        String intro = "Hello Everyone How Are You?";
        // return true if substring present in string otherwise return false
        System.out.println(intro.contains("Hello"));
        System.out.println(intro.contains("hello"));
        System.out.println(intro.contains("?"));

        String date = String.join("/", "20", "09", "2021");
        String time = String.join(":", "21", "15", "00");
        String hello = String.join("-", "Hello", "Everyone", "How", "are", "you"); // prints - after each substring

        System.out.println(date + "  " + time);// prints 20/09/2021 21:15:00
        System.out.println(hello);

        String a = "abc";
        String b = "abc";
        String c = "pqr";
        String d = "";
        // equals() its checks whether string are equal or not
        System.out.println(a.equals(b)); // true because both are equal
        System.out.println(a.equals(c)); // false beacuse both are different

        System.out.println(a.isEmpty()); // false because it is not empty
        System.out.println(d.isEmpty());

        String s1 = "java string";
        // The string s1 does not get changed, even though it is invoking the method
        // concat(), as it is immutable. Therefore, the explicit assignment is required
        // here.
        s1.concat("is immutable");
        System.out.println(s1);
        s1 = s1.concat(" is immutable so assign it explicitly");
        System.out.println(s1);

        System.out.println(s1.replace("java", "JAVA")); // replace java by JAVA

        String replaceString = s1.replace('a', 'e');// replaces all occurrences of 'a' to 'e'
        System.out.println(replaceString);
        String p = "java";
        String q = "java";
        String r = "JAVA";
        String t = "python";
        System.out.println(p.equalsIgnoreCase(q));// true because content and case both are same
        System.out.println(p.equalsIgnoreCase(r));// true because case is ignored
        System.out.println(p.equalsIgnoreCase(t));// false because content is not same

        System.out.println(p.toUpperCase());
        System.out.println(r.toLowerCase());
        System.out.println(t.indexOf('y')); // prints 1
        System.out.println(t.indexOf('y',2)); // prints - value because y present at 1 but we start from 2 index
        System.out.println(t.indexOf("th")); // 2 beacuse th present at index 2

        String Trim = "    hello    world   ";
        System.out.println(Trim.trim()); // remove space from begining and ending



    }

}
