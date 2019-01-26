package lab51;

public enum Kierunki {

    NORTH ("north", "N", "północ"),
    SOUTH ("south", "S", "południe"),
    EAST ("east", "E", "wschód"),
    WEST("west", "W", "zachód"),
    NORTHEAST ("northeast", "NE", "północny-wschód"),
    NORTHWEST ("northwest", "NW", "północny-zachód"),
    SOUTHEAST ("southeast", "SE", "południowy-wschód"),
    SOUTHWEST("southwest", "SW", "południowy-zachód");



    private String AngielskaNazwa;
    private String Skrót;
    private String PolskaNazwa;

    Kierunki(String angielskaNazwa, String skrót, String polskaNazwa) {
        this.AngielskaNazwa = angielskaNazwa;
        this.Skrót = skrót;
        this.PolskaNazwa = polskaNazwa;
    }

    public String getAngielskaNazwa () { return AngielskaNazwa; }

    public String getSkrót () {return Skrót; }

    public String getPolskaNazwa () { return PolskaNazwa; }

}

