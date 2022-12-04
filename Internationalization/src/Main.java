import java.util.Locale;
public class Main {
    public static void main(String[] args) {


        Locale l1 = new Locale("English"); // This Constructor is used to create a Locale with language English.
        Locale l2 = new Locale("pa","in");// This Constructor is used to create a Locale Object with language Punjabi and country India.
        Locale l3 = Locale.getDefault();

        System.out.println(l1.getDisplayLanguage());
        System.out.println(l2.getDisplayCountry());
        System.out.println(l2.getDisplayLanguage());
        System.out.println(l3.getDisplayCountry());
        System.out.println(l3.getDisplayLanguage());



/*
        Locale l1 = new Locale("Korean");
        System.out.println(Locale.getDefault());
        System.out.println(Locale.getAvailableLocales());
        Locale.setDefault(l1);
        System.out.println(Locale.getDefault());
*/
         /*
        String [] array1 = Locale.getISOCountries();
        String [] array2  = Locale.getISOLanguages();
        Locale [] loca = Locale.getAvailableLocales();
        for (String e : array1){
            System.out.println(e);
        }
        for (String e : array2){
            System.out.println(e);
        }

          */

    }
}