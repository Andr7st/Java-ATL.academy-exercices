package org.andr7st.sb.app.entities;

//import javax.persistence.*;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "productos")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre")
    private String name;

    @Column(name = "precio")
    private float price;

    @Column(name = "descripcion")
    private String description;

    public Article() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Article(Integer id) {
        this.id = id;
    }

    public Article(Integer id, String name, String description, float price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Article article = (Article) o;

        if (Float.compare(article.price, price) != 0) return false;
        if (!Objects.equals(id, article.id)) return false;
        if (!Objects.equals(name, article.name)) return false;
        return Objects.equals(description, article.description);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (price != +0.0f ? Float.floatToIntBits(price) : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
