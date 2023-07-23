package org.example;

import java.io.*;

public class InputStream_outputStream_copiando_archivo {
    public static void main(String[] args) {
        copyFiles("/home/arbe/Desktop/Practices-on-java/Archivo_de_entrada.txt","/home/arbe/Desktop/Practices-on-java/Archivo_de_salida.txt");
    }
    static void copyFiles(String entrada,String salida){

        try {
            //Instaciamos variables de para poder abrir los archivos
            FileInputStream fis = new FileInputStream(entrada);
            BufferedInputStream bis = new BufferedInputStream(fis);
            //Creamos instancias para crear el archivo que sera copia de otro
            FileOutputStream fos = new FileOutputStream(salida);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            PrintStream ps =new PrintStream(bos);
            //Leemos el archivo y copiamos la informacion
            byte[] buffer = new byte[1024];//guardamos lo datos en memoria mientras los copiamos
            int metadatos;
            while((metadatos = bis.read(buffer)) !=-1){
            ps.write(buffer,0,metadatos);
            }
            // Cerrar flujos
            bos.close();
            bis.close();

            System.out.println("archivo copiado correctamente");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
