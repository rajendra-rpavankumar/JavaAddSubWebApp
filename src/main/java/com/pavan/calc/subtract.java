package com.pavan.calc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Pavan Kumar on 14/07/2017.
 */
public class subtract extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int op1=Integer.parseInt((String)request.getAttribute("op1"));
        int op2=Integer.parseInt((String)request.getAttribute("op2"));
        int result=op1-op2;

        request.setAttribute("result",new Integer(result));
        RequestDispatcher dispatcher=request.getRequestDispatcher("/index.jsp");
        dispatcher.forward(request, response);
        return;
    }
}
