package org.sitemesh.grails.plugins.sitemesh3;

import org.springframework.web.servlet.handler.AbstractHandlerMapping;
import org.springframework.web.servlet.mvc.ParameterizableViewController;

import javax.servlet.http.HttpServletRequest;

public class GrailsLayoutHandlerMapping extends AbstractHandlerMapping {

    public GrailsLayoutHandlerMapping() {
        setOrder(-6);
    }

    @Override
    protected Object getHandlerInternal(HttpServletRequest request) {
        if (request.getRequestURI().startsWith("/layouts")) {
            ParameterizableViewController pvc = new ParameterizableViewController();
            pvc.setViewName(request.getRequestURI());
            return pvc;
        }
        return null;
    }
}