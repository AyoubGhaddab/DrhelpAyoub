/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dhelp.DAO;

/**
 *
 * @author user
 */
public class StripChar {
    
    public static String stripSpecialCharacters(String str) {
   StringBuffer sb = new StringBuffer();
    for(int i=0;i<str.length();i++) {
        char ch = str.charAt(i);
        if (Character.isLetterOrDigit(ch) || Character.isSpaceChar(ch))
            sb.append(ch);
    }
    return sb.toString();
}
    
}
