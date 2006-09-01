/*
 * $Id$
 *
 * Copyright 2006 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.struts2.components;

import com.opensymphony.xwork2.util.OgnlValueStack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <!-- START SNIPPET: javadoc -->
 *
 * Render action errors if they exists the specific layout of the rendering depends on
 * the theme itself.
 *
 * <!-- END SNIPPET: javadoc -->
 *
 * <p/> <b>Examples</b>
 *
 * <pre>
 * <!-- START SNIPPET: example -->
 *
 *    &lt;s:actionerror /&gt;
 *    &lt;s:form .... &gt;>
 *       ....
 *    &lt;/s:form&gt;
 *
 * <!-- END SNIPPET: example -->
 * </pre>
 *
 * @s.tag name="actionerror" tld-body-content="empty" tld-tag-class="org.apache.struts2.views.jsp.ui.ActionErrorTag"
 * description="Render action errors if they exists"
 */
public class ActionError extends UIBean {

    public static final String TEMPLATE = "actionerror";


    public ActionError(OgnlValueStack stack, HttpServletRequest request, HttpServletResponse response) {
        super(stack, request, response);
    }

    protected String getDefaultTemplate() {
        return TEMPLATE;
    }

}
