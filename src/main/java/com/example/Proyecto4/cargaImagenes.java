package com.example.Proyecto4;

import com.google.gson.Gson;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(name = "Subir Imagen y Descripcion", value = "/Imagen_Iniciar")
@MultipartConfig(fileSizeThreshold = 1024 * 1024, maxFileSize = 1024 * 1024 * 5, maxRequestSize = 1024 * 1024 * 5 * 5)
public class cargaImagenes extends HttpServlet {

    private String imagename;
    private String Descripname;
    private Gson g = new Gson();
}
