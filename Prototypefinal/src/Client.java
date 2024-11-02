
public class Client{
    public static void main(String[] args) {
       
        PrototypeRegistry registry = new PrototypeRegistry();

        
        ClothingProduct shirt = new ClothingProduct("T-Shirt", "Clothing", 19.99, "M", "Red");
        ElectronicProduct phone = new ElectronicProduct("Smartphone", "Electronics", 599.99, 128, 24);

        
        registry.addPrototype("Shirt", shirt);
        registry.addPrototype("Phone", phone);

       
        System.out.println("Original Shirt: " + shirt);
        System.out.println("Original Phone: " + phone);

        
        ClothingProduct clonedShirt = (ClothingProduct) registry.getPrototype("Shirt");
        if (clonedShirt != null) {
            clonedShirt.setSize("L");
            clonedShirt.setColor("Blue");
            clonedShirt.setPrice(21.99);  
            System.out.println("Cloned & Customized Shirt: " + clonedShirt);
        }

        ElectronicProduct clonedPhone = (ElectronicProduct) registry.getPrototype("Phone");
        if (clonedPhone != null) {
            clonedPhone.setStorage(256);
            clonedPhone.setPrice(649.99);  
            System.out.println("Cloned & Customized Phone: " + clonedPhone);
        }
    }
}
