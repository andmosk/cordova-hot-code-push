package com.nordnetab.chcp.main.events;

/**
 * Event is sent when an update is about to be updated.
 */
public class BeforeDownloadEvent extends WorkerEvent {

    public static final String EVENT_NAME = "chcp_beforeDownload";

    /**
     * Class constructor.
     */
    public BeforeDownloadEvent() {
        super(EVENT_NAME, null, null);
    }
}
