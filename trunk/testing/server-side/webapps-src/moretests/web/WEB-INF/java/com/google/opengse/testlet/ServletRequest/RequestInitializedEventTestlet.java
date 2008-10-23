// Copyright 2008 Google Inc. All Rights Reserved.

package com.google.opengse.testlet.ServletRequest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Works in conjunction with MyServletRequestListener
 *
 * @author Mike Jennings
 */
public class RequestInitializedEventTestlet extends HttpServlet {
  @Override
  protected void service(HttpServletRequest request,
      HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/plain");
    PrintWriter out = response.getWriter();
    String message = (String)request.getAttribute("requestIntializedEvent");
    if (message == null) {
      out.println("FAILED: no attribute found");
    } else {
      out.println(message);
    }
  }
}
