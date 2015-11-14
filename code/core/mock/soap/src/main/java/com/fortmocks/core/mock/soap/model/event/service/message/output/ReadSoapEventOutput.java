package com.fortmocks.core.mock.soap.model.event.service.message.output;

import com.fortmocks.core.basis.model.Output;
import com.fortmocks.core.mock.soap.model.event.dto.SoapEventDto;

/**
 * @author Karl Dahlgren
 * @since 1.0
 */
public class ReadSoapEventOutput implements Output {

    private SoapEventDto soapEvent;

    public ReadSoapEventOutput(SoapEventDto soapEvent) {
        this.soapEvent = soapEvent;
    }

    public SoapEventDto getSoapEvent() {
        return soapEvent;
    }

    public void setSoapEvent(SoapEventDto soapEvent) {
        this.soapEvent = soapEvent;
    }
}