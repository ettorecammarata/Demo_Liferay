package com.liferay.demo_portlet.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import org.osgi.service.component.annotations.Component;


@Component(immediate = true,
        property = {
        "com.liferay.portlet.display-category=category.CUSTOMA", // vedere a che servono ste configurazioni
        "com.liferay.portlet.header-portlet-css=/css/main.css",
        "com.liferay.portlet.instanceable=true",
        "javax.portlet.display-name=TiSaliPortlet",// vedere a che servono ste configurazioni
        "javax.portlet.init-param.template-path=/",
        "javax.portlet.init-param.view-template=/view.jsp",
        "javax.portlet.name=#####################",// vedere a che servono ste configurazioni
        "javax.portlet.resource-bundle=content.Language",
        "javax.portlet.security-role-ref=power-user,user" },  // vedere a che servono ste configurazioni
        service = DemoPortlet.class)

public class DemoPortlet extends MVCPortlet {


}
