import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class BinaryNumberTest {

  @ParameterizedTest
  @ValueSource(strings = {
          "1",
          "0",
          "1111111111111111111111111111111",
          "1010101",
          "000001"
  })
  void isValidBinary_ShouldReturnTrue(String input)  {
    BinaryNumber n = new BinaryNumber(input);
    boolean actual = n.isValidBinary();
    assertTrue(actual);
  }

  @ParameterizedTest
  @ValueSource(strings = {
          "1.5",
          "2",
          "1111111111111111111111111111111111111",
          "abr",
          "!@##$$%^%^&&*()_+",
          " ",
          "'"
  })
  void isValidBinary_ShouldReturnFalse(String input)  {
    BinaryNumber n = new BinaryNumber(input);
    boolean actual = n.isValidBinary();
    assertFalse(actual);
  }

  @Test
  void extractDemFromBin0() {
    BinaryNumber n = new BinaryNumber("0");
    int actual = n.extractDemFromBin();
    assertEquals(0, actual);
  }

  @Test
  void extractDemFromBinMaxInt() {
    BinaryNumber n = new BinaryNumber("1111111111111111111111111111111");
    int actual = n.extractDemFromBin();
    assertEquals(2147483647, actual);
  }
}