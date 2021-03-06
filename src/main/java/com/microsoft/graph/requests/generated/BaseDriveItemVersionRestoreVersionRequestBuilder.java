// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IDriveItemVersionRestoreVersionRequest;
import com.microsoft.graph.requests.extensions.DriveItemVersionRestoreVersionRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.FunctionOption;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Drive Item Version Restore Version Request Builder.
 */
public class BaseDriveItemVersionRestoreVersionRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this DriveItemVersionRestoreVersion
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseDriveItemVersionRestoreVersionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IDriveItemVersionRestoreVersionRequest
     *
     * @return the IDriveItemVersionRestoreVersionRequest instance
     */
    public IDriveItemVersionRestoreVersionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IDriveItemVersionRestoreVersionRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IDriveItemVersionRestoreVersionRequest instance
     */
    public IDriveItemVersionRestoreVersionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        DriveItemVersionRestoreVersionRequest request = new DriveItemVersionRestoreVersionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
