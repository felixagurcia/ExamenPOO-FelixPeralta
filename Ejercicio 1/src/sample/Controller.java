package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Controller {
    public TextField txtOracion;
    public Button boton;
    FileOutputStream salida;



    public void hiceClic(ActionEvent actionEvent) throws IOException {


        String Oracion = txtOracion.getText();

        String palabras[] = Oracion.split(" ");

        int tamaioArreglo = palabras.length;

        if(tamaioArreglo<10){
            JOptionPane.showMessageDialog(null,"Ingrese 10 palabras");
        }else if (tamaioArreglo>=10){

            try {
                String cadena = "C:\\Users\\ASUS\\IdeaProjects\\Ejercicio 1\\POO.txt";
                salida = new FileOutputStream(cadena);

                byte[] datos;
                datos = txtOracion.getText().getBytes();
                salida.write(datos);
                salida.close();
                JOptionPane.showMessageDialog(null,"Exitoso!!");
            }catch (IOException e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }

    }
}
