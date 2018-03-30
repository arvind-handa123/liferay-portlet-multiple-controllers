package com.byteparity.arr.action;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;

import com.byteparity.arr.constants.LiferayPortletMultipleControllersPortletKeys;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;

@Component(
	    immediate = true,
	    property = {
	    	"javax.portlet.name=" + LiferayPortletMultipleControllersPortletKeys.PORTLET_ID,
	        "mvc.command.name=mvc_action_req_url"
	    },
	    service = MVCActionCommand.class
	)
public class LiferayMVCActionCommand implements MVCActionCommand{
	private static final Log _log = LogFactoryUtil.getLog(MVCRenderCommand.class);

	@Override
	public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {

		String action = ParamUtil.getString(actionRequest, "action");
		actionRequest.setAttribute("actionName",action);
		_log.info("Action Request call");
		return true;
		
	}
}
