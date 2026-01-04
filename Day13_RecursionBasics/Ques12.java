/*
REMOVE DUPLICATES IN A STRING 
"appnnacollege"

[ GOOGLE , MICROSOFT ]
*/
public class Ques12 {
    public static void removeDuplicates(String str,int idx, StringBuilder newstr,boolean map[]){
        //base case
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }

        //kaam
        char currChar = str.charAt(idx);
        if (map[currChar-'a'] == true) { //Check if character is already used
            //DUPLICATE REMOVED
            removeDuplicates(str, idx+1, newstr, map);
        }else{
            map[currChar-'a'] = true; // UPDATE THE MAP WITH T/F
            removeDuplicates(str, idx+1, newstr.append(currChar), map); //ADDED NEW CHAR 
        }

    }
    public static void main(String[] args) {
        String str ="cchhiirryhihaagg";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}



