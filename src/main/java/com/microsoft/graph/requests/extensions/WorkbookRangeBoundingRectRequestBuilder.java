// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookRangeBoundingRectRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Range Bounding Rect Request Builder.
 */
public class WorkbookRangeBoundingRectRequestBuilder extends BaseWorkbookRangeBoundingRectRequestBuilder implements IWorkbookRangeBoundingRectRequestBuilder {

    /**
     * The request builder for this WorkbookRangeBoundingRect
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param anotherRange the anotherRange
     */
    public WorkbookRangeBoundingRectRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String anotherRange) {
        super(requestUrl, client, requestOptions, anotherRange);
    }
}
