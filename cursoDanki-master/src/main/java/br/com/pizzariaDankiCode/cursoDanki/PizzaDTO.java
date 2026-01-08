package br.com.pizzariaDankiCode.cursoDanki;


import br.com.pizzariaDankiCode.cursoDanki.pizza.Categoria;
import br.com.pizzariaDankiCode.cursoDanki.pizza.Sabor;
import br.com.pizzariaDankiCode.cursoDanki.pizza.Tamanho;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class PizzaDTO {

    private Long id;
    @NotBlank
    private String nome;
    @Positive
    private double preco;
    private boolean disponivel;
    private Tamanho tamanho;
    private Sabor sabor;
    private Categoria categoria;
}
