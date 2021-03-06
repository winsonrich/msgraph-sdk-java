// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsArabicRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Functions Arabic Request Builder.
 */
public interface IBaseWorkbookFunctionsArabicRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsArabicRequest
     *
     * @return the IWorkbookFunctionsArabicRequest instance
     */
    IWorkbookFunctionsArabicRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsArabicRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsArabicRequest instance
     */
    IWorkbookFunctionsArabicRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
