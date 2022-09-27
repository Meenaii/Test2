package com.pmo.test.servlet;

import com.atlassian.plugin.spring.scanner.annotation.imports.ComponentImport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.atlassian.templaterenderer.TemplateRenderer;

import javax.inject.Inject;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Test1 extends HttpServlet{
    private static final Logger log = LoggerFactory.getLogger(Test1.class);
    @ComponentImport
    private final TemplateRenderer templateRenderer;

    @Inject
    public Test1(TemplateRenderer templateRenderer) {
      this.templateRenderer = templateRenderer;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        resp.setContentType("text/html");
        resp.getWriter().write("<html><body>Hello World</body></html>");
    }

}