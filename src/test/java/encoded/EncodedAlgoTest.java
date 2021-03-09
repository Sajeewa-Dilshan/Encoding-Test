package encoded;

import org.junit.Test;

import static org.junit.Assert.*;

public class EncodedAlgoTest {

    @Test
    public void encoding() {
        EncodedAlgo e=new EncodedAlgo();
        assertTrue(e.encoding("AAABBAADDBBBCCCCFFF"));

    }
}
