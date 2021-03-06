/*
* Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package org.wso2.carbon.identity.api.server.fetch.remote.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;
import javax.validation.Valid;
import javax.xml.bind.annotation.*;

public class PushEventWebHookPOSTRequestPusher  {
  
    private String name;
    private String email;

    /**
    **/
    public PushEventWebHookPOSTRequestPusher name(String name) {

        this.name = name;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("name")
    @Valid
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    /**
    **/
    public PushEventWebHookPOSTRequestPusher email(String email) {

        this.email = email;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("email")
    @Valid
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }



    @Override
    public boolean equals(java.lang.Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PushEventWebHookPOSTRequestPusher pushEventWebHookPOSTRequestPusher = (PushEventWebHookPOSTRequestPusher) o;
        return Objects.equals(this.name, pushEventWebHookPOSTRequestPusher.name) &&
            Objects.equals(this.email, pushEventWebHookPOSTRequestPusher.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class PushEventWebHookPOSTRequestPusher {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
    * Convert the given object to string with each line indented by 4 spaces
    * (except the first line).
    */
    private String toIndentedString(java.lang.Object o) {

        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n");
    }
}

