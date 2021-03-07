import static org.junit.jupiter.api.Assertions.*;

class ChangeStringTest {

    @org.junit.jupiter.api.Test
    void toUpCase() {
        ChangeString ch_str = new ChangeString("sTr ing");
        assertEquals("STR ING", ch_str.toUpCase());
    }

    @org.junit.jupiter.api.Test
    void toLowCase() {
        ChangeString ch_str = new  ChangeString("StR ING");
        assertEquals("str ing", ch_str.toLowCase());
    }

    @org.junit.jupiter.api.Test
    void getLength() {
        ChangeString ch_str = new  ChangeString("string");
        assertEquals(6, ch_str.getLength());
    }

    @org.junit.jupiter.api.Test
    void oneFromTwo() {
        ChangeString ch_str = new ChangeString("My n");
        assertEquals("My name", ch_str.OneFromTwo("ame"));
    }
}