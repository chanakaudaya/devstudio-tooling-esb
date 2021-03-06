/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.developerstudio.esb.form.editors.article.rcp;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.widgets.*;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.wso2.developerstudio.eclipse.gmf.esb.ArtifactType;
import org.wso2.developerstudio.esb.forgm.editors.article.FormArticlePlugin;
import org.wso2.developerstudio.esb.form.editors.article.rcp.endpoints.EndpointFormPage;
import org.wso2.developerstudio.esb.form.editors.article.rcp.endpoints.AddressEndpointFormPage;
import org.wso2.developerstudio.esb.form.editors.article.rcp.endpoints.DefaultEndpointFormPage;
import org.wso2.developerstudio.esb.form.editors.article.rcp.endpoints.HttpEndpointFormPage;
import org.wso2.developerstudio.esb.form.editors.article.rcp.endpoints.WsdlEndpointFormPage;

/**
 * A simple multi-page form editor that uses Eclipse Forms support. Example
 * plug-in is configured to create one instance of form colors that is shared
 * between multiple editor instances.
 */
public class ESBFormEditor extends FormEditor {

	ArtifactType artifactType;
	FormPage currFormPage = null;

	public ESBFormEditor(ArtifactType artifactType) {
		this.artifactType = artifactType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.forms.editor.FormEditor#createToolkit(org.eclipse.swt.
	 * widgets.Display)
	 */
	protected FormToolkit createToolkit(Display display) {
		// Create a toolkit that shares colors between editors.
		return new FormToolkit(FormArticlePlugin.getDefault().getFormColors(PlatformUI.getWorkbench().getDisplay()));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.forms.editor.FormEditor#addPages()
	 */
	protected void addPages() {
		try {
			if (currFormPage == null) {
				assignCurrPage();
			}
			addPage(currFormPage);
		} catch (PartInitException e) {
			//
		}
	}

	private void assignCurrPage() {
		if (artifactType == ArtifactType.LOCAL_ENTRY) {
			currFormPage = new LocalEntryFormPage(this);
		} else if (artifactType == ArtifactType.MESSAGE_PROCESSOR) {
			currFormPage = new MessageProcessorFormPage(this);
		} else if (artifactType == ArtifactType.MESSAGE_STORE) {
			currFormPage = new MessageStoreFormPage(this);
		} else if (artifactType == ArtifactType.TASK) {
			currFormPage = new ScheduledTaskFormPage(this);
		} else if (artifactType == ArtifactType.TEMPLATE_ENDPOINT_DEFAULT) {
			currFormPage = new DefaultEndpointFormPage(this);
		} else if (artifactType == ArtifactType.TEMPLATE_ENDPOINT_ADDRESS) {
			currFormPage = new AddressEndpointFormPage(this);
		} else if (artifactType == ArtifactType.TEMPLATE_ENDPOINT_WSDL) {
			currFormPage = new WsdlEndpointFormPage(this);
		} else if (artifactType == ArtifactType.TEMPLATE_ENDPOINT_HTTP) {
			currFormPage = new HttpEndpointFormPage(this);
//		} else if (artifactType == ArtifactType.ENDPOINT) {
//			currFormPage = new EndpointFormPage(this);
		} else if (artifactType == ArtifactType.ENDPOINT_ADDRESS) {
			currFormPage = new AddressEndpointFormPage(this);
		}else if (artifactType == ArtifactType.ENDPOINT_DEFAULT) {
			currFormPage = new DefaultEndpointFormPage(this);
		}else if (artifactType == ArtifactType.ENDPOINT_HTTP) {
			currFormPage = new HttpEndpointFormPage(this);
		}else if (artifactType == ArtifactType.ENDPOINT_WSDL) {
			currFormPage = new WsdlEndpointFormPage(this);
		}
	}

	public FormPage getFormPageForArtifact(ArtifactType artifactType) {
		if (currFormPage == null) {
			assignCurrPage();
		}
		return currFormPage;

	}
	


	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.ISaveablePart#doSave(org.eclipse.core.runtime.
	 * IProgressMonitor)
	 */
	public void doSave(IProgressMonitor monitor) {
		/*
		 * if (p == null) { return; } updateState(getEditorInput());
		 * validateState(getEditorInput()); performSave(false, monitor);
		 */
	}

	private void performSave(boolean b, IProgressMonitor monitor) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.ISaveablePart#doSaveAs()
	 */
	public void doSaveAs() {
	}

	@Override
	protected void createPages() {
		super.createPages();
		if (getPageCount() == 1 && getContainer() instanceof CTabFolder) {
			((CTabFolder) getContainer()).setTabHeight(0);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.ISaveablePart#isSaveAsAllowed()
	 */
	public boolean isSaveAsAllowed() {
		return false;
	}
}