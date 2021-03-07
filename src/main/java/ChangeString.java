public class ChangeString {

    String string;

    ChangeString(String str){
        this.string = str;
    }

    public String toUpCase () {
        return string.toUpperCase();
    }

    public String toLowCase () {
        return string.toLowerCase();
    }

    public int getLength() {
        return string.length();
    }

    public String OneFromTwo(String str) {
        return string + str;
    }
}
