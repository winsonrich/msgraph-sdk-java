// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsSubstituteRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Functions Substitute Request Builder.
 */
public interface IBaseWorkbookFunctionsSubstituteRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsSubstituteRequest
     *
     * @return the IWorkbookFunctionsSubstituteRequest instance
     */
    IWorkbookFunctionsSubstituteRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsSubstituteRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsSubstituteRequest instance
     */
    IWorkbookFunctionsSubstituteRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
