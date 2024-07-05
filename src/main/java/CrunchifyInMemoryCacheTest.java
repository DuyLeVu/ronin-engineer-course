import config.CrunchifyInMemoryCache;
import model.entity.AirportCode;

/**
 * @author Crunchify.com
 * How to Create a Simple In Memory Cache in Java (Lightweight Cache)
 */
public class CrunchifyInMemoryCacheTest {
  public static void main(String[] args) {
    CrunchifyInMemoryCacheTest crunchifyCache = new CrunchifyInMemoryCacheTest();
    crunchifyPrint("==========Test1: crunchifyTestAddRemoveObjects ==========");
    crunchifyCache.crunchifyTestAddRemoveObjects();

//    crunchifyPrint("\n\n==========Test2: crunchifyTestExpiredCacheObjects ==========");
//    crunchifyCache.crunchifyTestExpiredCacheObjects();
//
//    crunchifyPrint("\n\n==========Test3: crunchifyTestObjectsCleanupTime ==========");
//    crunchifyCache.crunchifyTestObjectsCleanupTime();
  }

  private void crunchifyTestAddRemoveObjects() {
    // Test with crunchifyTimeToLive = 200 seconds
    // crunchifyTimerInterval = 500 seconds
    // maxItems = 10
    CrunchifyInMemoryCache<String, AirportCode> cache = new CrunchifyInMemoryCache<String, AirportCode>(200, 500, 10 );
    cache.put("PHA", new AirportCode(1, "PHA", "Phan Rang Airport"));
    cache.put("HPH", new AirportCode(2, "HPH", "Catbi Airport"));
    cache.put("DAD", new AirportCode(3, "DAD", "Da Nang Airport"));
    cache.put("SGN", new AirportCode(4, "SGN", "Tan Son Nhat International Airport"));
    cache.put("HAN", new AirportCode(5, "HAN", "Noibai International Airport"));
    cache.put("DLI", new AirportCode(6, "DLI", "Lienkhang Airport"));
    cache.put("CXR", new AirportCode(7, "CXR", "Nha Trang Airport"));
    cache.put("UIH", new AirportCode(8, "UIH", "Qui Nhon Airport"));
    cache.put("VII", new AirportCode(9, "VII", "Vinh City Airport"));
    cache.put("PQC", new AirportCode(10, "PQC", "Duong Dong Airport"));
    crunchifyPrint("10 Cache Object Added.. cache.size(): " + cache.size());
    cache.remove("PHA");
    crunchifyPrint("One object removed.. cache.size(): " + cache.size());
    cache.put("DIN", new AirportCode(11, "DIN", "Dien Bien Airport"));
    cache.put("VCS", new AirportCode(12, "VCS", "Coong Airport"));
    crunchifyPrint("Two objects Added but reached maxItems.. cache.size(): " + cache.size());
    crunchifyPrint("Key DIN has value: " + cache.get("DIN"));
    crunchifyPrint("Key VCS has value: " + cache.get("VCS").getName());
//    crunchifyPrint("Key VCS has value: " + cache.get("PHA").getName());
    crunchifyPrint("Key VCS has value: " + cache.get("HPH").getName());
  }

  private static void crunchifyPrint(String s) {
    System.out.println(s);
  }
}
