package org.will1184.lambda;

import org.will1184.lambda.model.Usuario;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Lambda {
    public static void main(String[] args) {

        Consumer<Date> consumer = fecha ->{
            SimpleDateFormat f = new SimpleDateFormat("dd-MM-yy");
            System.out.println(f.format(fecha));
        };
        consumer.accept(new Date());

        BiConsumer<String,Integer> biConsumer= (nombre,edad)  -> System.out.println(nombre+" tiene "+edad+" anios");
        biConsumer.accept("Brandon",20);

        Consumer<String> consumer1 = System.out::println;
        consumer1.accept("Hello world");

        List<String> list= Arrays.asList("Brandon","William");
        list.forEach(consumer1);

        Consumer <List<String>> consumer2 = System.out::println;
        consumer2.accept(list);

        Usuario usuario = new Usuario();

        BiConsumer<Usuario,String> asignarNombre = (persona,nombre)->{
            persona.setNombre(nombre);
        };
        asignarNombre.accept(usuario,"Brandon");
        System.out.println("Nombre usuario desde Biconsumer: "+ usuario.getNombre());

        BiConsumer<Usuario,String> asignarNombre1  = Usuario::setNombre;
        asignarNombre1.accept(usuario,"Ruben");
        System.out.println("Nombre usuario desde Biconsumer resumido");

        Consumer<String> asignarNombre2 = (nombre)-> usuario.setNombre(nombre);
        asignarNombre2.accept("Juan");
        System.out.println("Nombre usuario desde consumer: "+ usuario.getNombre());

        Supplier<String> proveedor =() ->{
          return "Hola mundo desde Supplier";
        };
        System.out.println(proveedor.get());

    }
}
