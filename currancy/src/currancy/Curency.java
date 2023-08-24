package currancy;

import java.util.Locale;
import java.util.Currency;

public class Curency {

	public static void main(String[] args) {
			Locale locale = Locale.getDefault();
			Currency v = Currency.getInstance(locale);
			System.out.println(locale);
			System.out.println(Locale.getAvailableLocales().toString());
			
			/*Currency c = Currency.getInstance(Locale.GERMANY);
			System.out.println(c.getCurrencyCode());
			System.out.println(c.getSymbol());
			System.out.println(c.getDisplayName());*/
			
			System.out.println(Locale.getDefault());
			System.out.println(v.getCurrencyCode());
			System.out.println(v.getDisplayName());
			System.out.println(v.getSymbol());
		}

}
