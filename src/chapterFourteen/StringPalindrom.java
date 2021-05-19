package chapterFourteen;


public class StringPalindrom {
    public boolean isPalindrome(String word){
        StringBuilder reversed=new StringBuilder();
        for(int i=word.length()-1;i>=0;i--){
            reversed.append(word.charAt((i)));

        }
        return reversed.toString().equalsIgnoreCase(word);
    }

    public static void main(String[] args) {
        StringPalindrom sc=new StringPalindrom();
        System.out.println(sc.isPalindrome("mom"));
    }
}