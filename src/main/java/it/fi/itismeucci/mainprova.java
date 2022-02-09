package it.fi.itismeucci;

import java.io.File;

public class mainprova {
    public static void main(String[] args) {

        String fileRequested = "/classe.xml";
        String salt = "/xml";
        File WEB_ROOT = new File("./src/main/resources");

        File file = new File(WEB_ROOT, salt + fileRequested);

        System.out.println(file.exists());

        /*
        //PUNTI 1 & 2

        //1 - TEST da XML a oggetto classe (root): funziona
        root r = Converter.convert_XML_to_classe("classe.xml");
        //System.out.println(r.getClasse());

        //2 - TEST da oggetto classe (root) a JSON: funziona
        System.out.println(Converter.convert_root_to_JSON(r));
        */

        //PUNTI 3 & 4

        //3 - TEST da JSON a oggetto PuntiVendita: funziona
        //PuntiVendita p = Converter.convert_JSON_to_PuntoVendita("puntiVendita.json");
        /*System.out.println("Size: " + p.getSize());
        int i = 0;
        for (PuntoVendita pv : p.getListaRisultati()) {
            i++;
            System.out.println( i + ". Denom. :" + pv.getDenominazione());
        }*/

        //4 - TEST da oggetto PuntiVendita a XML: funziona
        /*String text = Converter.convert_PuntiVendita_to_XML(p);
        System.out.println(text);*/
    }
}
