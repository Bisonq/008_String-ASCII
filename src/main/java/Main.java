import converter.StringConverter;

public class Main {
    public static void main(String[] args) {
        StringConverter converter = StringConverter.getInstance();
        System.out.println(converter.convertStringToASCII("Some words x1 x"));
        System.out.println(converter.convertCharToASCII('x'));
    }
}
