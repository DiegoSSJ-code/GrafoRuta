/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.graforuta;

import GrafosPkg.Grafo;
import java.util.Scanner;

/**
 *
 * @author Win10
 */
public class ProcesoRuta {
    public static void munis(){
        String listadoMuni = "LISTADO DE MUNICIPIOS:\n"
                + "\n 1. Jutiapa"
                + "\n 2. Agua Blanca"
                + "\n 3. Asunción Mita"
                + "\n 4. Atescatempa"
                + "\n 5. Comapa"
                + "\n 6. Conguaco"
                + "\n 7. El Adelanto"
                + "\n 8. El Progreso"
                + "\n 9. Jalpatagua"
                + "\n 10. Jerez"
                + "\n 11. Moyuta"
                + "\n 12. Pasaco"
                + "\n 13. Quesada"
                + "\n 14. San José Acatempa"
                + "\n 15. Santa Catarina Mita"
                + "\n 16  Yupiltepeque"
                + "\n 17. Zapotitlán";
        
        System.out.println(listadoMuni);
    }
    public static void Rutear(){
        String rI;
        String rF;
        Scanner t = new Scanner(System.in);
        
        Grafo g = new Grafo("Jutiapa;Agua_Blanca;Asuncion_Mita;Atescatempa;Comapa;Conguaco;"
                  + "El_Adelanto;El_Progreso;Jalpatagua;Jerez;Moyuta;Pasaco;Quesada;San_Jose_Acatempa;"
                  + "Santa_Catarina_Mita;Yupiltepeque;Zapotitlan");
          g.agregarRuta("Jutiapa", "Agua_Blanca", 47);
          g.agregarRuta("Jutiapa", "Asuncion_Mita", 32);
          g.agregarRuta("Jutiapa", "Atescatempa", 38);
          g.agregarRuta("Jutiapa", "Comapa", 44);
          g.agregarRuta("Jutiapa", "Conguaco", 50);
          g.agregarRuta("Jutiapa", "El_Adelanto", 31);
          g.agregarRuta("Jutiapa", "El_Progreso", 15);
          g.agregarRuta("Jutiapa", "Jalpatagua", 42);
          g.agregarRuta("Jutiapa", "Jerez", 39);
          g.agregarRuta("Jutiapa", "Moyuta", 52);
          g.agregarRuta("Jutiapa", "Pasaco", 93);
          g.agregarRuta("Jutiapa", "Quesada", 22);
          g.agregarRuta("Jutiapa", "San_Jose_Acatempa", 36);
          g.agregarRuta("Jutiapa", "Santa_Catarina_Mita", 37);
          g.agregarRuta("Jutiapa", "Yupiltepeque", 23);
          g.agregarRuta("Jutiapa", "Zapotitlan", 33);
          g.agregarRuta("Agua_Blanca", "Asuncion_Mita", 28);
          g.agregarRuta("Agua_Blanca", "Atescatempa", 57);
          g.agregarRuta("Agua_Blanca", "Comapa", 83);
          g.agregarRuta("Agua_Blanca", "Conguaco", 90);
          g.agregarRuta("Agua_Blanca", "El_Adelanto", 71);
          g.agregarRuta("Agua_Blanca", "El_Progreso", 35);
          g.agregarRuta("Agua_Blanca", "Jalpatagua", 80);
          g.agregarRuta("Agua_Blanca", "Jerez", 69);
          g.agregarRuta("Agua_Blanca", "Moyuta", 92);
          g.agregarRuta("Agua_Blanca", "Pasaco", 133);
          g.agregarRuta("Agua_Blanca", "Quesada", 61);
          g.agregarRuta("Agua_Blanca", "San_Jose_Acatempa", 76);
          g.agregarRuta("Agua_Blanca", "Santa_Catarina_Mita", 16);
          g.agregarRuta("Agua_Blanca", "Yupiltepeque", 47);
          g.agregarRuta("Agua_Blanca", "Zapotitlan", 57);
          g.agregarRuta("Asuncion_Mita", "Atescatempa", 30);
          g.agregarRuta("Asuncion_Mita", "Comapa", 68);
          g.agregarRuta("Asuncion_Mita", "Conguaco", 75);
          g.agregarRuta("Asuncion_Mita", "El_Adelanto", 28);
          g.agregarRuta("Asuncion_Mita", "El_Progreso", 20);
          g.agregarRuta("Asuncion_Mita", "Jalpatagua", 65);
          g.agregarRuta("Asuncion_Mita", "Jerez", 42);
          g.agregarRuta("Asuncion_Mita", "Moyuta", 77);
          g.agregarRuta("Asuncion_Mita", "Pasaco", 118);
          g.agregarRuta("Asuncion_Mita", "Quesada", 45);
          g.agregarRuta("Asuncion_Mita", "San_Jose_Acatempa", 61);
          g.agregarRuta("Asuncion_Mita", "Santa_Catarina_Mita", 17);
          g.agregarRuta("Asuncion_Mita", "Yupiltepeque", 20);
          g.agregarRuta("Asuncion_Mita", "Zapotitlan", 30);
          g.agregarRuta("Atescatempa", "Comapa", 76);
          g.agregarRuta("Atescatempa", "Conguaco", 84);
          g.agregarRuta("Atescatempa", "El_Adelanto", 16);
          g.agregarRuta("Atescatempa", "El_Progreso", 49);
          g.agregarRuta("Atescatempa", "Jalpatagua", 74);
          g.agregarRuta("Atescatempa", "Jerez", 12);
          g.agregarRuta("Atescatempa", "Moyuta", 85);
          g.agregarRuta("Atescatempa", "Pasaco", 127);
          g.agregarRuta("Atescatempa", "Quesada", 53);
          g.agregarRuta("Atescatempa", "San_Jose_Acatempa", 69);
          g.agregarRuta("Atescatempa", "Santa_Catarina_Mita", 46);
          g.agregarRuta("Atescatempa", "Yupiltepeque", 15);
          g.agregarRuta("Atescatempa", "Zapotitlan", 17);
          g.agregarRuta("Comapa", "Conguaco", 38);
          g.agregarRuta("Comapa", "El_Adelanto", 66);
          g.agregarRuta("Comapa", "El_Progreso", 51);
          g.agregarRuta("Comapa", "Jalpatagua", 15);
          g.agregarRuta("Comapa", "Jerez", 78);
          g.agregarRuta("Comapa", "Moyuta", 40);
          g.agregarRuta("Comapa", "Pasaco", 81);
          g.agregarRuta("Comapa", "Quesada", 27);
          g.agregarRuta("Comapa", "San_Jose_Acatempa", 38);
          g.agregarRuta("Comapa", "Santa_Catarina_Mita", 72);
          g.agregarRuta("Comapa", "Yupiltepeque", 62);
          g.agregarRuta("Comapa", "Zapotitlan", 71);
          g.agregarRuta("Conguaco", "El_Adelanto", 73);
          g.agregarRuta("Conguaco", "El_Progreso", 58);
          g.agregarRuta("Conguaco", "Jalpatagua", 20);
          g.agregarRuta("Conguaco", "Jerez", 85);
          g.agregarRuta("Conguaco", "Moyuta", 7);
          g.agregarRuta("Conguaco", "Pasaco", 47);
          g.agregarRuta("Conguaco", "Quesada", 34);
          g.agregarRuta("Conguaco", "San_Jose_Acatempa", 45);
          g.agregarRuta("Conguaco", "Santa_Catarina_Mita", 80);
          g.agregarRuta("Conguaco", "Yupiltepeque", 69);
          g.agregarRuta("Conguaco", "Zapotitlan", 79);
          g.agregarRuta("El_Adelanto", "El_Progreso", 42);
          g.agregarRuta("El_Adelanto", "Jalpatagua", 66);
          g.agregarRuta("El_Adelanto", "Jerez", 17);
          g.agregarRuta("El_Adelanto", "Moyuta", 78);
          g.agregarRuta("El_Adelanto", "Pasaco", 119);
          g.agregarRuta("El_Adelanto", "Quesada", 46);
          g.agregarRuta("El_Adelanto", "San_Jose_Acatempa", 62);
          g.agregarRuta("El_Adelanto", "Santa_Catarina_Mita", 44);
          g.agregarRuta("El_Adelanto", "Yupiltepeque", 7);
          g.agregarRuta("El_Adelanto", "Zapotitlan", 6);
          g.agregarRuta("El_Progreso", "Jalpatagua", 48);
          g.agregarRuta("El_Progreso", "Jerez", 51);
          g.agregarRuta("El_Progreso", "Moyuta", 60);
          g.agregarRuta("El_Progreso", "Pasaco", 101);
          g.agregarRuta("El_Progreso", "Quesada", 28);
          g.agregarRuta("El_Progreso", "San_Jose_Acatempa", 43);
          g.agregarRuta("El_Progreso", "Santa_Catarina_Mita", 19);
          g.agregarRuta("El_Progreso", "Yupiltepeque", 34);
          g.agregarRuta("El_Progreso", "Zapotitlan", 34);
          g.agregarRuta("Jalpatagua", "Jerez", 75);
          g.agregarRuta("Jalpatagua", "Moyuta", 22);
          g.agregarRuta("Jalpatagua", "Pasaco", 63);
          g.agregarRuta("Jalpatagua", "Quesada", 24);
          g.agregarRuta("Jalpatagua", "San_Jose_Acatempa", 35);
          g.agregarRuta("Jalpatagua", "Santa_Catarina_Mita", 70);
          g.agregarRuta("Jalpatagua", "Yupiltepeque", 59);
          g.agregarRuta("Jalpatagua", "Zapotitlan", 69);
          g.agregarRuta("Jerez", "Moyuta", 87);
          g.agregarRuta("Jerez", "Pasaco", 128);
          g.agregarRuta("Jerez", "Quesada", 55);
          g.agregarRuta("Jerez", "San_Jose_Acatempa", 71);
          g.agregarRuta("Jerez", "Santa_Catarina_Mita", 58);
          g.agregarRuta("Jerez", "Yupiltepeque", 16);
          g.agregarRuta("Jerez", "Zapotitlan", 18);
          g.agregarRuta("Moyuta", "Pasaco", 41);
          g.agregarRuta("Moyuta", "Quesada", 36);
          g.agregarRuta("Moyuta", "San_Jose_Acatempa", 47);
          g.agregarRuta("Moyuta", "Santa_Catarina_Mita", 81);
          g.agregarRuta("Moyuta", "Yupiltepeque", 71);
          g.agregarRuta("Moyuta", "Zapotitlan", 81);
          g.agregarRuta("Pasaco", "Quesada", 77);
          g.agregarRuta("Pasaco", "Quesada", 88);
          g.agregarRuta("Pasaco", "Quesada", 123);
          g.agregarRuta("Pasaco", "Quesada", 112);
          g.agregarRuta("Pasaco", "Quesada", 122);
          g.agregarRuta("Quesada", "San_Jose_Acatempa", 20);
          g.agregarRuta("Quesada", "Santa_Catarina_Mita", 50);
          g.agregarRuta("Quesada", "Yupiltepeque", 39);
          g.agregarRuta("Quesada", "Zapotitlan", 39);
          g.agregarRuta("San_Jose_Acatempa", "Santa_Catarina_Mita", 65);
          g.agregarRuta("San_Jose_Acatempa", "Yupiltepeque", 54);
          g.agregarRuta("San_Jose_Acatempa", "Zapotitlan", 64);
          g.agregarRuta("Santa_Catarina_Mita", "Yupiltepeque", 37);
          g.agregarRuta("Santa_Catarina_Mita", "Zapotitlan", 47);
          g.agregarRuta("Yupiltepeque", "Zapotitlan", 10);

          System.out.println("Ingrese el municipio del cual va a iniciar su ruta");
          rI = t.next();
          System.out.println("Ingrese el municipio al que quiere llegar");
          rF = t.next();
        String respuesta = g.encontrarRutaMinimaDijkstra(rI, rF);
        System.out.println(respuesta);
    }
}
