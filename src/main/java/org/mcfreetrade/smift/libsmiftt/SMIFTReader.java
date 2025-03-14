package org.mcfreetrade.smift.libsmiftt;

import java.io.IOException;
import java.io.InputStream;

public interface SMIFTReader {
    void setStream(InputStream stream);
    String readMessage() throws IOException;
}
