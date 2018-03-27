<?xml version = "1.0" encoding = "utf-8"?>
<!DOCTYPE hibernate-mapping PUBLIC 
"-//Hibernate/Hibernate Mapping DTD//EN"
"http://www.hibernate.org/dtd/hibernate-mapping-3.0.dtd"> 

<hibernate-mapping>
   <class name = "Fabric" table = "FABRIC">
      
      <meta attribute = "class-description">
         This class contains the fabric detail. 
      </meta>
      
      <id name = "id" type = "int" column = "id">
         <generator class="native"/>
      </id>
      
      <property name = "type1" column = "type1" type = "string"/>
      <property name = "type2" column = "type2" type = "string"/>
      <property name = "size" column = "size" type = "int"/>
      
   </class>
</hibernate-mapping>

