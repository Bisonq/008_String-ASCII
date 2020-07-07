package converter;

public class StringConverter {

    private static final StringConverter stringConverter = new StringConverter();

    public static StringConverter getInstance(){
        return stringConverter;
    }

    public String convertStringToASCII(String s){
        if(s == null)
            throw new IllegalArgumentException();
        StringBuilder result = new StringBuilder();
        StringBuilder stringBuilder = new StringBuilder(s);
        for(int i = 0 ; i < stringBuilder.length() ; i++)
           result.append(convertCharToASCII(stringBuilder.charAt(i))).append(" ");
        return result.toString();
    }

    public int convertCharToASCII(char c){
        return (int)c;
    }
}
