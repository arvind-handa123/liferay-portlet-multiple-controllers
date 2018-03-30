package com.byteparity.arr.portlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

import com.byteparity.arr.constants.LiferayPortletMultipleControllersPortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

/**
 * @author baps
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category="+LiferayPortletMultipleControllersPortletKeys.PORTLET_CATEGORY,
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name="+LiferayPortletMultipleControllersPortletKeys.PORTLET_DISPLAY_NAME,
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + LiferayPortletMultipleControllersPortletKeys.PORTLET_ID,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class LiferayPortletMultipleControllers extends MVCPortlet {
}