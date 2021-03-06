// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.UploadSession;
import com.microsoft.graph.requests.extensions.IDriveItemCreateUploadSessionRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Drive Item Create Upload Session Request.
 */
public interface IBaseDriveItemCreateUploadSessionRequest {

    void post(final ICallback<UploadSession> callback);

    UploadSession post() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDriveItemCreateUploadSessionRequest select(final String value) ;

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IDriveItemCreateUploadSessionRequest top(final int value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDriveItemCreateUploadSessionRequest expand(final String value);

}
