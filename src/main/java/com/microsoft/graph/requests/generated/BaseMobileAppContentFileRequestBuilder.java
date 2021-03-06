// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IMobileAppContentFileRequest;
import com.microsoft.graph.requests.extensions.MobileAppContentFileRequest;
import com.microsoft.graph.models.extensions.FileEncryptionInfo;
import com.microsoft.graph.requests.extensions.IMobileAppContentFileCommitRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppContentFileCommitRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppContentFileRenewUploadRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppContentFileRenewUploadRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Mobile App Content File Request Builder.
 */
public class BaseMobileAppContentFileRequestBuilder extends BaseRequestBuilder implements IBaseMobileAppContentFileRequestBuilder {

    /**
     * The request builder for the MobileAppContentFile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseMobileAppContentFileRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IMobileAppContentFileRequest instance
     */
    public IMobileAppContentFileRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IMobileAppContentFileRequest instance
     */
    public IMobileAppContentFileRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new MobileAppContentFileRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IMobileAppContentFileCommitRequestBuilder commit(final FileEncryptionInfo fileEncryptionInfo) {
        return new MobileAppContentFileCommitRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.commit"), getClient(), null, fileEncryptionInfo);
    }

    public IMobileAppContentFileRenewUploadRequestBuilder renewUpload() {
        return new MobileAppContentFileRenewUploadRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.renewUpload"), getClient(), null);
    }
}

