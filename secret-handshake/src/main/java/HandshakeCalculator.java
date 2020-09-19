import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List result = new ArrayList();
        if ((number & 0x01) == 0x01) {
            result.add(Signal.WINK);
        }
        if ((number & 0x02) == 0x02) {
            result.add(Signal.DOUBLE_BLINK);
        }
        if ((number & 0x04) == 0x04) {
            result.add(Signal.CLOSE_YOUR_EYES);
        }
        if ((number & 0x08) == 0x08) {
            result.add(Signal.JUMP);
        }
        if ((number & 0x10) == 0x10) {
            Collections.reverse(result);
        }
        return result;
    }

}
