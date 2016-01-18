public class SObjects {
    public static List<String> getSObjectsList() {
        Map<String, Schema.SObjectType> m =  Schema.getGlobalDescribe();
        System.debug(m.size());
        List<String> listOfSobject = new List<String>(m.keySet());
        For(String str : listOfSobject) {
            System.debug(str);
        }
        return listOfSobject;
    }
}