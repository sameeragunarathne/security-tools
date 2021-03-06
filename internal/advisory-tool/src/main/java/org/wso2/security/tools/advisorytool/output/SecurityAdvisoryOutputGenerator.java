/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */
package org.wso2.security.tools.advisorytool.output;

import org.wso2.security.tools.advisorytool.exeption.AdvisoryToolException;
import org.wso2.security.tools.advisorytool.model.SecurityAdvisory;

public interface SecurityAdvisoryOutputGenerator {

    /**
     * Checking whether the data needed for generating the security advisory output is read from
     * a file. e.g., xml, html etc.
     * @return
     */
    boolean isAdvisoryGenerateFromFile();

    /**
     * Generating the security advisory output.
     * @param securityAdvisory
     * @throws AdvisoryToolException
     */
    void generate(SecurityAdvisory securityAdvisory) throws AdvisoryToolException;
}
