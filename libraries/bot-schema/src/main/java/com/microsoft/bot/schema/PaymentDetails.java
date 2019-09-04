/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Provides information about the requested transaction.
 */
public class PaymentDetails {
    /**
     * Contains the total amount of the payment request.
     */
    @JsonProperty(value = "total")
    private PaymentItem total;

    /**
     * Contains line items for the payment request that the user agent may
     * display.
     */
    @JsonProperty(value = "displayItems")
    private List<PaymentItem> displayItems;

    /**
     * A sequence containing the different shipping options for the user to
     * choose from.
     */
    @JsonProperty(value = "shippingOptions")
    private List<PaymentShippingOption> shippingOptions;

    /**
     * Contains modifiers for particular payment method identifiers.
     */
    @JsonProperty(value = "modifiers")
    private List<PaymentDetailsModifier> modifiers;

    /**
     * Error description.
     */
    @JsonProperty(value = "error")
    private String error;

    /**
     * Get the total value.
     *
     * @return the total value
     */
    public PaymentItem getTotal() {
        return this.total;
    }

    /**
     * Set the total value.
     *
     * @param withTotal the total value to set
     */
    public void setTotal(PaymentItem withTotal) {
        this.total = withTotal;
    }

    /**
     * Get the displayItems value.
     *
     * @return the displayItems value
     */
    public List<PaymentItem> getDisplayItems() {
        return this.displayItems;
    }

    /**
     * Set the displayItems value.
     *
     * @param withDisplayItems the displayItems value to set
     */
    public void setDisplayItems(List<PaymentItem> withDisplayItems) {
        this.displayItems = withDisplayItems;
    }

    /**
     * Get the shippingOptions value.
     *
     * @return the shippingOptions value
     */
    public List<PaymentShippingOption> getShippingOptions() {
        return this.shippingOptions;
    }

    /**
     * Set the shippingOptions value.
     *
     * @param withShippingOptions the shippingOptions value to set
     */
    public void setShippingOptions(List<PaymentShippingOption> withShippingOptions) {
        this.shippingOptions = withShippingOptions;
    }

    /**
     * Get the modifiers value.
     *
     * @return the modifiers value
     */
    public List<PaymentDetailsModifier> getModifiers() {
        return this.modifiers;
    }

    /**
     * Set the modifiers value.
     *
     * @param withModifiers the modifiers value to set
     */
    public void setModifiers(List<PaymentDetailsModifier> withModifiers) {
        this.modifiers = withModifiers;
    }

    /**
     * Get the error value.
     *
     * @return the error value
     */
    public String getError() {
        return this.error;
    }

    /**
     * Set the error value.
     *
     * @param withError the error value to set
     */
    public void setError(String withError) {
        this.error = withError;
    }
}