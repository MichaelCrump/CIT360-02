import java.io.Serializable;

public class Fabric implements Serializable{
       private int id ;
       private String name;
       private long description;
       private String color;
       public Fabric(){}
       public int getId() {
              return id;
       }
       public void setId(int id) {
              this.id = id;
       }
       public String getName() {
              return name;
       }
       public void setName(String name) {
              this.name = name;
       }
       public long getDescription() {
              return description;
       }
       public void setDescription(long description) {
              this.description = description;
       }
       public String getColor() {
              return color;
       }
       public void setColor(String color) {
              this.color = color;
       }
}