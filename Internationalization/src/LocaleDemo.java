import java.util.Locale;
public class LocaleDemo {
    public static void main(String[] args){
      Locale L = Locale.getDefault();
      System.out.println(L.getCountry() +"......." + L.getLanguage() );
      System.out.println(L.getDisplayCountry()+ "......" + L.getDisplayLanguage());
        Locale l1 = new Locale("pn","in");
      System.out.println(L.getCountry() +"......." + L.getLanguage() );
      System.out.println(L.getDisplayCountry()+ "......" + L.getDisplayLanguage());
      String [] s1 = Locale.getISOCountries();
      for (String s : s1){
          System.out.println(s);
      }
        String [] s2 = Locale.getISOLanguages();

        for (String s : s2){
          System.out.println(s);
      }

    }
}
