package com.example.Proyecto4;

import com.google.gson.Gson;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Subir Imagen y Descripcion", value = "/Imagen_Iniciar")
@MultipartConfig(fileSizeThreshold = 1024 * 1024, maxFileSize = 1024 * 1024 * 5, maxRequestSize = 1024 * 1024 * 5 * 5)
public class cargaImagenes extends HttpServlet {

    private String imagename;
    private String Descripname;
    private Gson g = new Gson();

    String diregir = "carga.html";

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String nombre = request.getParameter("Barra_Usuario");
        PrintWriter salida = response.getWriter();
        if (!nombre.isEmpty()) {
            response.addCookie(new Cookie("Barra_Usuario", nombre));
            response.sendRedirect(diregir);
            System.out.println("cookie added!");
        } else {
            salida.println("<script type= \"text/Javascript\">");
            salida.println("alert('Datos vacios, Por favor ingrese los datos');");
            salida.println("location='Ventana_Inicio.html';");
            salida.println("</script>");
        }
    }
}
