class Exercise1{
    public static void main(String[] args) {
        CountryHashSet countryset=new CountryHashSet();
        countryset.saveCountryNames("India");
        countryset.saveCountryNames("USA");
        countryset.saveCountryNames("Germany");
        countryset.saveCountryNames("England");
        countryset.saveCountryNames("France");
        countryset.saveCountryNames("Russia");
        countryset.saveCountryNames("Japan");
        System.out.println(countryset.getCountry("India"));
        System.out.println(countryset.getCountry("Italy"));
        System.out.println(countryset.getCountry("France"));
        System.out.println(countryset.getCountry("China"));
    }
}