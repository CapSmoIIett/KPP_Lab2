import static org.junit.jupiter.api.Assertions.*;

class ChangeStringTest {

    @org.junit.jupiter.api.Test
    void toUpCase() {
        ChangeString ch_str = new ChangeString();
        assertEquals("STR ING", ch_str.toUpCase("sTr ing"));
    }

    @org.junit.jupiter.api.Test
    void toLowCase() {
        ChangeString ch_str = new  ChangeString();
        assertEquals("str ing", ch_str.toLowCase("StR ING"));
    }

    @org.junit.jupiter.api.Test
    void getLength() {
        ChangeString ch_str = new  ChangeString();
        assertEquals(6, ch_str.getLength("string"));
    }

    @org.junit.jupiter.api.Test
    void oneFromTwo() {
        ChangeString ch_str = new ChangeString();
        assertEquals("My name", ch_str.oneFromTwo("My n","ame"));
    }
}