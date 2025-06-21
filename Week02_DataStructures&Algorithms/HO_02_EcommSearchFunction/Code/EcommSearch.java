import java.util.*;
class Product{
    int productId;
    String productName;
    String category;

    Product(){};

    Product(int productId, String productName, String category){
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    String linearsearch(Product[] array, String searchName){
        for(Product p: array){
            if(p.productName.equalsIgnoreCase(searchName)){
                return "Product found: "+p.productId+" - "+p.productName+" - "+p.category;
            }
        }
        return "Product not found";
    }

    String binarysearch(Product[] array, String searchName){
        int low = 0;
        int high = array.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(array[mid].productName.equalsIgnoreCase(searchName)){
                return "Product found: "+array[mid].productId+" - "+array[mid].productName+" - "+array[mid].category;
            }else if(array[mid].productName.compareToIgnoreCase(searchName) > 0){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return "Product not found";
    }
}
public class EcommSearch {
    public static void main(String[] args) {
        Product[] array = {
            new Product(1, "shirt", "clothes"),
            new Product(2, "pant", "clothes"),
            new Product(3, "shoes", "footwear"),
            new Product(4, "watch", "accessories"),
            new Product(5, "hat", "accessories")
        };

        Product p = new Product();

        Arrays.sort(array, Comparator.comparing(pr->pr.productName));
        System.out.println("Products sorted by name!");

        System.out.println("Searching using linear search:");
        System.out.println(p.linearsearch(array, "shoes"));
        System.out.println("Searching using binary search:");
        System.out.println(p.binarysearch(array, "shoes"));
        System.out.println("Searching using linear search:");
        System.out.println(p.linearsearch(array, "chain"));
        System.out.println("Searching using binary search:");
        System.out.println(p.binarysearch(array, "chain"));
    }
}
