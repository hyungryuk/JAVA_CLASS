package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */

public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init ȣ���");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroy ȣ���");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("### "+request.getMethod()+"����� �� ȣ��");
		//��û ������ ����
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		String nameValue = request.getParameter("name");		
		//��� ��Ʈ�� ����

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>������Ʈ��"+request.getQueryString()+"</h1>");
		out.println("<h1>"+nameValue+"</h1>");
		out.println("</body>");
		out.println("</html>");
		out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(">>> "+request.getMethod()+"������� ȣ��");
		request.setCharacterEncoding("utf-8");
		String userId = request.getParameter("userId");
		String ageStr = request.getParameter("age");
		int age = Integer.parseInt(ageStr)+1;
		
		response.setContentType("text/xml;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		out.println("<userId>"+userId+"</userId>");
		out.println("<age>"+age+"</age>");		
		out.close();
	}

	@Override
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String userId = request.getParameter("userId");
		String ageStr = request.getParameter("age");
		int age = Integer.parseInt(ageStr)+1;
		
		response.setContentType("application/json;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("{\"userId\":"+userId+",");
		out.println("\"age\":"+age+"}");		
		out.close();
	}
	

}