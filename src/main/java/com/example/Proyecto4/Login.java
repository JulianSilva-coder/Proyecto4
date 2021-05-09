package com.example.Proyecto4;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Inicio de Sesion", value = "/Iniciar")
public class Login extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String diregir = "carga.html";

        String nombre = request.getParameter("Barra_Usuario");
        PrintWriter salida = response.getWriter();
        if(!nombre.isEmpty()){
            response.addCookie(new Cookie("Barra_Usuario", nombre));
            response.sendRedirect(diregir);
        }else{
            salida.println("<script type= \"text/Javascript\">");
            salida.println("alert('Datos vacios, Por favor ingrese los datos');");
            salida.println("location='Ventana_Inicio.html';");
            salida.println("</script>");
        }
    }
    }