public class Keyboard {

    Wireless isWireless;
    boolean hasNumPad;
    String keyboardType;
    KeyboardLayout layout;

    public Keyboard(boolean isWireless, boolean hasNumPad, String keyboardType, String layout) {
        this.isWireless = new Wireless();
        this.hasNumPad = hasNumPad;
        this.keyboardType = keyboardType;
        this.layout = new KeyboardLayout();
    }
}
