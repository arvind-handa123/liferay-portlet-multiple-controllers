package com.byteparity.arr.action;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

import com.byteparity.arr.constants.LiferayPortletMultipleControllersPortletKeys;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;


@Component(
	    immediate = true,
	    property = {
	    	"javax.portlet.name=" + LiferayPortletMultipleControllersPortletKeys.PORTLET_ID,
	        "mvc.command.name=/mvc_resource_req_url"
	    },
	    service = MVCResourceCommand.class
	)
public class LiferayMVCResourceCommand implements MVCResourceCommand{
	private static final Log _log = LogFactoryUtil.getLog(MVCRenderCommand.class);

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		
		try {
			resourceResponse.getWriter().println("Call Resource Request");
			_log.info("Call Resource Request");
		} catch (IOException e) {
			_log.error(e.getMessage());
		}
		return true;
	}
}
