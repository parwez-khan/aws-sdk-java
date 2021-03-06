/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/DeleteDataflowEndpointGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteDataflowEndpointGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * ID of a dataflow endpoint group.
     * </p>
     */
    private String dataflowEndpointGroupId;

    /**
     * <p>
     * ID of a dataflow endpoint group.
     * </p>
     * 
     * @param dataflowEndpointGroupId
     *        ID of a dataflow endpoint group.
     */

    public void setDataflowEndpointGroupId(String dataflowEndpointGroupId) {
        this.dataflowEndpointGroupId = dataflowEndpointGroupId;
    }

    /**
     * <p>
     * ID of a dataflow endpoint group.
     * </p>
     * 
     * @return ID of a dataflow endpoint group.
     */

    public String getDataflowEndpointGroupId() {
        return this.dataflowEndpointGroupId;
    }

    /**
     * <p>
     * ID of a dataflow endpoint group.
     * </p>
     * 
     * @param dataflowEndpointGroupId
     *        ID of a dataflow endpoint group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDataflowEndpointGroupRequest withDataflowEndpointGroupId(String dataflowEndpointGroupId) {
        setDataflowEndpointGroupId(dataflowEndpointGroupId);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDataflowEndpointGroupId() != null)
            sb.append("DataflowEndpointGroupId: ").append(getDataflowEndpointGroupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDataflowEndpointGroupRequest == false)
            return false;
        DeleteDataflowEndpointGroupRequest other = (DeleteDataflowEndpointGroupRequest) obj;
        if (other.getDataflowEndpointGroupId() == null ^ this.getDataflowEndpointGroupId() == null)
            return false;
        if (other.getDataflowEndpointGroupId() != null && other.getDataflowEndpointGroupId().equals(this.getDataflowEndpointGroupId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataflowEndpointGroupId() == null) ? 0 : getDataflowEndpointGroupId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteDataflowEndpointGroupRequest clone() {
        return (DeleteDataflowEndpointGroupRequest) super.clone();
    }

}
