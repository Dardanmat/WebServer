package it.fi.itismeucci;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

//prima parte
// 1 (1-2) deserializzare XML
// 2 (3-4) serializzare l'oggetto ottenuto con XML e trasformarlo in JSON

// 3 deserializzazione JSON
// 4 serializzare l'oggetto ottenuto con JSON e trasformarlo in XML

public class Converter {

    private static File ROOT = JavaHTTPServer.WEB_ROOT;

    //PER IL PUNTO 1
    public static root convert_XML_to_classe (String fileName){
        XmlMapper xmlMapper = new XmlMapper();
        
        try {
            root r = xmlMapper.readValue(fileToString("xml/" + fileName), root.class);
            return r;
        } catch (JsonMappingException e) {
            System.out.println("Errore di JasonMapping da XML a classe");
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            System.out.println("Errore di JsonProcessing da XML a classe");
            e.printStackTrace();
        }

        return null;
    }

    //PER IL PUNTO 2
    public static String convert_root_to_JSON (root r){
        ObjectMapper om = new ObjectMapper();
        try {
            return om.writeValueAsString(r);
        } catch (JsonProcessingException e) {
            System.out.println("Errore di JsonProcessing da root a JSON");
            e.printStackTrace();
        }
        return null;
    }

    //PER IL PUNTO 3
    public static PuntiVendita convert_JSON_to_PuntoVendita (String fileName){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            PuntiVendita puntiVendita = objectMapper.readValue(new File(ROOT, "json/" + fileName), PuntiVendita.class);
            return puntiVendita;
        } catch (StreamReadException e) {
            System.out.println("Errore di Stream Reade");
            e.printStackTrace();
        } catch (DatabindException e) {
            System.out.println("Errore di databind");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Errore di I/O");
            e.printStackTrace();
        }

        return null;
    }
    
    //PER IL PUNTO 4
    public static String convert_PuntiVendita_to_XML (PuntiVendita pv){

        XmlMapper xmlMapper = new XmlMapper();
        try {
            String xml = xmlMapper.writeValueAsString(pv);
            return xml;
        } catch (JsonProcessingException e) {
            System.out.println("Errore nella conversione da PuntiVendita a XML");
            e.printStackTrace();
        }
        
        return null;
    }
    
    public static String fileToString (String path){

        File file = new File(ROOT, path);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Errore nel trovare il file da convertire");
            e.printStackTrace();
        }

        String text = "";
        while(scanner.hasNextLine()){
            text += scanner.nextLine().trim();
        }

        return text;
    }

}
