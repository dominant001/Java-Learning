
public class exam {

    public static void main(String[] args){
        String str = "He@#$llo!*&";
        String resultStr = "";
        String spc = "";

        for (int i=0;i<str.length();i++)
        {
//comparing alphabets with their corresponding ASCII value
            if(str.charAt(i)>64 && str.charAt(i)<91 || str.charAt(i)>96 && str.charAt(i)<123)

              //returns true if both conditions returns true
            {
//adding characters into empty string
                resultStr=resultStr+str.charAt(i);
            }
            else {
                spc =spc+ str.charAt(i);
            }
        }

        spc = resultStr+spc;

        System.out.println("String after removing special characters: "+resultStr);


        System.out.println(spc);
    }
}

