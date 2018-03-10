public class Fabric {
   private int id;
   private String type1; 
   private String type2;   
   private int size;  

   public Fabric() {}
   public Fabric(String t1, String t2, int size) {
      this.type1 = t1;
      this.type2 = t2;
      this.size = size;
   }
   
   public int getId() {
      return id;
   }
   
   public void setId( int id ) {
      this.id = id;
   }
   
   public String getType1() {
      return typ1;
   }
   
   public void setType1( String type1 ) {
      this.type1 = type1;
   }
   
   public String getType2() {
      return typ2;
   }
   
   public void setType2( String type2 ) {
      this.type2 = type2;
   }
   
   public int getSize() {
      return size;
   }
   
   public void setSize( int size ) {
      this.size = size;
   }
}