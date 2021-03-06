// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Report Root Get Skype For Business Peer To Peer Activity Minute Counts Request Builder.
 */
public interface IBaseReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequest
     *
     * @return the IReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequest instance
     */
    IReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequest buildRequest();

    /**
     * Creates the IReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequest instance
     */
    IReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
