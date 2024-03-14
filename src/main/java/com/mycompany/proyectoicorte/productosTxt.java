package com.mycompany.proyectoicorte;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

    
public class productosTxt {
    public static void main(String[] args) throws IOException {
        //aqui estamos creando un nuevo archivo txt
        File archivo = new File ("C:\\Users\\juan.hernandez\\Desktop\\ProyectoICorte\\Productos.txt");
        BufferedWriter bw;
        //validamos si el archivo existe
        if (!archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
        }
        principal p = new principal();
        p.setLocationRelativeTo(null);
        p.setVisible(true);
    }
  
}
