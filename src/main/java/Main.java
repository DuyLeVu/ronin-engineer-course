import model.entity.AirportCode;

import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    // Create a HashTable to store
    // String values corresponding to integer keys
    Map<Integer, AirportCode> airportCodeHashtable = new HashMap<Integer, AirportCode>();

    // Input the values
    airportCodeHashtable.put(1, new AirportCode(1, "PHA", "Phan Rang Airport"));
    airportCodeHashtable.put(2, new AirportCode(2, "HPH", "Catbi Airport"));
    airportCodeHashtable.put(3, new AirportCode(3, "DAD", "Da Nang Airport"));
    airportCodeHashtable.put(4, new AirportCode(4, "SGN", "Tan Son Nhat International Airport"));
    airportCodeHashtable.put(5, new AirportCode(5, "HAN", "Noibai International Airport"));
    airportCodeHashtable.put(6, new AirportCode(6, "DLI", "Lienkhang Airport"));
    airportCodeHashtable.put(7, new AirportCode(7, "CXR", "Nha Trang Airport"));
    airportCodeHashtable.put(8, new AirportCode(8, "UIH", "Qui Nhon Airport"));
    airportCodeHashtable.put(9, new AirportCode(9, "VII", "Vinh City Airport"));
    airportCodeHashtable.put(10, new AirportCode(10, "PQC", "\tDuong Dong Airport"));

    // Printing the Hashtable
//    System.out.println(airportCodeHashtable.get(1).getId());
    airportCodeHashtable.forEach((Integer, airportCode) -> System.out.println(airportCode.getCode()));

  }
}
