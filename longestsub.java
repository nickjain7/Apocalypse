import java.util.*;
class longestsub
{
public static void main (String[] args)
{
String st;
Scanner sc = new Scanner(System.in);
st = sc.nextLine();
System.out.println(ls(st));

}
public static int ls (String s) {

    HashSet<Character> set = new HashSet<>();
    int result = 1;
    int i=0; 
    for(int j=0; j<s.length(); j++){
        char c = s.charAt(j);
        if(!set.contains(c)){
            set.add(c);
            result = Math.max(result, set.size());
        }else{
            while(i<j){
                if(s.charAt(i)==c){
                    i++;
                    break;
                }
 
                set.remove(s.charAt(i));
                i++;
            }
        }    
    }
 
    return result;
}
}
