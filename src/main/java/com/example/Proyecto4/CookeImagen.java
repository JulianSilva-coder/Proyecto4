package com.example.Proyecto4;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name ="Cookie_Img", value = "/Imagen_Iniciar")
class CookieImagenes extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {


        String dire="Ventana_Inicio.html";
        String dire2 ="Carga.html";
        String img = request.getParameter("image");
        PrintWriter out = response.getWriter();


        if (!img.isEmpty()){
            System.out.println(img);
            response.addCookie(new Cookie("img",img));
        }else {


            out.println("<script type=\"text/javascript\">");
            out.println("alert('Por favor ingrese una imagen');");
            out.println("location='Carga.html';");
            out.println("</script>");

        }
    }

}
