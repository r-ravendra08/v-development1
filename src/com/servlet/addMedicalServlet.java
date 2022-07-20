package com.servlet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.dao.UserDao;
import com.model.Medical;


@WebServlet("/addMedicalServlet")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 10, maxFileSize = 1024 * 1024 * 50, maxRequestSize = 1024 * 1024 * 50)
public class addMedicalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    Medical md=new Medical();
	UserDao ud=new UserDao();
    
    public addMedicalServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String process = request.getParameter("process");
		String distance = request.getParameter("distance");
		Part part = request.getPart("file");
		String diwas = request.getParameter("diwas");
		String type = request.getParameter("type");
		Date date = new Date();

		md.setName(name);
		md.setAddress(address);
		md.setProcess(process);
		md.setDistance(distance);
		md.setImages(part.getSubmittedFileName());
		md.setStaphana(diwas);
		md.setType(type);
		md.setDate(date);

		ud.saveMedical(md);

		try {
			String path = request.getRealPath("images") + File.separator + "Simage" + File.separator + part.getSubmittedFileName();
			System.out.println(path);

			FileOutputStream fos = new FileOutputStream(path);
			InputStream is = part.getInputStream();

			byte[] data = new byte[is.available()];

			is.read(data);

			fos.write(data);

			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		 pw.println("<script type=\"text/javascript\">");
		 pw.println("alert('Medical Services Added...');");
		 pw.println("location='addschool.jsp';");
		 pw.println("</script>");

	}

}
