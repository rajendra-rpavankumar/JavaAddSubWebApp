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
public class processServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action=request.getParameter("action");
        String op1=request.getParameter("op1");
        String op2=request.getParameter("op2");

        if(op1.equals("")||op2.equals("")){
            RequestDispatcher dispatcher=request.getRequestDispatcher("/index.jsp");
            dispatcher.forward(request, response);
            return;
        }
        request.setAttribute("op1", op1);
        request.setAttribute("op2", op2);

        if(action.equals("subtract")){
            RequestDispatcher dispatcher=request.getRequestDispatcher("/sub");
            dispatcher.forward(request, response);

        }
        if(action.equals("add")){
            RequestDispatcher dispatcher=request.getRequestDispatcher("/add");
            dispatcher.forward(request, response);
        }
    }
}
