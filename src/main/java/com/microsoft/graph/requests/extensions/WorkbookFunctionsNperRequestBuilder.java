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
 * The class for the Workbook Functions Nper Request Builder.
 */
public class WorkbookFunctionsNperRequestBuilder extends BaseWorkbookFunctionsNperRequestBuilder implements IWorkbookFunctionsNperRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsNper
     *
     * @param requestUrl     the request url
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param rate the rate
     * @param pmt the pmt
     * @param pv the pv
     * @param fv the fv
     * @param type the type
     */
    public WorkbookFunctionsNperRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement rate, final com.google.gson.JsonElement pmt, final com.google.gson.JsonElement pv, final com.google.gson.JsonElement fv, final com.google.gson.JsonElement type) {
        super(requestUrl, client, requestOptions, rate, pmt, pv, fv, type);
    }
}
