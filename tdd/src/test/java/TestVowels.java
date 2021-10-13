import fr.wildcodeschool.unittesting.StringUtils;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestVowels {

    @Test
    public void testVowels(){

        String str1 = "Bonjour tout le monde ";
        String rep = StringUtils.vowels(str1);
        assertEquals("oououeoe", rep);

    }
    @Test
    public void testUniqueVowels(){

        String str1 = "Bonjour tout le monde ";
        String rep = StringUtils.UniqueWowels(str1);
        assertEquals("oue", rep);

        String str2 = "oooooooooo ";
        String rep2 = StringUtils.UniqueWowels(str2);
        assertEquals("o", rep2);

        String str3 = "oooooooooo zz uuuuuuuuuuuuuuuu";
        String rep3 = StringUtils.UniqueWowels(str3);
        assertEquals("ou", rep3);
    }


}
