package com.andr7st.sb.app.controllers;

import com.andr7st.sb.app.entities.Category;
import com.andr7st.sb.app.entities.Question;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//import java.util.ArrayList;
//import java.util.List;

@RestController
public class TriviaController {

    @GetMapping("/question/{type}")
    public Question getQuestion(@PathVariable String type) {

        Question pregunta = new Question();

        pregunta.setCategory("Atrte");
        pregunta.setQuestion("¿Quíen pintó \"La Gioconda\"?");
        pregunta.setAnswer(1);
        pregunta.setExplanation("La pintura; también conocida como \"La Mona Lisa\" fue pintada por Leonardo da Vinci (Se cree que fue exactamente en el año 1503).");

        String[] opciones = new String[3];
        opciones[0] = "Miguel Ángel.";
        opciones[1] = "Leonardo da Vinci";
        opciones[2] = "Juana de Arco.";

//        // Creando un arrayList
//        List<String> optionsArrayList = new ArrayList<>();
//        // por cada opción agregar
//        optionsArrayList.add("- Cerveza, lima/limón, sal, chile en polvo, salsa tipo inglesa, picante.");
//        optionsArrayList.add("Cerveza, lima/limón y limon");
//        optionsArrayList.add("Cerveza, sal, tabasco y lima/limón");
//
//        // sobreescribe los datos de opciones
//        for (int i=0; i<numeroDeOpciones; i++) {
//            opciones[i] = optionsArrayList.get(i);
//        }

        pregunta.setOptions(opciones);

        return pregunta;
    }

    @GetMapping("/categories")
    public Category[] getCategories() {

        Category cat1 = new Category();
        cat1.setCategory("Deporte");
        cat1.setDescription("Preguntas de deportes");

        Category cat2 = new Category();
        cat2.setCategory("Ciencia");
        cat2.setDescription("Preguntas de ciencias");

        Category[] categories = new Category[2];
        categories[0] = cat1;
        categories[1] = cat2;

        return categories;
    }
}
