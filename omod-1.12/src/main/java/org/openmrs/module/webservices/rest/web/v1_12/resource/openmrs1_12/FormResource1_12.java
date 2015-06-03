/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.webservices.rest.web.v1_12.resource.openmrs1_12;

import org.openmrs.Form;
import org.openmrs.module.webservices.rest.web.RequestContext;
import org.openmrs.module.webservices.rest.web.RestConstants;
import org.openmrs.module.webservices.rest.web.annotation.Resource;
import org.openmrs.module.webservices.rest.web.representation.Representation;
import org.openmrs.module.webservices.rest.web.resource.impl.DelegatingCrudResource;
import org.openmrs.module.webservices.rest.web.resource.impl.DelegatingResourceDescription;
import org.openmrs.module.webservices.rest.web.response.ResponseException;

@Resource(name = RestConstants.VERSION_1 + "/form", supportedClass = Form.class, supportedOpenmrsVersions = { "1.12.*" })
public class FormResource1_12 extends DelegatingCrudResource<Form> {

    @Override
    public DelegatingResourceDescription getRepresentationDescription(Representation rep) {
        return null;
    }
	
	@Override
	public String getResourceVersion() {
		return "1.12";
	}
	
	@Override
	public Form newDelegate() {
		return new Form();
	}
	
	@Override
	public Form save(Form delegate) {
		return delegate;
	}
	
	@Override
	public Form getByUniqueId(String uniqueId) {
		Form l = new Form();
		return null;
	}
	
	@Override
	protected void delete(Form delegate, String reason, RequestContext context) throws ResponseException {
	}
	
	@Override
	public void purge(Form delegate, RequestContext context) throws ResponseException {
	}
}
