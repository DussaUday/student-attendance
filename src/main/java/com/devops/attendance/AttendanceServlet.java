package com.devops.attendance;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AttendanceServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String studentName = request.getParameter("studentName");
        String date = request.getParameter("date");
        String status = request.getParameter("status"); // Present / Absent

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Attendance Result</title></head><body>");
        out.println("<h2>Student Attendance Marked</h2>");
        out.println("<p><b>Name:</b> " + studentName + "</p>");
        out.println("<p><b>Date:</b> " + date + "</p>");
        out.println("<p><b>Status:</b> " + status + "</p>");
        out.println("<a href='index.jsp'>Back</a>");
        out.println("</body></html>");
    }
}
