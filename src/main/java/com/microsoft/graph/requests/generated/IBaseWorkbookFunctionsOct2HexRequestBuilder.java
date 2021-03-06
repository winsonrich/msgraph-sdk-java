// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsOct2HexRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Functions Oct2Hex Request Builder.
 */
public interface IBaseWorkbookFunctionsOct2HexRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsOct2HexRequest
     *
     * @return the IWorkbookFunctionsOct2HexRequest instance
     */
    IWorkbookFunctionsOct2HexRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsOct2HexRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsOct2HexRequest instance
     */
    IWorkbookFunctionsOct2HexRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
