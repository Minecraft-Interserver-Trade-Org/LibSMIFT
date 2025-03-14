package org.mcfreetrade.smift.libsmiftt;

public interface SMIFTProtocolHook {
    SMIFTMessage handle(SMIFTMessage message);
}
