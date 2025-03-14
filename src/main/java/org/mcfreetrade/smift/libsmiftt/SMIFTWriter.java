package org.mcfreetrade.smift.libsmiftt;

import java.io.IOException;
import java.io.OutputStream;

public interface SMIFTWriter {
    void setStream(OutputStream stream);
    void write(SMIFTMessage message) throws IOException;
}
