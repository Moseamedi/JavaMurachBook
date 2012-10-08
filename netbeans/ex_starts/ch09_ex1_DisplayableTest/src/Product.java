import java.text.NumberFormat;

public class Product 
{
    private String code;
    private String description;
    private double price;

    public Product()
    {
        this.code = "";
        this.description = "";
        this.price = 0;
    }

    public Product(String code, String description, double price)
    {
        this.code = code;
        this.description = description;
        this.price = price;
    }
    
    @Override
    public void getDisplayText(){
        String code = getCode();
        String desc = getDescription();
        String price = getFormattedPrice();
        System.out.print(code);
        System.out.print(" | ");
        System.out.print(desc);
        System.out.print(" | ");
        System.out.println(price);

    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getCode(){
        return code;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public double getPrice()
    {
        return price;
    }

    public String getFormattedPrice()
    {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }

}
