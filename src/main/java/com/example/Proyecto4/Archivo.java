package com.example.Proyecto4;

import java.io.*;
import java.util.ArrayList;

public class Archivo {

    private ObjectInputStream entrada;
    private ObjectOutputStream salida;
    public Archivo(){

    }
    public Archivo(File archivo) {
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
                System.out.println(archivo.getAbsolutePath());
            } catch (IOException e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }else{
            System.out.println(archivo.getAbsolutePath()+" Existe");
        }
    }

    public void escribirEnArchivo(ArrayList<Usuario> usuario, String archivo) {
        try {
            salida = new ObjectOutputStream(new FileOutputStream(archivo));
            salida.writeObject(usuario);
            salida.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Usuario> leerArchivo(File archivo) {
        ArrayList<Usuario> Usuarios = new ArrayList<Usuario>();
        if (archivo.length() != 0) {
            try {
                entrada = new ObjectInputStream(new FileInputStream(archivo));
                Usuarios = (ArrayList<Usuario>) entrada.readObject();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return Usuarios;
    }
}