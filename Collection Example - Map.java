import java.util.*;  
class MapInterfaceFabric{  
 public static void main(String args[]){  
  Map<Integer,String> map=new HashMap<Integer,String>();  
  map.put(100,"Silk");  
  map.put(101,"Satin");  
  map.put(102,"Linen");
  map.put(103,"Wool");
  map.put(104,"Flannel");  
  for(Map.Entry m:map.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
}  