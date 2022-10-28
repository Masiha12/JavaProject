package src.com.syntax.Replit;

public class Task139AccessModifiers {



    public String alphabetical(String str){
        String newStr="";
        for (int i=0; i<str.length()-1; i++){
            if (i==0){
                newStr+=str.charAt(i);
            }
            if(str.charAt(i+1)>str.charAt(i)){
                newStr+=str.charAt(i+1);
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
        Task139AccessModifiers ans=new Task139AccessModifiers();
        System.out.println(ans.alphabetical("hello"));
        System.out.println(ans.alphabetical("software"));
        System.out.println(ans.alphabetical("language"));
    }

}
