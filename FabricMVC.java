public class Fabric {
   private String itemNo;
   private String name;
   
   public String getItemNo() {
      return itemNo;
   }
   
   public void setItemNo(String itemNo) {
      this.itemNo = itemNo;
   }
   
   public String getName() {
      return name;
   }
   
   public void setName(String name) {
      this.name = name;
   }
}

public class FabricView {
   public void printFabricDetails(String fabricName, String fabricItemNo){
      System.out.println("Fabric: ");
      System.out.println("Name: " + fabricName);
      System.out.println("Item No: " + fabricItemNo);
   }
}

public class FabricController {
   private Fabric model;
   private FabricView view;

   public FabricController(Fabric model, FabricView view){
      this.model = model;
      this.view = view;
   }

   public void setFabricName(String name){
      model.setName(name);		
   }

   public String getFabricName(){
      return model.getName();		
   }

   public void setFabricItemNo(String itemNo){
      model.setItemNo(itemNo);		
   }

   public String getFabricItemNo(){
      return model.getItemNo();		
   }

   public void updateView(){				
      view.printFabricDetails(model.getName(), model.getItemNo());
   }	
}

public class MVCPattern {
   public static void main(String[] args) {

      //fetch Fabric record based on Item number from the database
      Fabric model  = retrieveFabricFromDatabase();

      //Create a view to write Fabric details on console
      FabricView view = new FabricView();

      FabricController controller = new FabricController(model, view);

      controller.updateView();

      //update model data
      controller.setFabricName("Satin");

      controller.updateView();
   }

   private static Fabric retrieveFabricFromDatabase(){
      Fabric fabric = new Fabric();
      fabric.setFabric("Satin");
      fabric.setItemNo("1000");
      return fabric;
   }
}