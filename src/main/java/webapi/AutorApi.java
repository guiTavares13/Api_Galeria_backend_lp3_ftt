package webapi;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.AutorDao;

import java.io.IOException;
import java.sql.Date;

import beans.Autor;

/**
 * Servlet implementation class AutorApi
 */
public class AutorApi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AutorApi() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		System.out.println("Client get - " + new Date(0));

		// TODO Auto-generated method stub
		Autor a = new Autor();
		
		// Note que getParamtere retorna string, 
		// a conversão é feita na classe Client (seters)
		
		a.setId(request.getParameter("id"));
		a.setName(request.getParameter("nome"));
		a.setDescricao(request.getParameter("descricao"));
		
		
		AutorDao AutorDao = new AutorDao();
		
		AutorDao.insert(a);

        //TODO: Gerenciar e propagar erro...		
		
		//System.out.println(request.getContentLength());
		
		if (request.getContentLength() < 1) {
			response.getWriter().append("{\"count\":"  + "}");
		} else {
			response.getWriter().append("Autor Criado...");
		} //if
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
