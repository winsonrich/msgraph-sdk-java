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
 * The class for the Workbook Functions Price Disc Request Builder.
 */
public class WorkbookFunctionsPriceDiscRequestBuilder extends BaseWorkbookFunctionsPriceDiscRequestBuilder implements IWorkbookFunctionsPriceDiscRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsPriceDisc
     *
     * @param requestUrl     the request url
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param settlement the settlement
     * @param maturity the maturity
     * @param discount the discount
     * @param redemption the redemption
     * @param basis the basis
     */
    public WorkbookFunctionsPriceDiscRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement settlement, final com.google.gson.JsonElement maturity, final com.google.gson.JsonElement discount, final com.google.gson.JsonElement redemption, final com.google.gson.JsonElement basis) {
        super(requestUrl, client, requestOptions, settlement, maturity, discount, redemption, basis);
    }
}
