package org.mcfreetrade.smift.libsmiftt;

public interface SMIFTProtocol {
    void loop();
    void addHook(String messageType, SMIFTProtocolHook hook);   
}
