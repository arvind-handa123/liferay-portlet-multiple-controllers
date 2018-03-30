package com.byteparity.arr.action;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.byteparity.arr.constants.LiferayPortletMultipleControllersPortletKeys;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;


@Component(
	    immediate = true,
	    property = {
	    	"javax.portlet.name=" + LiferayPortletMultipleControllersPortletKeys.PORTLET_ID,
	        "mvc.command.name=/mvc_render_req_url"
	    },
	    service = MVCRenderCommand.class
	)
public class LiferayMVCRenderCommand implements MVCRenderCommand{
	private static final Log _log = LogFactoryUtil.getLog(MVCRenderCommand.class);

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		renderRequest.setAttribute("actionName", "Call Render Request");
		_log.info("Render Request call");
		return null;
	}
}
