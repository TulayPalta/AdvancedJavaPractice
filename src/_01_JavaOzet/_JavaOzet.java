package _01_JavaOzet;

public class _JavaOzet {
    public static void main(String[] args) {
        /*
        todo :    mavi yazmak için kullanılıyor
        Ctrl D:   Satır kopyalama
        Alt seç:  çoklu seçim
        \’		tek tırnak
        \”		çift tırnak
        \\		ters slaş
        \t		parağraf başı kadar boşluk (sekme) bırakır
        \n		alt satıra geçirir

        todo Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.

		 1) \\d    ==> tum rakamlar         0->9
		  	 \\D    ==> tum rakam disi character ler  0->9    _ disindaki hersey
		 2) \\w   ==> A->Z		a->z
		 	 \\W  ==> A->Z		a->z		tum harf disi character ler
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey
	 */
// _______________________________________________________________________________________________________________________________

        // todo replace()
        String txt = "Merhaba Dunya";
        System.out.println("orjinal hali = " + txt); //orjinal hali = Merhaba Dunya
        System.out.println("butun a ların nın degistigi hali = " + txt.replace("a", "e"));
        // butun a ların nın degistigi hali = Merhebe Dunye
        System.out.println("ilk bulunan a nın degistigi hali = " + txt.replaceFirst("a", "e"));
        // ilk bulunan a nın degistigi hali = Merheba Dunya
        System.out.println("----------");

        // todo replaceAll()
        String numara = "$1800 Milyon";
        System.out.println("REPLACEaLL METODU>>>> " + numara.replaceAll("[a-zA-Z]", "")); //$1800
        System.out.println("REPLACEaLL METODU>>>> " + numara.replaceAll("[0-9]", "")); //$ Milyon
        System.out.println("----------");
// _______________________________________________________________________________________________________________________________
        /*todo  startsWith()
          Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
          todo endsWith()
          Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         */
        String ad = "Bahadir";
        System.out.println("metin Ba ile basliyor mu? >>>> " + ad.startsWith("Ba")); //true
        System.out.println("metin -dir ile bitiyor mu? >>>> " + ad.endsWith("dir")); //true
        System.out.println("----------");
// _______________________________________________________________________________________________________________________________
         /*todo Integer.valueOf()
         rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
         Stringlerle matematiksel islemler yapabilmemizi saglar.
        todo valueOf()
        hem Integer wrapper classinin icinde hem de String'in icinde var. Integer wrapper classinin icinde
        olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i String'e cevirir.
         */
// _______________________________________________________________________________________________________________________________
        // todo kelimenin -> sayiya cevrilmesi
        String girilenKelime = "65";
        int girilenSayi = 65;
        int girilenKelimeninSayiHali = Integer.parseInt(girilenKelime); // donusecek tipe uygun donusum
        short shortDeger = Short.parseShort(girilenKelime);
        double oran = Double.parseDouble(girilenKelime);
// _______________________________________________________________________________________________________________________________
        //todo TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
        String text = "What's up?";
        boolean boslukVarMi = text.contains(" ");
        System.out.println("boslukVarMi = " + boslukVarMi); //boslukVarMi = true
// _______________________________________________________________________________________________________________________________
        /*todo TASK : Kullanıcıdan alacağınız, 3 kelimedne oluşan ismi
         Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız. */
        String adAd2Soyad = "Ahmet Emin Yılmaz".toUpperCase();
        //en kısa kod:
        System.out.println(adAd2Soyad.charAt(0) + "." + adAd2Soyad.charAt(adAd2Soyad.indexOf(" ") + 1) + "." + adAd2Soyad.charAt(adAd2Soyad.lastIndexOf(" ") + 1) + ".");
        //A.E.Y.
        // _______________________________________________________________________________________________________________________________

       /*todo reverse() : terten yazdırma
        */
        StringBuffer metin = new StringBuffer("Java harika");
        StringBuffer metinters=metin.reverse();
        System.out.println(metinters);
    }
}