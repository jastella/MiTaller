package es.fabricaweb.www.mitaller.clases;

import android.util.JsonReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jorge on 25/07/2016.
 */
public class JsonParseUsuario {

    public List<cUsuario> readJsonStream (InputStream in) throws IOException {

        JsonReader reader = new JsonReader(new InputStreamReader(in,"UTF-8"));
        try {
            return leerArrayUsuarios(reader);
        } finally {
            reader.close();
        }
    }

    public List leerArrayUsuarios(JsonReader reader) throws IOException {

        ArrayList usuarios = new ArrayList();

        reader.beginArray();

        while (reader.hasNext()) {
            usuarios.add(leerUsuario(reader));
        };

        reader.endArray();
        return usuarios;

    }

    public cUsuario leerUsuario(JsonReader  reader) throws IOException {

        Integer idUsuario = null;
        String usuario = null;
        String clave = null;
        String dni = null;
        String nombres = null;
        String apellidos = null;
        String direccion = null;
        String codigoPostal = null;
        String localidad = null;
        String provincia = null;
        String email = null;
        String estado = null;

        reader.beginObject();

        while (reader.hasNext()) {

            String name = reader.nextName();

            switch (name) {
                case "idUsuario":
                    idUsuario = reader.nextInt();
                    break;
                case "usuario":
                    usuario = reader.nextString();
                    break;
                case "clave":
                    clave = reader.nextString();
                    break;
                case "dni":
                    dni = reader.nextString();
                    break;
                case "nombres":
                    nombres = reader.nextString();
                    break;
                case "apellidos":
                    apellidos = reader.nextString();
                    break;
                case "direccion":
                    direccion = reader.nextString();
                    break;
                case "codigoPostal":
                    codigoPostal = reader.nextString();
                    break;
                case "localidad":
                    localidad = reader.nextString();
                    break;
                case "provincia":
                    provincia = reader.nextString();
                    break;
                case "email":
                    email = reader.nextString();
                    break;
                case "estado":
                    estado = reader.nextString();
                    break;
                default:
                    reader.skipValue();
                    break;
            }
        }
        reader.endObject();

        return new cUsuario(apellidos,clave,codigoPostal,direccion,dni,email,estado,idUsuario,localidad,nombres,provincia,usuario);

    }

}
