// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Network Days_Intl Request.
 */
public class WorkbookFunctionsNetworkDays_IntlRequest extends BaseWorkbookFunctionsNetworkDays_IntlRequest implements IWorkbookFunctionsNetworkDays_IntlRequest {

    /**
     * The request for this WorkbookFunctionsNetworkDays_Intl
     *
     * @param requestUrl     the request url
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookFunctionsNetworkDays_IntlRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
}
