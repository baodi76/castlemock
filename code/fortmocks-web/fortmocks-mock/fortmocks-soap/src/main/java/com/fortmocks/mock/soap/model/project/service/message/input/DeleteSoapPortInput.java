package com.fortmocks.mock.soap.model.project.service.message.input;

import com.fortmocks.core.model.Input;
import com.fortmocks.core.model.validation.NotNull;

/**
 * @author Karl Dahlgren
 * @since 1.0
 */
public class DeleteSoapPortInput implements Input{

    @NotNull
    private Long soapProjectId;
    @NotNull
    private Long soapPortId;

    public DeleteSoapPortInput(Long soapProjectId, Long soapPortId) {
        this.soapProjectId = soapProjectId;
        this.soapPortId = soapPortId;
    }

    public Long getSoapProjectId() {
        return soapProjectId;
    }

    public void setSoapProjectId(Long soapProjectId) {
        this.soapProjectId = soapProjectId;
    }

    public Long getSoapPortId() {
        return soapPortId;
    }

    public void setSoapPortId(Long soapPortId) {
        this.soapPortId = soapPortId;
    }
}