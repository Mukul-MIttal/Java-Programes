package mukul.msc;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class StringReplaceWithCode {
    public static void main(String[] args){
        String s1="The quick brown fox jumps over the lazy dog.";  
        String replaceString=Relapce("fox","cat",s1);  
        System.out.println(replaceString);  
        
    }
    public static String Relapce(String R,String RW,String MainString){
        String Res=new String();
            StringTokenizer st = new StringTokenizer(MainString);
            String CToken=new String();
                while(st.hasMoreTokens()) {
                    CToken=st.nextToken();
                    if(CToken.equals(R)){
                        Res+=RW + " ";
                    }else{
                        Res+=CToken + " ";
                    }
                }
        return Res;
    }
    
}
