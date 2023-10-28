
package com.CarWashGrupo6.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


@Service
public interface FirebaseStorageService {

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

    //El BuketName es el <id_del_proyecto> + ".appspot.com"
    //Info la saco del website, campo de storageBucket
    final String BucketName = "carwash-c78d7.appspot.com";

    //Esta es la ruta básica de este proyecto 
    final String rutaSuperiorStorage = "carwash";

    //Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "firebase";

    //El nombre del archivo Json, le agrego la extension.json y es el rename para copiar nombre
    final String archivoJsonFile = "carwash-c78d7-firebase-adminsdk-yxyl2-b7ee5423db.json";

}

