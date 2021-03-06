// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsWeekNumRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsWeekNumRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.FunctionOption;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Functions Week Num Request Builder.
 */
public class BaseWorkbookFunctionsWeekNumRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsWeekNum
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param serialNumber the serialNumber
     * @param returnType the returnType
     */
    public BaseWorkbookFunctionsWeekNumRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement serialNumber, final com.google.gson.JsonElement returnType) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("serialNumber", serialNumber);
        bodyParams.put("returnType", returnType);
    }

    /**
     * Creates the IWorkbookFunctionsWeekNumRequest
     *
     * @return the IWorkbookFunctionsWeekNumRequest instance
     */
    public IWorkbookFunctionsWeekNumRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsWeekNumRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsWeekNumRequest instance
     */
    public IWorkbookFunctionsWeekNumRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsWeekNumRequest request = new WorkbookFunctionsWeekNumRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("serialNumber")) {
            request.body.serialNumber = getParameter("serialNumber");
        }

        if (hasParameter("returnType")) {
            request.body.returnType = getParameter("returnType");
        }

        return request;
    }
}
