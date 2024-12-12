package model;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class OrderingPizzaModel {

    @NotNull(message = "Please select a pizza")
    @NotEmpty(message = "You need to select a pizza")
    private String selectPizza;

    @NotEmpty(message = "Must choose pizza size")
    @NotNull (message = "Please select a pizza size")
    private String pizzaSize;

    @Min(value = 1, message = "You must order at least 1 pizza.")
    @Max(value = 10, message = "You cannot order more than 10 pizzas.")
    @NotNull(message = "Please indicate how many pizza's you would like to order")
    private int pizzaQuantity;

    public String getSelectPizza() {
        return selectPizza;
    }
    public void setSelectPizza(String selectPizza) {
        this.selectPizza = selectPizza;
    }
    public String getPizzaSize() {
        return pizzaSize;
    }
    public void setPizzaSize(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }
    public int getPizzaQuantity() {
        return pizzaQuantity;
    }
    public void setPizzaQuantity(int pizzaQuantity) {
        this.pizzaQuantity = pizzaQuantity;
    }

    @Override
    public String toString() {
        return "PizzaModel{" +
                "selectPizza='" + selectPizza + '\'' +
                ", pizzaSize='" + pizzaSize + '\'' +
                ", pizzaQuantity=" + pizzaQuantity +
                '}';
    }

}
