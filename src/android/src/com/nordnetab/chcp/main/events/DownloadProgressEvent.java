package com.nordnetab.chcp.main.events;

import org.apache.cordova.LOG;

import java.util.Collections;
import java.util.Map;

/**
 * Event is sent when an update is being downloaded and progress is reported.
 */
public class DownloadProgressEvent extends WorkerEvent {

    public static final String EVENT_NAME = "chcp_downloadProgress";

    /**
     * Class constructor.
     */
    public DownloadProgressEvent(float progress) {
        super(EVENT_NAME, null, null);

        data().put("progress", Float.valueOf(progress));
    }
}
